Perfeito 😊 — vamos então ver um exemplo de **clonagem profunda (deep clone)** no padrão **Prototype**.

A clonagem profunda é usada quando um objeto contém **outros objetos internos** — e queremos que **esses também sejam copiados**, não apenas referenciados.

---

### 🧠 Diferença rápida:

* **Clonagem rasa (shallow clone):** copia apenas os campos primitivos e referências dos objetos internos.
* **Clonagem profunda (deep clone):** copia também os objetos internos, criando cópias independentes.

---

### 💡 Exemplo completo — `Carro` com um objeto `Motor`

```java
// Interface Prototype
public interface Prototype extends Cloneable {
    Prototype clone();
}

// Classe Motor
public class Motor implements Prototype {
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public Prototype clone() {
        // Clonagem profunda — cria um novo Motor com a mesma potência
        return new Motor(this.potencia);
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + "}";
    }
}

// Classe Carro
public class Carro implements Prototype {
    private String modelo;
    private String cor;
    private Motor motor;

    public Carro(String modelo, String cor, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
    }

    @Override
    public Prototype clone() {
        // Clonagem profunda: também clona o Motor
        return new Carro(this.modelo, this.cor, (Motor) this.motor.clone());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", motor=" + motor +
                '}';
    }

    public Motor getMotor() {
        return motor;
    }
}

// Cliente
public class Main {
    public static void main(String[] args) {
        Motor motorOriginal = new Motor(120);
        Carro carroOriginal = new Carro("Sedan", "Azul", motorOriginal);

        Carro carroClone = (Carro) carroOriginal.clone();

        // Alterando o motor do clone para mostrar que são independentes
        carroClone.getMotor().setPotencia(200);

        System.out.println("Original: " + carroOriginal);
        System.out.println("Clone:    " + carroClone);
    }
}
```

---

### 🧩 Saída esperada:

```
Original: Carro{modelo='Sedan', cor='Azul', motor=Motor{potencia=120}}
Clone:    Carro{modelo='Sedan', cor='Azul', motor=Motor{potencia=200}}
```

---

### 🧱 O que aconteceu:

* O clone copiou o objeto `Motor` também, não apenas a referência.
* Quando alteramos o motor do clone, o original permaneceu intacto — confirmando que foi feita uma **clonagem profunda**.

---
