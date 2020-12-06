public class Magician {
    String name;
    int health;
    int attack;
    int mAttack;
    int wealth;
    int defense;
    int mDefense;
    String[] inventory;
    public Magician(String nam) {
        name=nam;
        health=100;

    }
    public void magicianGame() {
        System.out.println("The adventure begins for the magician. "+name);
    }
}
