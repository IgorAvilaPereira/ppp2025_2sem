## Builder - Teoria

O **padrão de projeto Builder** (ou *Construtor*) é um padrão criacional usado para **construir objetos complexos passo a passo**, permitindo criar diferentes representações de um mesmo objeto usando o mesmo processo de construção.

---

## 🧠 **Quando usar o Builder**

Use quando:

* Um objeto tem **muitos atributos opcionais**.
* A construção do objeto é **complexa** (muitos passos).
* Você quer **evitar construtores enormes** (com 10+ parâmetros).
* Você quer deixar o código **mais legível** e flexível.

---

## 📄 **Ideia principal**

Em vez de passar tudo para um único construtor gigante, você chama métodos encadeados para montar o objeto, e no final chama `.build()`.

---

## ✔️ **Exemplo clássico em Java**

### **Sem Builder (problema)**

```java
Pessoa p = new Pessoa("Ana", 30, "Rua X", "99999-1111", true, false, "ana@email.com");
```

Difícil saber o que cada parâmetro significa.

---

### **Com Builder (solução)**

```java
public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    private boolean ativo;
    private boolean vip;
    private String email;

    private Pessoa(Builder builder) {
        this.nome = builder.nome;
        this.idade = builder.idade;
        this.endereco = builder.endereco;
        this.telefone = builder.telefone;
        this.ativo = builder.ativo;
        this.vip = builder.vip;
        this.email = builder.email;
    }

    public static class Builder {
        private String nome;
        private int idade;
        private String endereco;
        private String telefone;
        private boolean ativo;
        private boolean vip;
        private String email;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public Builder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder ativo(boolean ativo) {
            this.ativo = ativo;
            return this;
        }

        public Builder vip(boolean vip) {
            this.vip = vip;
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
    .vip(true)
    .build();
```

Muito mais claro e flexível.

---

## 🚀 **Resumo**

* Evita “construtores telescópicos”.
* Facilita criar objetos imutáveis.
* Deixa o código mais limpo.
* Permite criar variações do mesmo objeto sem complicar.

