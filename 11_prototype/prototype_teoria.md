## Prototype - Teoria

O **Prototype Pattern** é usado **quando criar um novo objeto do zero é custoso ou complexo**, e você quer **gerar cópias (clones)** de objetos já existentes, mantendo sua estrutura e estado inicial.

Vamos detalhar melhor 👇

---

### 🧠 **1. Conceito principal**

O **Prototype** é um padrão de criação (creational pattern).
A ideia é **não instanciar diretamente** (`new Objeto()`), mas sim **clonar um objeto-base (protótipo)** já configurado.

Isso evita recriar configurações repetitivas ou objetos pesados.

---

### ⚙️ **2. Quando usar na prática**

Você deve considerar o **Prototype Pattern** quando:

1. **Criar um objeto é caro** (em tempo, memória ou processamento).
   Exemplo: um objeto que precisa carregar dados de uma base grande, ler arquivos, ou executar cálculos complexos.

2. **Você quer evitar dependência direta de classes concretas.**
   Por exemplo, você quer copiar um objeto sem saber exatamente seu tipo, apenas que ele é "clonável".

3. **Você precisa de muitas instâncias parecidas** com pequenas variações.
   Exemplo: criar vários personagens num jogo com as mesmas estatísticas básicas, mas nomes diferentes.

---

### 🧩 **3. Exemplo prático**

Imagine um sistema de design gráfico:

```java
public interface Forma extends Cloneable {
    Forma clone();
    void desenhar();
}

public class Circulo implements Forma {
    private int raio;
    private String cor;

    public Circulo(int raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    @Override
    public Forma clone() {
        return new Circulo(this.raio, this.cor);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando círculo " + cor + " com raio " + raio);
    }
}
```

Em vez de criar dezenas de círculos manualmente:

```java
Circulo prototipo = new Circulo(10, "azul");

// Clones rápidos
Circulo c1 = (Circulo) prototipo.clone();
Circulo c2 = (Circulo) prototipo.clone();
c2.setCor("vermelho");
```

Assim, você **reutiliza o modelo base (protótipo)** sem custo de criação completo.

---

### 🚀 **4. Comparando com outros padrões**

| Padrão             | Quando usar                                                                |
| ------------------ | -------------------------------------------------------------------------- |
| **Factory Method** | Quando quer centralizar a criação, mas ainda precisa instanciar algo novo. |
| **Singleton**      | Quando precisa de **uma única instância** global.                          |
| **Prototype**      | Quando quer **duplicar** objetos já existentes, com ou sem alterações.     |

---

### 💬 **Resumo rápido**

👉 Use **Prototype** quando:

* Instanciar é **caro ou complexo**.
* Você precisa de **muitas cópias parecidas**.
* Quer **evitar dependência direta** de classes concretas.
* Deseja **clonar objetos dinamicamente** em tempo de execução.

---
