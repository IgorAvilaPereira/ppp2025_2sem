## Builder - Tipos - Implementação

---

# ⭐ 1. **Builder clássico (classe interna)**

O modelo mais conhecido (Joshua Bloch – *Effective Java*).

### **Código**

```java
public class Pessoa {
    private final String nome;
    private final int idade;
    private final String email;

    private Pessoa(Builder builder) {
        this.nome = builder.nome;
        this.idade = builder.idade;
        this.email = builder.email;
    }

    public static class Builder {
        private String nome;
        private int idade;
        private String email;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this);
        }
    }
}
```

### **Uso**

```java
Pessoa p = new Pessoa.Builder()
        .nome("Ana")
        .idade(30)
        .email("ana@email.com")
        .build();
```

---

# ⭐ 2. **Fluent Builder**

Mesma ideia do Builder clássico, mas com um *método estático builder()*.

### **Código**

```java
public class Pessoa {
    private final String nome;
    private final int idade;

    private Pessoa(Builder b) {
        this.nome = b.nome;
        this.idade = b.idade;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String nome;
        private int idade;

        public Builder nome(String nome) { this.nome = nome; return this; }
        public Builder idade(int idade) { this.idade = idade; return this; }

        public Pessoa build() { return new Pessoa(this); }
    }
}
```

### **Uso**

```java
Pessoa p = Pessoa.builder()
    .nome("Ana")
    .idade(30)
    .build();
```

---

# ⭐ 3. **Builder externo (classe separada)**

Útil quando a classe original **não pode ser modificada**.

### **Código**

```java
public class Pessoa {
    private final String nome;
    private final int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

### Builder separado

```java
public class PessoaBuilder {
    private String nome;
    private int idade;

    public PessoaBuilder nome(String nome) { this.nome = nome; return this; }
    public PessoaBuilder idade(int idade) { this.idade = idade; return this; }

    public Pessoa build() {
        return new Pessoa(nome, idade);
    }
}
```

---

# ⭐ 4. **Builder com validação**

### **Código**

```java
public class Pessoa {
    private final String nome;
    private final int idade;

    private Pessoa(Builder b) {
        this.nome = b.nome;
        this.idade = b.idade;
    }

    public static class Builder {
        private String nome;
        private int idade;

        public Builder nome(String nome) {
            if (nome == null || nome.isBlank()) {
                throw new IllegalArgumentException("Nome inválido");
            }
            this.nome = nome;
            return this;
        }

        public Builder idade(int idade) {
            if (idade < 0 || idade > 130) {
                throw new IllegalArgumentException("Idade inválida");
            }
            this.idade = idade;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this);
        }
    }
}
```

---

# ⭐ 5. **Step Builder Pattern (força a ordem)**

### **Código**

```java
public class Pessoa {

    private final String nome;
    private final int idade;
    private final String email;

    private Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public static NomeStep builder() {
        return new Builder();
    }

    public interface NomeStep {
        IdadeStep nome(String nome);
    }

    public interface IdadeStep {
        EmailStep idade(int idade);
    }

    public interface EmailStep {
        BuildStep email(String email);
    }

    public interface BuildStep {
        Pessoa build();
    }

    private static class Builder implements NomeStep, IdadeStep, EmailStep, BuildStep {

        private String nome;
        private int idade;
        private String email;

        public IdadeStep nome(String nome) {
            this.nome = nome;
            return this;
        }

        public EmailStep idade(int idade) {
            this.idade = idade;
            return this;
        }

        public BuildStep email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(nome, idade, email);
        }
    }
}
```

### **Uso obrigatório nessa ordem:**

```java
Pessoa p = Pessoa.builder()
        .nome("Ana")
        .idade(30)
        .email("ana@x.com")
        .build();
```

---

# ⭐ 6. **Builder imutável (cada passo cria uma cópia)**

Mais funcional (como em linguagens imutáveis).

### **Código**

```java
public class PessoaBuilder {
    private final String nome;
    private final Integer idade;

    public PessoaBuilder() {
        this(null, null);
    }

    private PessoaBuilder(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public PessoaBuilder nome(String nome) {
        return new PessoaBuilder(nome, this.idade);
    }

    public PessoaBuilder idade(int idade) {
        return new PessoaBuilder(this.nome, idade);
    }

    public Pessoa build() {
        return new Pessoa(nome, idade);
    }
}
```

---

# ⭐ 7. **Builder estilo DSL (quase Kotlin)**

Simula uma *mini linguagem*.

### **Código**

```java
public class Pessoa {

    private String nome;
    private int idade;

    public static Pessoa create(Consumer<Pessoa> builder) {
        Pessoa p = new Pessoa();
        builder.accept(p);
        return p;
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
}
```

### **Uso**

```java
Pessoa p = Pessoa.create(pessoa -> {
    pessoa.setNome("Ana");
    pessoa.setIdade(30);
});
```

---

# ⭐ 8. **Builder com Lombok (automático)**

Extremamente usado no mercado.

### **Código**

```java
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pessoa {
    private String nome;
    private int idade;
    private String email;
}
```

### **Uso**

```java
Pessoa p = Pessoa.builder()
    .nome("Ana")
    .idade(30)
    .email("ana@x.com")
    .build();
```

---

# ⭐ 9. **Builder com herança (Abstract Builder)**

Evita duplicação quando subclasses também usam builder.

### **Código**

```java
public abstract class PessoaBuilder<T extends PessoaBuilder<T>> {
    protected String nome;

    public T nome(String nome) {
        this.nome = nome;
        return self();
    }

    protected abstract T self();

    public abstract Pessoa build();
}
```

Subclasse:

```java
public class FuncionarioBuilder extends PessoaBuilder<FuncionarioBuilder> {

    private double salario;

    public FuncionarioBuilder salario(double salario) {
        this.salario = salario;
        return this;
    }

    protected FuncionarioBuilder self() {
        return this;
    }

    public Funcionario build() {
        return new Funcionario(nome, salario);
    }
}
```
---
