## 🔁 1. **Registro de Protótipos (Prototype Registry)**

Em vez de clonar objetos diretamente, mantemos um **catálogo (mapa)** de protótipos registrados. Isso permite selecionar e clonar protótipos por nome ou tipo.

### ✅ Vantagem:

* Organização, reuso e dinamismo.
* Permite trocar implementações em tempo de execução.

### 🔧 Exemplo:

```java
public interface Documento extends Cloneable {
    Documento clone();
}

public class Contrato implements Documento {
    private String tipo;

    public Contrato(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Contrato clone() {
        return new Contrato(this.tipo);
    }

    public String getTipo() { return tipo; }
}
```

#### Registro:

```java
import java.util.HashMap;

public class DocumentoRegistry {
    private HashMap<String, Documento> prototipos = new HashMap<>();

    public void registrar(String chave, Documento doc) {
        prototipos.put(chave, doc);
    }

    public Documento obter(String chave) {
        return prototipos.get(chave).clone();
    }
}
```

#### Uso:

```java
DocumentoRegistry registry = new DocumentoRegistry();
registry.registrar("contrato_trabalho", new Contrato("CLT"));

Documento c1 = registry.obter("contrato_trabalho");
System.out.println(((Contrato) c1).getTipo()); // CLT
```

---

## 🧱 2. **Prototype + Factory/Builder**

Combine com o padrão **Factory** ou **Builder** para encapsular a criação e personalização de clones complexos.

### Exemplo:

```java
public class DocumentoBuilder {
    private Documento prototipo;

    public DocumentoBuilder(Documento prototipo) {
        this.prototipo = prototipo;
    }

    public Documento criarComTitulo(String titulo) {
        Documento novo = prototipo.clone();
        novo.setTitulo(titulo);
        return novo;
    }
}
```

---
<!--

## 💾 3. **Clonagem Profunda via Serialização**

Uma forma alternativa de deep clone é usar **serialização** (quando os objetos são `Serializable`). Muito útil quando você tem estruturas complexas com múltiplos níveis de composição.

### Exemplo com ByteArray:

```java
public static Object deepClone(Object obj) {
    try {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(obj);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return ois.readObject();
    } catch (Exception e) {
        throw new RuntimeException("Erro ao clonar via serialização", e);
    }
}
```

---
-->

## 🔍 3. **Prototype + Reflection (baixo acoplamento)**

Você pode usar **Reflection** para criar clones genéricos quando não quer ou não pode modificar a classe original.

```java
public static <T> T cloneComReflection(T obj) {
    try {
        Constructor<?> ctor = obj.getClass().getDeclaredConstructor();
        ctor.setAccessible(true);
        return (T) ctor.newInstance();
    } catch (Exception e) {
        throw new RuntimeException("Falha ao clonar com reflection", e);
    }
}
```

---

## 🧠 Considerações Finais

| Técnica                  | Uso recomendado                                         |
| ------------------------ | ------------------------------------------------------- |
| `super.clone()`          | Clonagem simples com atributos primitivos ou imutáveis  |
| Clonagem profunda manual | Objetos com composição de objetos mutáveis              |
| Registro de protótipos   | Várias instâncias padrão reutilizáveis                  |
<!--| Serialização             | Clonagem de estruturas complexas com facilidade         |-->
| Reflection               | Baixo acoplamento, clones sem alterar a classe original |

---
