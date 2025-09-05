##  State

O padrão de projeto State é um padrão comportamental que permite que um objeto altere seu comportamento quando seu estado interno muda. Vou te mostrar um exemplo simples em Java.

Imagine que temos uma classe Package que pode estar em três estados: OrderedState, DeliveredState e ReceivedState. Cada estado terá um comportamento diferente.
Primeiro, definimos a interface PackageState:

```java
public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
```

Agora, implementamos os estados concretos:
```java
public class OrderedState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}

public class DeliveredState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}

public class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package received by client.");
    }
}
```
Finalmente, a classe Package que gerencia os estados:

```java
public class Package {
    private PackageState state = new OrderedState();

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
```
Com isso, você pode criar um objeto Package e mudar seu estado:
```java
public class StatePatternDemo {
    public static void main(String[] args) {
        Package pkg = new Package();
        
        pkg.printStatus();
        pkg.nextState();
        
        pkg.printStatus();
        pkg.nextState();
        
        pkg.printStatus();
        pkg.previousState();
        
        pkg.printStatus();
    }
}
```
O padrão State pode ser usado para gerenciar estados de forma limpa e organizada. 
