# Builder - Exemplos

## 1. Objetos com muitos parâmetros (muitos atributos opcionais)

Imagine uma classe Pessoa ou Usuário com muitos campos: nome, sobrenome, email, telefone, endereço, data de nascimento, cargo, preferências etc. Se você colocasse tudo isso no construtor, ficaria complicado (telescoping constructor).

Usando um builder, você pode fazer algo como:

```java
Pessoa p = new PessoaBuilder()
    .nome("João")
    .email("joao@example.com")
    .telefone("9999-9999")
    // só chama os métodos que realmente precisa
    .build();
```

## 2. Construção de consultas SQL / query builders

Em ORMs (Object-Relational Mappers), é muito comum usar algo parecido com builder para compor consultas SQL dinamicamente — por exemplo: select().where().orderBy() — cada parte vai sendo adicionada e, ao final, você “constrói” a query. Esse é um exemplo real de Builder. 
GeeksforGeeks

## 3. Geração de documentos (PDF, HTML, relatórios)

Se você tem uma ferramenta que monta documentos complexos (com seções, cabeçalhos, parágrafos, tabelas, imagens), pode usar o Builder para adicionar cada parte de forma encadeada e só no fim gerar o documento “produto”

Imagine gerar documentos em PDF/HTML/Markdown com partes opcionais:

```java
doc = DocumentoBuilder() \
    .com_cabecalho("Relatório 2025") \
    .com_tabela(dados) \
    .com_rodape("Confidencial") \
    .build()
```

## 4. Construção de objetos de configuração

Ex: construir um objeto que configura uma conexão de banco de dados:

```java
var cfg = NewConfigBuilder().
    Host("localhost").
    Port(5432).
    User("admin").
    Ssl(true).
    Build()
``` 

## 5. Configurar requisições HTTP

Especialmente em APIs complexas:

```java
const request = new RequestBuilder()
  .setUrl("/api/usuarios")
  .setMethod("POST")
  .addHeader("Authorization", token)
  .setBody({ nome: "Ana" })
  .build();   
```  
  
## 6. Construção de objetos de jogo (Game Dev)

Criar personagens com atributos opcionais:

```java
var inimigo = new EnemyBuilder()
    .WithHealth(100)
    .WithWeapon("Espada")
    .WithArmor("Leve")
    .Build();
```
    
## Quando usar o padrão Builder

* Quando a construção de um objeto é complexa (muitos atributos, lógica de montagem) 

* Quando você quer separar a lógica de construção da representação do objeto final 

* Para evitar construtores com muitos parâmetros (ou muitos métodos “set”) — melhora a legibilidade e manutenção 

* Quando você quer oferecer diferentes variações para o mesmo tipo de objeto, sem duplicar lógica principal 

* Se o objeto final deve ser imutável, o builder ajuda a “montar” antes de criar a instância definitiva.

## Desvantagens / pontos de cuidado

* Pode gerar mais classes / código boilerplate (Builder, Director, ConcreteBuilders) — para objetos simples, pode ser “overkill” 

* Se não for bem projetado, a API do builder (os métodos) pode ficar confusa, especialmente se você tiver muitos “steps” ou opções 

* Dependendo da linguagem, pode ser menos eficaz que outras abordagens (por exemplo, “functional options” em Go) 

