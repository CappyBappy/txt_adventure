public class Knight {
    String name;
    int health;
    int attack;
    int mAttack;
    int wealth;
    int defense;
    int mDefense;
    String[] inventory;
    public Knight(String nam) {
        name=nam;
        health=100;

    }
    public void knightGame() {
        System.out.println("The adventure begins for the knight. "+name);
    }
}
