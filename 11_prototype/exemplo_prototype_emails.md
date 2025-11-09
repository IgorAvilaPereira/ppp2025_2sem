## 💡 Cenário: Sistema de envio de e-mails automatizados

### Situação inicial:

Você começou criando **uma classe para cada tipo de e-mail**:

* `WelcomeEmail`
* `PasswordResetEmail`
* `NewsletterEmail`
* `PromotionEmail`
* `SurveyEmail`
* `AbandonedCartEmail`

Essas classes variam apenas em conteúdo e layout. O comportamento é praticamente o mesmo.

---

### ❌ Problema:

* Muitas classes com pouca variação
* Código repetitivo
* Baixa flexibilidade para personalizar dinamicamente

---

## ✅ Solução: Usar o padrão **Prototype**

Criamos uma classe única `EmailTemplate` e a usamos como **protótipo** para criar variações com pequenas mudanças no conteúdo (ex: título, corpo, CTA, etc.).

---

## 🛠️ Exemplo em Java

### 📦 `EmailTemplate.java`

```java
public class EmailTemplate implements Cloneable {
    private String subject;
    private String body;
    private String ctaText; // Call to action
    private String footer;

    public EmailTemplate(String subject, String body, String ctaText, String footer) {
        this.subject = subject;
        this.body = body;
        this.ctaText = ctaText;
        this.footer = footer;
    }

    @Override
    public EmailTemplate clone() {
        try {
            return (EmailTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printEmail() {
        System.out.println("📧 Assunto: " + subject);
        System.out.println(body);
        System.out.println("\n👉 " + ctaText);
        System.out.println("\n---\n" + footer);
    }
}
```

---

### 📦 `EmailRegistry.java`

```java
import java.util.HashMap;
import java.util.Map;

public class EmailRegistry {
    private static Map<String, EmailTemplate> prototypes = new HashMap<>();

    public static void register(String key, EmailTemplate prototype) {
        prototypes.put(key, prototype);
    }

    public static EmailTemplate create(String key) {
        EmailTemplate template = prototypes.get(key);
        return (template != null) ? template.clone() : null;
    }
}
```

---

### ✅ `Main.java`

```java
public class Main {
    public static void main(String[] args) {
        // Protótipos base
        EmailTemplate welcome = new EmailTemplate(
                "Bem-vindo à nossa plataforma!",
                "Olá! Estamos felizes por ter você conosco.",
                "Comece agora",
                "Equipe Suporte"
        );

        EmailTemplate reset = new EmailTemplate(
                "Redefinição de senha",
                "Clique no botão abaixo para redefinir sua senha.",
                "Redefinir senha",
                "Segurança da Conta"
        );

        EmailTemplate promo = new EmailTemplate(
                "Oferta exclusiva para você!",
                "Confira nossos descontos imperdíveis desta semana.",
                "Aproveitar oferta",
                "Equipe Marketing"
        );

        // Registro
        EmailRegistry.register("welcome", welcome);
        EmailRegistry.register("reset", reset);
        EmailRegistry.register("promo", promo);

        // Clonagem e customização
        EmailTemplate user1Email = EmailRegistry.create("welcome");
        user1Email.setSubject("Bem-vindo, João!");

        EmailTemplate user2Reset = EmailRegistry.create("reset");
        user2Reset.setBody("Olá Maria,\nRecebemos uma solicitação para alterar sua senha.");

        EmailTemplate promoEmail = EmailRegistry.create("promo");
        promoEmail.setSubject("🔥 Promoção para você, Rafael!");

        // Impressão
        user1Email.printEmail();
        System.out.println("\n----------------------------\n");
        user2Reset.printEmail();
        System.out.println("\n----------------------------\n");
        promoEmail.printEmail();
    }
}
```

---

## ✅ Benefícios do padrão Prototype nesse contexto

| Problema resolvido               | Como o Prototype ajuda           |
| -------------------------------- | -------------------------------- |
| Muitas subclasses desnecessárias | 1 classe única `EmailTemplate`   |
| Repetição de lógica              | Evitada via `clone()`            |
| Customização rápida de conteúdo  | Só alterar os campos após clonar |
| Novos tipos de e-mails?          | Só registrar um novo protótipo   |

---

## ➕ Possíveis extensões

Você pode evoluir isso para incluir:

* Suporte a variáveis no corpo (placeholders como `{{nome}}`)
* Templates com HTML
* Integração com sistema de envio real (SMTP, API)
* Registro de protótipos em banco de dados



