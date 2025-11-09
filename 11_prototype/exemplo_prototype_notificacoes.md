## 💡 Sistema de **Notificações** (como em apps ou redes sociais)

### Contexto original:

Você começou com várias classes para tipos de notificações:

* `FriendRequestNotification`
* `MessageNotification`
* `MentionNotification`
* `CommentNotification`
* `ReminderNotification`
* `LikeNotification`

Cada uma era uma classe separada, com **pequenas diferenças** (ícone, cor, som, etc.). Mas todas usavam praticamente os mesmos campos e comportamento.

### ❌ Problemas:

* Muitas subclasses com comportamento quase idêntico
* Difícil de manter ou adicionar novos tipos rapidamente

---

## ✅ Solução: Usar o padrão **Prototype**

Você cria uma única classe `Notification`, e a clona para gerar variações (ex: uma notificação de mensagem, uma de comentário etc.), com **atributos configuráveis**, e não subclasses.

---

## 🔧 Exemplo em Java

### `Notification.java`

```java
import java.util.ArrayList;
import java.util.List;

public class Notification implements Cloneable {
    private String title;
    private String message;
    private String icon;
    private String backgroundColor;
    private List<String> tags;

    public Notification(String title, String message, String icon, String backgroundColor, List<String> tags) {
        this.title = title;
        this.message = message;
        this.icon = icon;
        this.backgroundColor = backgroundColor;
        this.tags = new ArrayList<>(tags);
    }

    @Override
    public Notification clone() {
        try {
            Notification clone = (Notification) super.clone();
            clone.tags = new ArrayList<>(this.tags);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printInfo() {
        System.out.println("[" + icon + "] " + title + ": " + message + " | Cor: " + backgroundColor + " | Tags: " + tags);
    }
}
```

---

### `NotificationRegistry.java`

```java
import java.util.HashMap;
import java.util.Map;

public class NotificationRegistry {
    private static Map<String, Notification> prototypes = new HashMap<>();

    public static void register(String key, Notification prototype) {
        prototypes.put(key, prototype);
    }

    public static Notification create(String key) {
        Notification prototype = prototypes.get(key);
        return (prototype != null) ? prototype.clone() : null;
    }
}
```

---

### `Main.java`

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Protótipos base
        Notification friendRequest = new Notification(
                "Nova solicitação de amizade",
                "João quer te adicionar como amigo.",
                "👤",
                "blue",
                Arrays.asList("social", "amizade")
        );

        Notification message = new Notification(
                "Nova mensagem",
                "Você recebeu uma nova mensagem.",
                "✉️",
                "green",
                Arrays.asList("mensagem", "comunicação")
        );

        Notification mention = new Notification(
                "Você foi mencionado",
                "@maria te mencionou em um comentário.",
                "🔔",
                "orange",
                Arrays.asList("social", "comentário")
        );

        // Registro
        NotificationRegistry.register("friend", friendRequest);
        NotificationRegistry.register("message", message);
        NotificationRegistry.register("mention", mention);

        // Clonagem e personalização
        Notification n1 = NotificationRegistry.create("message");
        n1.setMessage("Lucas: \"E aí, tudo bem?\"");

        Notification n2 = NotificationRegistry.create("friend");
        n2.setMessage("Ana quer ser sua amiga!");

        Notification n3 = NotificationRegistry.create("mention");
        n3.setMessage("@carlos te marcou em uma foto.");

        // Impressão
        n1.printInfo();
        n2.printInfo();
        n3.printInfo();
    }
}
```

---

## 🧠 Resultado:

* Sem subclasses: 1 única classe `Notification`
* Extensível: Adicionar novo tipo = apenas configurar um novo protótipo
* Fácil de clonar: gera variações com pequenas mudanças

---

## 📊 Comparação dos dois contextos

| Aspecto          | Primeiro exemplo (Cards)  | Segundo exemplo (Notificações) |
| ---------------- | ------------------------- | ------------------------------ |
| Situação inicial | Muitas subclasses visuais | Muitas subclasses semânticas   |
| Solução          | `Card` com `clone()`      | `Notification` com `clone()`   |
| Benefício        | Flexibilidade visual      | Redução de duplicação lógica   |

---


