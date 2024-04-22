public class Player {
    private String name;
    private int gold;

    public Player(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
