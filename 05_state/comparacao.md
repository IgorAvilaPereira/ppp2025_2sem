## 🧠 Visão Geral

| Padrão              | Tipo           | Intenção Principal                                                                                                 |
| ------------------- | -------------- | ------------------------------------------------------------------------------------------------------------------ |
| **State**           | Comportamental | Permitir que um objeto altere seu comportamento quando seu estado interno muda.                                    |
| **Strategy**        | Comportamental | Permitir que um algoritmo seja selecionado em tempo de execução.                                                   |
| **Observer**        | Comportamental | Notificar automaticamente múltiplos objetos quando o estado de um objeto mudar.                                    |
| **Command**         | Comportamental | Encapsular uma solicitação como um objeto, permitindo desfazer/refazer, log etc.                                   |
| **Template Method** | Comportamental | Definir o esqueleto de um algoritmo em uma superclasse, permitindo que subclasses implementem partes do algoritmo. |

---

## 🔍 Comparação por Critério

### 1. **Objetivo**

| Padrão              | Objetivo                                                                                      |
| ------------------- | --------------------------------------------------------------------------------------------- |
| **State**           | Alterar comportamento de um objeto com base em seu estado interno, sem usar muitos `if/else`. |
| **Strategy**        | Trocar algoritmos de forma flexível e intercambiável.                                         |
| **Observer**        | Reagir automaticamente a mudanças de estado em outro objeto.                                  |
| **Command**         | Encapsular ações em objetos e desacoplar emissores de receptores.                             |
| **Template Method** | Permitir que subclasses personalizem partes de um algoritmo sem alterar sua estrutura geral.  |

---

### 2. **Papel dos objetos envolvidos**

| Padrão              | Papéis principais                                                                  |
| ------------------- | ---------------------------------------------------------------------------------- |
| **State**           | `Context` mantém referência a um `State`, que define o comportamento.              |
| **Strategy**        | `Context` usa uma `Strategy` para realizar uma tarefa.                             |
| **Observer**        | `Subject` notifica múltiplos `Observers` quando seu estado muda.                   |
| **Command**         | `Invoker` chama comandos (`Command`), que executam ações em `Receiver`.            |
| **Template Method** | A superclasse define a estrutura do algoritmo; subclasses implementam os detalhes. |

---

### 3. **Ponto de Variação**

| Padrão              | O que varia                                                     |
| ------------------- | --------------------------------------------------------------- |
| **State**           | Comportamento do objeto conforme o estado interno.              |
| **Strategy**        | Algoritmo utilizado.                                            |
| **Observer**        | Ações dos observers após uma mudança de estado.                 |
| **Command**         | Ação a ser executada (como e quando).                           |
| **Template Method** | Etapas específicas do algoritmo (implementadas nas subclasses). |

---

### 4. **Semelhanças e Diferenças**

| Padrão                   | Semelhança                                            | Diferença                                                                                                 |
| ------------------------ | ----------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| **State vs Strategy**    | Ambos encapsulam comportamentos em classes separadas. | `State` muda dinamicamente conforme o **estado do contexto**. `Strategy` é escolhido pelo **cliente**.    |
| **State vs Command**     | Ambos encapsulam lógica em objetos.                   | `Command` foca em **ações** (executar, desfazer), `State` foca em **comportamento contínuo e transição**. |
| **Strategy vs Template** | Ambos permitem variação no algoritmo.                 | `Strategy` usa **composição**, `Template` usa **herança**.                                                |
| **Observer vs Command**  | Ambos permitem alguma forma de desacoplamento.        | `Observer` é reativo (notificações); `Command` é ativo (execução sob demanda).                            |
| **Observer vs State**    | Ambos reagem a mudanças.                              | `Observer` notifica outros objetos, `State` muda **o próprio comportamento**.                             |

---


## ✅ Quando Usar Cada Um?

| Situação                                                          | Padrão Ideal        |
| ----------------------------------------------------------------- | ------------------- |
| Objeto precisa mudar de comportamento conforme seu estado         | **State**           |
| Precisa escolher entre diferentes algoritmos em tempo de execução | **Strategy**        |
| Vários objetos precisam reagir a mudanças em outro                | **Observer**        |
| Precisa encapsular ações, permitir desfazer/refazer               | **Command**         |
| Algoritmo padrão com partes variáveis delegadas a subclasses      | **Template Method** |


