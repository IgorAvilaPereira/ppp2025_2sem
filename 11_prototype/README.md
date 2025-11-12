O **Prototype** é um **padrão de projeto criacional** que tem como objetivo **criar novos objetos a partir da cópia (clone)** de um objeto existente (o *protótipo*), em vez de instanciá-los diretamente com o operador `new`.

Esse padrão é útil quando o custo de criação de um novo objeto é alto ou quando queremos preservar o estado de um objeto existente.

---

### 🧠 Conceito básico

Em Java, o **Prototype** geralmente é implementado usando o método `clone()` da interface `Cloneable`.

A ideia é:

1. Ter uma **interface ou classe abstrata** com o método `clone()`;
2. As **subclasses** implementam esse método, retornando uma cópia de si mesmas;
3. O **cliente** usa o método `clone()` para criar novos objetos.

---

### 💡 Exemplo prático

```java
// Interface Prototype
public interface Prototype extends Cloneable {
    Prototype clone();
}

// Classe concreta
public class Carro implements Prototype {
    private String modelo;
    private String cor;

    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public Prototype clone() {
        return new Carro(this.modelo, this.cor);
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo='" + modelo + '\'' + ", cor='" + cor + '\'' + '}';
    }
}

// Cliente
public class Main {
    public static void main(String[] args) {
        Carro prototipo = new Carro("Sedan", "Preto");

        Carro carro1 = (Carro) prototipo.clone();
        Carro carro2 = (Carro) prototipo.clone();

        System.out.println(carro1);
        System.out.println(carro2);
    }
}
```

---

### 🧩 Saída esperada:

```
Carro{modelo='Sedan', cor='Preto'}
Carro{modelo='Sedan', cor='Preto'}
```
---

### 🧱 Vantagens:

* Evita recriar objetos complexos do zero.
* Permite copiar objetos sem conhecer suas classes exatas.
* Facilita a criação de variações de objetos com pequenas mudanças.

### ⚠️ Desvantagens:

* Pode ser confuso quando há hierarquias complexas.
* A clonagem profunda (*deep clone*) pode ser trabalhosa.

---

### Exemplos onde o **Prototype Pattern** pode ser usado:

---

* Clonar **configurações de usuários** (preferências, temas, permissões) para novos perfis.
* Duplicar **modelos de documentos** (contratos, relatórios, formulários) já preenchidos parcialmente.
* Criar **novos personagens de jogo** baseados em um modelo (mesmos atributos iniciais).
* Gerar **produtos semelhantes** em um catálogo (com pequenas variações de preço ou nome).
* Copiar **layouts gráficos** em softwares de design ou CAD.
* Clonar **objetos de simulação** (como veículos ou partículas) sem reconstruí-los do zero.
* Duplicar **protótipos de UI** (botões, janelas, componentes visuais) em aplicações desktop/mobile.
* Recriar **objetos complexos carregados da base de dados** sem repetir o processo de carregamento.
* Copiar **estruturas de configuração de rede ou servidor** com ajustes mínimos.
* Criar **instâncias temporárias** de objetos pesados (por exemplo, gráficos 3D ou modelos de IA).

---

### Situações onde *não* é indicado usar o Prototype Pattern**:

---

* Quando o **objeto é simples** e instanciá-lo com `new` é rápido e barato.
* Quando o **processo de clonagem é mais complexo** do que a criação normal.
* Quando os objetos têm **referências cíclicas** ou **dependências difíceis de copiar** (por exemplo, árvores de objetos interligados).
* Quando há **recursos não clonáveis**, como conexões de banco de dados, sockets ou streams abertos.
* Quando o sistema precisa de **controle rigoroso sobre a criação** (por exemplo, com Factory ou Builder).
* Quando o objeto depende fortemente de **injeção de dependência** (em frameworks como Spring, o Prototype pode conflitar com o ciclo de vida do container).
* Quando a **cópia rasa (shallow copy)** causa problemas e uma **cópia profunda (deep copy)** seria muito custosa.
* Quando é mais importante **garantir unicidade** — nesses casos, o **Singleton** é mais apropriado.
* Quando a manutenção do código se torna difícil porque há **muitos tipos diferentes de clones** espalhados pelo sistema.
* Quando o sistema precisa de **rastreamento ou versionamento explícito** de objetos, e o clone pode confundir o histórico.

---

[Video](https://youtu.be/sZD470eM7BU)

[Código - Exemplo](https://github.com/IgorAvilaPereira/exemplo-prototype)

---

**Material Complementar:**

* https://www.youtube.com/watch?v=qTYj8au-SOs&ab_channel=FabioKon

* https://www.youtube.com/watch?v=yva9vcZM2tM&ab_channel=RinaldoDev
  
* https://github.com/rinaldodev/design-patterns/tree/main/src/main/java/dev/rinaldo/designpatterns/behavioral

* https://youtu.be/55_TZK2eL3Y?si=YVKEAhrd27tdFfOi

* https://refactoring.guru/pt-br/design-patterns/prototype

***

<!--
[Slides](https://github.com/IgorAvilaPereira/ppp2024_1sem/raw/main/slides/prototype.pdf)

[Trabalho - Prototype](https://github.com/IgorAvilaPereira/ppp2024_1sem/wiki/Trabalhos)

[Código - Aula](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/prototype)


[Código - Aula](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/PrototypeLaboratorioClonagem)

**Códigos:**

* [Exemplo 1](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/prototype1)
* [Exemplo 2](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/prototype2)
* [Exemplo 3](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/prototype3)
* [Exemplo 4](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/prototype4)
-->


[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/ppp2025_2sem/tree/main/./11_prototype)
