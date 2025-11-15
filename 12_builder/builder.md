## Builder

O **padrão Builder** (ou **Construtor**) é um **padrão de projeto criacional** utilizado para **construir objetos complexos passo a passo**, permitindo diferentes representações do mesmo objeto. Ele é especialmente útil quando a criação de um objeto envolve muitas etapas ou configurações opcionais.

---

### 📐 Intenção

Separar a construção de um objeto complexo da sua representação, permitindo que o mesmo processo de construção crie diferentes representações.

---

### 📦 Quando usar o padrão Builder?

* Quando a criação de um objeto é complexa (muitos parâmetros opcionais, ordem de construção importa).
* Quando você deseja evitar construtores com muitos parâmetros (construtores telescópicos).
* Quando você quer criar objetos imutáveis com muitas opções.

---

### 🧱 Estrutura básica

**Classes principais no padrão Builder:**

1. **Product (Produto)**: O objeto complexo a ser construído.
2. **Builder (Construtor)**: Interface que define os passos de construção.
3. **ConcreteBuilder**: Implementa a interface `Builder` e constrói a parte específica do produto.
4. **Director (Diretor)**: Opcional. Controla a ordem da construção usando o `Builder`.

---

### 🧑‍💻 Exemplo em Java

```java
// Produto
public class Carro {
    private String motor;
    private int portas;

    public void setMotor(String motor) { this.motor = motor; }
    public void setPortas(int portas) { this.portas = portas; }

    @Override
    public String toString() {
        return "Carro com motor: " + motor + ", portas: " + portas;
    }
}

// Builder
public interface CarroBuilder {
    void buildMotor();
    void buildPortas();
    Carro getCarro();
}

// Builder Concreto
public class CarroEsportivoBuilder implements CarroBuilder {
    private Carro carro = new Carro();

    public void buildMotor() {
        carro.setMotor("V8");
    }

    public void buildPortas() {
        carro.setPortas(2);
    }

    public Carro getCarro() {
        return carro;
    }
}

// Diretor
public class Diretor {
    private CarroBuilder builder;

    public Diretor(CarroBuilder builder) {
        this.builder = builder;
    }

    public void construirCarro() {
        builder.buildMotor();
        builder.buildPortas();
    }

    public Carro getCarro() {
        return builder.getCarro();
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        CarroBuilder builder = new CarroEsportivoBuilder();
        Diretor diretor = new Diretor(builder);
        diretor.construirCarro();
        Carro carro = diretor.getCarro();
        System.out.println(carro);
    }
}
```

---

### ✅ Vantagens

* Permite a criação passo a passo de objetos complexos.
* O código fica mais limpo do que com construtores com muitos parâmetros.
* Facilita a criação de objetos imutáveis.

---

### ⚠️ Desvantagens

* Mais classes para manter.
* Pode ser exagerado para objetos simples.

---

## 💻 Exemplo em Java: Montagem de Computadores com Builder

### 1. `Computador` – Produto

```java
public class Computador {
    private String cpu;
    private String ram;
    private String gpu;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computador [CPU=" + cpu + ", RAM=" + ram + ", GPU=" + gpu + "]";
    }
}
```

---

🧪 Estilo Fluent Builder (encadeamento de métodos)
Essa abordagem é ideal quando você não precisa de um "Diretor" separado e quer uma API mais elegante, como:

```java
Computador pc = new Computador.Builder()
                    .setCpu("Intel i9")
                    .setRam("32GB")
                    .setGpu("RTX 4090")
                    .build();
```

🛠️ Exemplo completo com Fluent Builder
1. Computador com classe Builder interna
```java
public class Computador {
    private final String cpu;
    private final String ram;
    private final String gpu;

    private Computador(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.gpu = builder.gpu;
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String gpu;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Computador build() {
            return new Computador(this);
        }
    }

    @Override
    public String toString() {
        return "Computador [CPU=" + cpu + ", RAM=" + ram + ", GPU=" + gpu + "]";
    }
}
```
2. Uso no main
```java
public class Main {
    public static void main(String[] args) {
        Computador pcGamer = new Computador.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setGpu("RTX 4090")
                .build();

        Computador pcEscritorio = new Computador.Builder()
                .setCpu("Intel i3")
                .setRam("8GB")
                .setGpu("Integrada")
                .build();

        System.out.println("PC Gamer: " + pcGamer);
        System.out.println("PC Escritório: " + pcEscritorio);
    }
}
```
✅ Vantagens do Fluent Builder

* Código mais limpo e legível.

* Muito usado para objetos imutáveis.

* Encapsula completamente a construção do objeto.

*Não exige múltiplas classes separadas como no Builder clássico.

---

## 🛠️ Exemplo com Lombok: `@Builder`

O **Lombok** é uma biblioteca Java que reduz **boilerplate** (código repetitivo) usando **anotações**, e uma das funcionalidades mais populares dele é o **@Builder**, que gera automaticamente um *Fluent Builder* para você.

### 1. Adicione o Lombok ao seu projeto

Se estiver usando **Maven**:

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.30</version> <!-- verifique a versão mais recente -->
    <scope>provided</scope>
</dependency>
```

Ou no **Gradle**:

```groovy
dependencies {
    compileOnly 'org.projectlombok:lombok:1.18.30'
    annotationProcessor 'org.projectlombok:lombok:1.18.30'
}
```

> ⚠️ É necessário que sua IDE (como IntelliJ ou Eclipse) tenha o **plugin Lombok instalado** para funcionar corretamente.

---

### 2. Classe `Computador` com Lombok

```java
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Computador {
    private String cpu;
    private String ram;
    private String gpu;
}
```

---

### 3. Uso no `main`

```java
public class Main {
    public static void main(String[] args) {
        Computador pcGamer = Computador.builder()
                .cpu("Intel i9")
                .ram("32GB")
                .gpu("RTX 4090")
                .build();

        Computador pcEscritorio = Computador.builder()
                .cpu("Intel i3")
                .ram("8GB")
                .gpu("Integrada")
                .build();

        System.out.println("PC Gamer: " + pcGamer);
        System.out.println("PC Escritório: " + pcEscritorio);
    }
}
```

---

### 🧾 Saída esperada

```
PC Gamer: Computador(cpu=Intel i9, ram=32GB, gpu=RTX 4090)
PC Escritório: Computador(cpu=Intel i3, ram=8GB, gpu=Integrada)
```

---

### ✅ Vantagens do `@Builder` com Lombok

* Reduz drasticamente o código manual.
* Cria **objetos imutáveis ou mutáveis** com sintaxe fluente.
* Funciona bem com `@Value` para objetos totalmente imutáveis.

