public class Merchant implements Seller {
    private String name;
    private int gold;
    private int price;

    public Merchant(String name, int gold, int price) {
        this.name = name;
        this.gold = gold;
        this.price = price;
    }
    @Override
    public String trade(Player player) {
        String result = "";
        if (player != null && player.getGold() >= price) {
            player.setGold(player.getGold() - price);
            gold += price;
            result = "Вы купили зелье за " + this.price + " золота. У вас осталось " + player.getGold() + " золота. " +
                    "Желаете продолжить покупки? (да/нет)";
        } else {
            result = "У вас нет на это денег. Хотите выйти? (да/нет)";
        }
        return result;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void increaseGold(int price) {
        gold += price;
        System.out.println("Торговец получил " + price + " золота.");
    }

    public enum Goods {
        POTION
    }
}