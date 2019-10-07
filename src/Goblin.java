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
