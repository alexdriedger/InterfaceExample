# InterfaceExample
An simple example of how interfaces are useful in Java.

## Code

### Enemy Interface

```java
public interface Enemy {
    public int getHealth();
    public void doNextTurn();
}
```

### Implementing Classes

**Slime**

```java
public class Slime implements Enemy {

    private static final int startingHealth = 30;

    private int health;

    public Slime() {
        this.health = startingHealth;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void doNextTurn() {
        if (health < 15) {
            System.out.println("Do big attack");
        } else {
            System.out.println("I have lots of health");
        }
    }

    public void getSlimed() {
        System.out.println("HAHAHAHAHA you got slimed.");
    }
}
```
**Goblin**

```java
public class Goblin implements Enemy {

    private int health;

    public Goblin() {
        this.health = 22;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void doNextTurn() {
        System.out.println("Me a goblin. Boom");
    }
}

```

### Main Class

```java
// Making a room of `Enemy`s. Notice how we can make a list of `Enemy`s because both `Slime` and `Goblin` implement `Enemy`
List<Enemy> room = new ArrayList<>();
room.add(new Slime());
room.add(new Goblin());
room.add(new Slime());

// We can now iterate through the list of `Enemy`s and call `doNextTurn` because that method is defined in the `Enemy` interface
for (Enemy e: room) {
    e.doNextTurn();
}
```
