public class Mountebank {
    String name;
    int health;
    int attack;
    int mAttack;
    int wealth;
    int defense;
    int mDefense;
    String[] inventory;
    public Mountebank(String nam) {
        name=nam;
        health=100;

    }
    public void mountebankGame() {
        System.out.println("The adventure begins for the mountebank. "+name);
    }
}
