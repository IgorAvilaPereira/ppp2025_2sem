### 🏢 Cenário: Sistema de Formulários para RH

Imagine que você está desenvolvendo um sistema que gera **formulários** para diferentes processos de RH:

* Admissão
* Demissão
* Férias
* Avaliação de desempenho
* Promoção
* Transferência
* Afastamento
* Estágio
* Efetivação
* Plano de carreira
* Etc...

### 🔥 Inicialmente:

Você cria uma subclasse para cada tipo de formulário:

```java
public class AdmissionForm extends Form { ... }
public class TerminationForm extends Form { ... }
public class VacationForm extends Form { ... }
// ... e assim por diante
```

Cada uma muda **apenas os campos do formulário** (ex: "Cargo", "Data de entrada", "Motivo", "Período").

### ⚠️ Problema:

* 10+ subclasses que só mudam dados (campos, título, layout)
* Dificuldade para criar versões semelhantes (ex: Férias com e sem aprovação prévia)
* Duplicação de código

---

## ✅ Solução com o padrão **Prototype**

Crie **uma única classe `Form`**, e use **protótipos** para representar os diferentes tipos.

Você define:

* Nome do formulário
* Lista de campos
* Se tem aprovação
* Layout base
* Política associada (opcional)

---

## 🛠️ Exemplo rápido em Java

### `Form.java`

```java
import java.util.ArrayList;
import java.util.List;

public class Form implements Cloneable {
    private String title;
    private List<String> fields;
    private boolean requiresApproval;

    public Form(String title, List<String> fields, boolean requiresApproval) {
        this.title = title;
        this.fields = new ArrayList<>(fields);
        this.requiresApproval = requiresApproval;
    }

    @Override
    public Form clone() {
        try {
            Form clone = (Form) super.clone();
            clone.fields = new ArrayList<>(this.fields); // clone profundo da lista
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void addField(String field) {
        this.fields.add(field);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("📄 " + title + " | Aprovação: " + (requiresApproval ? "Sim" : "Não"));
        System.out.println("Campos: " + fields);
    }
}
```

---

### `FormRegistry.java`

```java
import java.util.HashMap;
import java.util.Map;

public class FormRegistry {
    private static Map<String, Form> forms = new HashMap<>();

    public static void register(String key, Form form) {
        forms.put(key, form);
    }

    public static Form create(String key) {
        Form prototype = forms.get(key);
        return (prototype != null) ? prototype.clone() : null;
    }
}
```

---

### `Main.java`

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Protótipos
        Form admissao = new Form("Formulário de Admissão", Arrays.asList("Nome", "Cargo", "Data de Início"), true);
        Form ferias = new Form("Pedido de Férias", Arrays.asList("Nome", "Período", "Justificativa"), false);
        Form avaliacao = new Form("Avaliação de Desempenho", Arrays.asList("Nome", "Cargo", "Nota", "Observações"), true);

        FormRegistry.register("admissao", admissao);
        FormRegistry.register("ferias", ferias);
        FormRegistry.register("avaliacao", avaliacao);

        // Criando variações
        Form feriasUrgente = FormRegistry.create("ferias");
        feriasUrgente.setTitle("Pedido de Férias (Urgente)");
        feriasUrgente.addField("Motivo da urgência");

        Form admissaoEstagiario = FormRegistry.create("admissao");
        admissaoEstagiario.setTitle("Formulário de Estágio");
        admissaoEstagiario.addField("Instituição de Ensino");

        // Impressão
        admissao.print();
        System.out.println();
        feriasUrgente.print();
        System.out.println();
        admissaoEstagiario.print();
    }
}
```

---

## 🧠 Por que **isso é uma explosão evitável de subclasses**?

| Se fosse com subclasses...                                                                             | Com Prototype                       |
| ------------------------------------------------------------------------------------------------------ | ----------------------------------- |
| `AdmissaoComTreinamentoForm`, `AdmissaoEstagiarioForm`, `FeriasUrgenteForm`, `FeriasInternacionalForm` | Tudo é apenas uma instância clonada |
| Duplicação de lógica em cada subclasse                                                                 | Lógica centralizada                 |
| Dificuldade de manter                                                                                  | Simples e escalável                 |

---

## 🧩 Outros exemplos com potencial de explosão evitável:

| Domínio        | Protótipo ideal                                           |
| -------------- | --------------------------------------------------------- |
| **E-commerce** | Produtos com variações (tamanho, cor, edição limitada)    |
| **Jogos**      | Inimigos, NPCs, armas com variações mínimas               |
| **UI/UX**      | Componentes visuais com tema e estilo diferentes          |
| **Educação**   | Modelos de certificados, provas, formulários de inscrição |

---



