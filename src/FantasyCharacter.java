import java.util.Random;

public class FantasyCharacter {
    private String name;
    private int agility;
    private int health;
    private int experience;
    private int gold;
    private int power;

    public FantasyCharacter(String name, int agility, int health, int experience, int gold, int power) {
        this.name = name;
        this.agility = agility;
        this.health = health;
        this.experience = experience;
        this.gold = gold;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getAgility() {
        return agility;
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }

    public int getGold() {
        return gold;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int attack() {
        // Генерируем случайное значение для силы удара
        Random random = new Random();
        int minDamage = 5;
        int maxDamage = 15;
        return random.nextInt(maxDamage - minDamage + 1) + minDamage;
    }

    public void decreaseGold(int price, int potion_health) {
        if (gold >= price) {
            gold -= price;
            health += potion_health;
            System.out.println("Герой " + this.name + " отдал " + price + " золотых." +
                    "Зелье получено, здоровье увеличилось на " + potion_health + " единиц." +
                    " Остаток золота: " + gold + " золотых. " + " Показатель здоровья: " + (health + potion_health));
        } else {
            System.out.println("У героя " + this.name + " недостаточно средств для покупки зелья" +
                    " за " + price + " золотых.");
        }
    }
}