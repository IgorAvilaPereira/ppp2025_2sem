# Template Method

O **padrão Template Method** é um padrão de projeto **comportamental** que define o esqueleto de um algoritmo em uma **classe base (abstrata)** e permite que as **subclasses implementem partes específicas** desse algoritmo sem alterar sua estrutura geral.

---

### 📌 Quando usar?

* Quando várias classes compartilham a mesma estrutura de algoritmo, mas alguns passos devem ser implementados de forma diferente por cada uma.
* Quando você quer evitar duplicação de código entre classes com comportamentos semelhantes.

---

### 🧠 Estrutura do Template Method

1. **Classe Abstrata** define o método "template" com os passos do algoritmo.
2. **Alguns passos são implementados na própria classe base** (métodos concretos).
3. **Outros passos são deixados para as subclasses implementarem** (métodos abstratos ou "hooks").

---

### ✅ Exemplo

```java

// Classe abstrata que define o Template Method
abstract class ProcessadorDeDocumento {

    // Método template
    public final void processar() {
        abrirDocumento();
        lerConteudo();
        processarConteudo();
        fecharDocumento();
    }

    protected void abrirDocumento() {
        System.out.println("Abrindo o documento...");
    }

    protected void fecharDocumento() {
        System.out.println("Fechando o documento...");
    }

    // Métodos abstratos a serem implementados pelas subclasses
    protected abstract void lerConteudo();
    protected abstract void processarConteudo();
}

// Subclasse concreta para PDF
class ProcessadorPDF extends ProcessadorDeDocumento {
    @Override
    protected void lerConteudo() {
        System.out.println("Lendo conteúdo do PDF...");
    }

    @Override
    protected void processarConteudo() {
        System.out.println("Processando conteúdo do PDF...");
    }
}

// Subclasse concreta para Word
class ProcessadorWord extends ProcessadorDeDocumento {
    @Override
    protected void lerConteudo() {
        System.out.println("Lendo conteúdo do Word...");
    }

    @Override
    protected void processarConteudo() {
        System.out.println("Processando conteúdo do Word...");
    }
}

// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        ProcessadorDeDocumento pdf = new ProcessadorPDF();
        pdf.processar();

        System.out.println("----");

        ProcessadorDeDocumento word = new ProcessadorWord();
        word.processar();
    }
}
```
---

### 🧠 O que está acontecendo aqui?

* A classe `ProcessadorDeDocumento` define o **template method** `processar()`, que representa a sequência de passos do algoritmo.
* Os métodos `lerConteudo()` e `processarConteudo()` são **abstratos**, ou seja, **devem ser implementados pelas subclasses**.
* As classes `ProcessadorPDF` e `ProcessadorWord` personalizam essas etapas conforme o tipo de documento.

---

### 🧩 Benefícios

* **Reutilização de código**.
* **Separação clara** entre estrutura e implementação.
* Facilita a manutenção e extensão.

---

### ⚠️ Cuidados

* Pode resultar em uma hierarquia de classes muito extensa.
* Pode ser inflexível se a estrutura do algoritmo precisar mudar frequentemente.


Ótima escolha! Vamos agora **adaptar o exemplo de processamento de documentos** usando o padrão **Template Method** com **hooks opcionais**.

---

### 🧩 hooks

No padrão Template Method, **hooks** são métodos definidos na superclasse que:

* Têm **implementações padrão vazias ou simples**.
* **Podem ser sobrescritos** pelas subclasses **se necessário**, mas não são obrigatórios.

Eles permitem que a subclasse **“intercepte” o processo** em pontos específicos do algoritmo **sem alterar a estrutura geral**.

---

### ✅ Exemplo completo com *hooks opcionais*

```java
abstract class ProcessadorDeDocumento {

    // Template Method - estrutura fixa do algoritmo
    public final void processar() {
        abrirDocumento();
        lerConteudo();
        if (deveValidarConteudo()) {
            validarConteudo(); // hook
        }
        processarConteudo();
        if (deveLogarProcessamento()) {
            logarProcessamento(); // outro hook
        }
        fecharDocumento();
    }

    protected void abrirDocumento() {
        System.out.println("Abrindo o documento...");
    }

    protected void fecharDocumento() {
        System.out.println("Fechando o documento...");
    }

    protected abstract void lerConteudo();
    protected abstract void processarConteudo();

    // Hook opcional com implementação padrão
    protected void validarConteudo() {
        System.out.println("Validando o conteúdo do documento...");
    }

    // Hook opcional - decisão pode ser sobrescrita
    protected boolean deveValidarConteudo() {
        return false;
    }

    protected void logarProcessamento() {
        System.out.println("Logando o processamento do documento...");
    }

    protected boolean deveLogarProcessamento() {
        return false;
    }
}

// Subclasse que usa os hooks
class ProcessadorPDF extends ProcessadorDeDocumento {

    @Override
    protected void lerConteudo() {
        System.out.println("Lendo conteúdo do PDF...");
    }

    @Override
    protected void processarConteudo() {
        System.out.println("Processando conteúdo do PDF...");
    }

    @Override
    protected boolean deveValidarConteudo() {
        return true; // Ativa o hook de validação
    }

    @Override
    protected boolean deveLogarProcessamento() {
        return true; // Ativa o hook de log
    }
}

// Subclasse que ignora os hooks
class ProcessadorWord extends ProcessadorDeDocumento {

    @Override
    protected void lerConteudo() {
        System.out.println("Lendo conteúdo do Word...");
    }

    @Override
    protected void processarConteudo() {
        System.out.println("Processando conteúdo do Word...");
    }

    // Não sobrescreve os hooks, então os comportamentos padrão (vazios ou false) são usados
}

// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        ProcessadorDeDocumento pdf = new ProcessadorPDF();
        pdf.processar();

        System.out.println("----");

        ProcessadorDeDocumento word = new ProcessadorWord();
        word.processar();
    }
}
```

---

### 💡 Saída esperada:

```
Abrindo o documento...
Lendo conteúdo do PDF...
Validando o conteúdo do documento...
Processando conteúdo do PDF...
Logando o processamento do documento...
Fechando o documento...
----
Abrindo o documento...
Lendo conteúdo do Word...
Processando conteúdo do Word...
Fechando o documento...
```

---

### ✅ Vantagens do uso de *hooks* aqui:

* Flexibilidade: `ProcessadorPDF` usa validação e logging, mas `ProcessadorWord` não precisa.
* Extensibilidade: futuras subclasses podem ativar ou personalizar apenas os pontos que interessam.
