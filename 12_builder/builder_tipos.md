# Builder - Tipos

---

## ✅ 1. **Builder com classe interna (o mais comum — já mostrei antes)**

Usa uma classe `Builder` dentro da classe principal.
Bom para linguagens como **Java** e **C#**.

---

## ✅ 2. **Builder fluente (Fluent Builder)**

Mesma ideia, mas com foco em um *encadeamento* mais legível.

```java
Pessoa p = Pessoa.builder()
    .nome("Ana")
    .idade(30)
    .vip()
    .build();
```

Diferença: cada método pode retornar *this* de forma mais explícita e clara.

---

## ✅ 3. **Builder externo (separado da classe principal)**

O Builder fica em uma classe totalmente separada:

```java
public class PessoaBuilder {
    private String nome;
    private int idade;

    public PessoaBuilder nome(String nome) { this.nome = nome; return this; }
    public PessoaBuilder idade(int idade) { this.idade = idade; return this; }

    public Pessoa build() { return new Pessoa(nome, idade); }
}
```

Útil quando não se pode modificar a classe original (ex.: classes de terceiros).

---

## ✅ 4. **Builder com validação embutida**

Permite validar regras antes de criar o objeto:

```java
public Pessoa build() {
    if (idade < 0) throw new IllegalArgumentException("Idade inválida");
    return new Pessoa(this);
}
```

Muito usado para objetos complexos e críticos.

---

## ✅ 5. **Builder step-by-step (Step Builder Pattern)**

Garante a ordem correta de construção usando interfaces:

```java
Pessoa p = PessoaBuilder
    .nome("Ana")
    .idade(30)
    .contato("email")
    .build();
```

Cada etapa obriga chamar a próxima.

---

## ✅ 6. **Builder Imutável (Immutable Builder)**

Cada método retorna **um novo builder**, não altera o mesmo:

```java
builder = builder.nome("Ana");
builder = builder.idade(30);
```

Comum em linguagens funcionais.

---

## ✅ 7. **Builder usando funções ou lambdas (muito usado em Kotlin/Swift)**

### *Estilo DSL (Kotlin)*

```kotlin
val pessoa = pessoa {
    nome = "Ana"
    idade = 30
    vip = true
}
```

Parece uma pequena linguagem própria.

---

## ✅ 8. **Builder com Lombok (Java)**

Com Lombok, o Builder é gerado automaticamente:

```java
@Builder
@Data
public class Pessoa {
    private String nome;
    private int idade;
}
```

E usa assim:

```java
Pessoa p = Pessoa.builder().nome("Ana").idade(30).build();
```

---

## ✅ 9. **Builder em linguagens dinâmicas (Python/JS)**

Como objetos são flexíveis, o Builder vira algo mais simples:

### Python:

```python
class PessoaBuilder:
    def __init__(self):
        self.data = {}

    def nome(self, nome):
        self.data["nome"] = nome
        return self

    def idade(self, idade):
        self.data["idade"] = idade
        return self

    def build(self):
        return Pessoa(**self.data)
```

---
