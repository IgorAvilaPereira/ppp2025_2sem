# 👀 Padrão de Projeto: OBSERVER

---

## 🧠 O que você faz quando segue alguém no Instagram?

- Recebe notificações de novos posts
- É avisado automaticamente sem perguntar

🔁 Isso é **Observer** na vida real.

---

## 🎯 O que é o padrão Observer?

> Um padrão **comportamental** que permite que objetos se inscrevam para serem **notificados automaticamente** quando outro objeto muda de estado.

- Objeto principal: **Subject (Sujeito)**
- Objetos interessados: **Observers (Observadores)**

---

## 📦 Motivação

### Sem Observer:
- Um objeto precisa **conhecer todos** os que precisam ser avisados
- Alto **acoplamento**

### Com Observer:
- O objeto só **notifica** → não sabe quem está ouvindo
- **Desacoplamento**, flexibilidade e reuso

---

## 🔔 Exemplo do mundo real

### 🔔 Canal do YouTube

- **Canal (Subject)** publica novo vídeo
- **Inscritos (Observers)** recebem notificação

```text
[ Canal ] ---> notifica ---> [ João ]
                        ---> [ Maria ]
                        ---> [ Pedro ]
````

---

## 🧱 Estrutura do padrão

```text
+------------------+      +------------------+
|    Subject       |<---->|    Observer      |
|------------------|      |------------------|
| + addObserver()  |      | + atualizar()    |
| + removeObserver()|     +------------------+
| + notificar()    |
+------------------+
```

---

## 🧪 Exemplo simples em Java

```java
public interface Observer {
    void atualizar(String mensagem);
}

public class Assinante implements Observer {
    private String nome;

    public Assinante(String nome) {
        this.nome = nome;
    }

    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
```

---

```java
public class Canal implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    public void notificar(String mensagem) {
        for (Observer o : observers) {
            o.atualizar(mensagem);
        }
    }
}
```

---

## 🧠 Onde usar o padrão Observer?

* Interfaces gráficas (Swing, JavaFX)
* Sistemas de notificação
* Monitoramento de sensores
* Games (eventos entre objetos)

---

## 🛠️ Exemplo com Swing (resumo)

* `JanelaPrincipal` tem um botão
* `JanelaObservadora` reage quando o botão é clicado
* Várias janelas observam a principal

---

## 🧩 Benefícios

✅ Baixo acoplamento
✅ Alta coesão
✅ Flexibilidade para adicionar/remover observadores em tempo de execução
✅ Implementação simples e poderosa

---


## 🚀 Conclusão

* Observer permite **reagir automaticamente a eventos**
* Facilita **manutenção e extensibilidade**
* É amplamente usado em **frameworks, GUIs e sistemas em tempo real**

---


