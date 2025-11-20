
# ✅ **LISTA DE EXERCÍCIOS – Design Patterns (Decorator, Proxy, Prototype, Builder)**

---

# 🔷 **1. DECORATOR**

### **Exercício 1 — Café com opcionais**

Implemente um sistema de venda de café onde:

* Existe um componente base: `Café`.
* O usuário pode adicionar “decorators” como:

  * Leite
  * Chocolate
  * Chantilly
* Cada extra aumenta o preço.
  **Tarefa:**
  Crie classes necessárias e monte um café com leite e chocolate, mostrando o preço total.

---

### **Exercício 2 — Logger Decorado**

Crie um `Logger` básico que apenas imprime mensagens.
Depois crie decorators que acrescentam:

* Timestamp
* Nome do módulo
* Prefixo de severidade (INFO, ERROR, DEBUG)

**Tarefa:**
Monte uma cadeia de decorators que imprima:

```
[INFO][2025-01-01 10:00] [Sistema] Mensagem teste
```

---

### **Exercício 3 — Personagem de jogo**

Crie um personagem com atributos base (ataque e defesa).
Implemente armaduras e armas como decorators que aumentam os atributos.

**Tarefa:**
Equipe um personagem com “Espada Longa” e “Armadura Pesada” e mostre os atributos finais.

---

---

# 🔷 **2. PROXY**

### **Exercício 4 — Carregamento preguiçoso de imagem**

Crie uma interface `Imagem` com método `exibir()`.
Implemente:

* `ImagemReal`: carrega uma imagem pesada no construtor.
* `ImagemProxy`: carrega a imagem real **somente quando necessário**.

**Tarefa:**
Demonstre que chamar `exibir()` duas vezes não recarrega a imagem.

---

### **Exercício 5 — Proxy de segurança**

Implemente uma interface `Banco` com métodos `depositar()` e `sacar()`.
Crie:

* `BancoReal`: executa as operações.
* `BancoProxy`: exige usuário e senha válidos antes de permitir chamadas ao `BancoReal`.

**Tarefa:**
Teste um acesso permitido e outro negado.

---

### **Exercício 6 — Proxy de cache**

Crie uma classe que busca dados de um servidor (simulado com `Thread.sleep(2000)`).
O Proxy deve armazenar o resultado para requisições repetidas.

**Tarefa:**
Mostre que a primeira busca demora e a segunda é instantânea.

---

---

# 🔷 **3. PROTOTYPE**

### **Exercício 7 — Clonagem de inimigos**

Implemente um inimigo de jogo com atributos:

* vida
* ataque
* velocidade

Crie um método `clone()` que retorna uma cópia completa.

**Tarefa:**
Crie um inimigo "base" e produza 10 cópias com pequenas variações nos atributos.

---

### **Exercício 8 — Documentos clonáveis**

Crie uma classe `Documento` com:

* título
* corpo
* metadados (objeto interno)

Implemente clone profundo usando Prototype.

**Tarefa:**
Mostre que alterar os metadados do clone **não altera** o original.

---

### **Exercício 9 — Protótipo de veículos**

Crie protótipos pré-configurados:

* Carro esporte
* Caminhão
* Moto

Faça clones e personalize alguns campos (cor, placa).

**Tarefa:**
Imprima os clones e comprove que a estrutura base é a mesma.

---

---

# 🔷 **4. BUILDER**

### **Exercício 10 — Builder de usuário**

Implemente um builder para criar objetos `Usuario` com campos opcionais:

* nome (obrigatório)
* idade
* email
* telefone

**Tarefa:**
Crie um usuário com nome + email usando o Builder.

---

### **Exercício 11 — Builder para montar hambúrguer**

Um hambúrguer pode conter:

* tipo do pão
* quantidade de carne
* queijo
* alface
* tomate
* molhos extras

**Tarefa:**
Monte um hambúrguer duplo com queijo, alface e molho especial.

---

### **Exercício 12 — Builder de requisição HTTP**

Crie um builder que permite construir requisições HTTP com:

* método
* cabeçalhos
* parâmetros
* corpo

**Tarefa:**
Monte uma requisição POST com JSON no corpo.

---

---

# 🔷 **BONUS — Exercício final integrador (opcional)**

### **Exercício 13 — Sistema completo de personagens**

Implemente:

* **Builder** para criar personagens
* **Prototype** para cloná-los
* **Decorator** para equipá-los (espadas, escudos)
* **Proxy** para restringir acesso ao inventário

**Tarefa:**
Monte um personagem usando Builder → clone com Prototype → equipe com Decorator → acesse seu inventário via Proxy.


