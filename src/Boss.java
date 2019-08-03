import java.util.Random;

public class Boss {
    int heals;
    int taken;
    int defense;

    public int changeDefense() {
        Random random = new Random();
        defense = random.nextInt(90);

        System.out.println(defense);

        return defense;
    }

    public int getHeals() {
        return heals;
    }

    public void setHeals(int Heals) {
        this.heals = Heals;
    }

    public int getTaken() {
        return taken;
    }

    public void setTaken(int taken) {
        this.taken = taken;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}