public class Barbarian {
    String name;
    int health;
    int attack;
    int mAttack;
    int wealth;
    int defense;
    int mDefense;
    String[] inventory;
    public Barbarian(String nam) {
        name=nam;
        health=100;

    }
    public void barbarianGame() {
        System.out.println("The adventure begins for the barbarian. "+name);
    }
}
