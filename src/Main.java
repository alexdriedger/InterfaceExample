import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Enemy> room = new ArrayList<>();
        room.add(new Slime());
        room.add(new Goblin());
        room.add(new Slime());

        for (Enemy e: room) {
            e.doNextTurn();
        }
    }
}
