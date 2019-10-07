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
