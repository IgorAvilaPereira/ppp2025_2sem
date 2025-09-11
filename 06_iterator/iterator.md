## 🧭 O que é o Padrão Iterator?

O **padrão Iterator** é um **padrão de projeto comportamental** que fornece uma forma **padronizada de acessar os elementos de uma coleção sequencialmente, sem expor sua estrutura interna**.

Ele permite **percorrer coleções (listas, conjuntos, árvores, etc.) sem precisar conhecer os detalhes de como esses dados estão organizados ou implementados**.

---

## 🎯 Objetivo Principal

Separar o **comportamento de iteração** da **estrutura da coleção**.

Isso permite que diferentes coleções (como listas, filas ou árvores) possam ser percorridas de forma uniforme, utilizando um mesmo tipo de iterador, mesmo que internamente sejam implementadas de maneira diferente.

---

## 📦 Problema que o padrão resolve

Imagine que você tenha diversas coleções diferentes (listas, conjuntos, dicionários) e precise percorrer os elementos delas. Se você fizer isso diretamente, o código que percorre a coleção vai ficar **acoplado à forma como os dados estão armazenados**, o que torna o código:

* Difícil de manter.
* Pouco reutilizável.
* Rígido a mudanças (ex: trocar um `ArrayList` por um `HashSet` pode exigir reescrever partes do código).

Com o padrão Iterator, você padroniza esse acesso e desacopla a navegação da estrutura de dados.

---

## 🧱 Estrutura Conceitual do Padrão

O padrão é formado por quatro partes principais:

1. **Iterator (Iterador)**
   Define a interface para acessar elementos (por exemplo, `hasNext()` e `next()`).

2. **ConcreteIterator (Iterador Concreto)**
   Implementa o comportamento da interface `Iterator` para uma coleção específica. Sabe **como navegar pela estrutura interna** da coleção.

3. **Aggregate (Agregado ou Coleção)**
   Define a interface para criar um iterador. Ex: `createIterator()`.

4. **ConcreteAggregate (Agregado Concreto)**
   Implementa a interface da coleção e retorna um iterador apropriado.

---

## 📘 Exemplo Conceitual do Mundo Real

Pense em um **livro**. O livro é a **coleção** de páginas, e você quer ler página por página. Você pode ter diferentes tipos de livros (impresso, PDF, audiolivro), mas quer **uma forma única de avançar de uma página para outra**.

O **iterador** é como um **marcador de página** que te diz se ainda há páginas para ler (`hasNext`) e te mostra a próxima página (`next`). A estrutura do livro (como as páginas são organizadas fisicamente ou digitalmente) não importa para quem está lendo — só importa o iterador.

---

## ✅ Vantagens do Padrão Iterator

1. **Desacoplamento**
   A lógica de iteração fica separada da lógica da coleção.

2. **Reutilização de código**
   O mesmo iterador pode ser usado em diferentes partes do sistema, com diferentes coleções.

3. **Uniformidade de acesso**
   Diferentes estruturas de dados podem ser percorridas de forma uniforme.

4. **Flexibilidade**
   Permite criar diferentes tipos de iteradores (ex: iterador reverso, iterador filtrado, etc.).

---

## ⚠️ Desvantagens / Cuidados

1. **Sobrecarga de classes**
   Pode adicionar complexidade desnecessária em coleções muito simples.

2. **Iteradores simultâneos**
   Se a coleção for alterada enquanto está sendo iterada (por outro processo, por exemplo), isso pode causar erros ou comportamentos inesperados (ex: `ConcurrentModificationException` no Java).

3. **Possível consumo de memória**
   Alguns iteradores mantêm estados intermediários que podem aumentar o uso de memória se mal utilizados.

---

## 🧩 Padrão Iterator no Java (visão conceitual)

A linguagem Java já implementa o padrão Iterator em sua **API de Coleções**. As interfaces `Iterable` e `Iterator` são parte do pacote `java.util`, e oferecem exatamente essa separação entre estrutura e iteração.

Ou seja, você **já usa o padrão Iterator diariamente** quando faz um loop com `for-each` ou usa `.iterator()` com listas, conjuntos, etc.

---

## 🧠 Quando usar o Padrão Iterator?

Use quando:

* Você precisa **percorrer elementos** de uma coleção sem saber como ela está implementada internamente.
* Você deseja **uniformizar** o acesso a diferentes tipos de coleções.
* Você quer **suportar múltiplas formas de iteração** (normal, reversa, com filtro, etc.).
* Você quer **evitar duplicação de lógica de navegação** no seu código.

---


