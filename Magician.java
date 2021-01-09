import java.util.Scanner;
public class Magician {
    String name;
    int health;
    int attack;
    int mAttack;
    int wealth;
    int defense;
    int mDefense;
    public Magician(String nam) {
        name=nam;
        health=100;
        mAttack=100;
        mDefense=70;
        defense=10;
        attack=20;
        wealth=50;

    }
    public void magicianGame() {
        System.out.println("Good morning! You wake up and look outside. It's a bright, clear morning. What will you do?");
        System.out.println("1. Look around my house.");
        System.out.println("2. Go outside.");
        Scanner scanner= new Scanner(System.in);
        int option= scanner.nextInt();
        if(option==1) {
            System.out.println("You look around your house and see a couple of dust bunnies surrounding your wand.");
            System.out.println("You pick up your wand and put it in your bag.");
            mAttack+=10;
            System.out.println("You go outside.");
        }
        else{ 
            System.out.println("You go outside.");
        }
        System.out.println("Your Magician neighbor Jerry runs to you in an absolute frenzy. Do you-");
        System.out.println("1. Ask him what is going on.");
        System.out.println("2. Walk away slowly. Jerry's always been crazy.");
        option=scanner.nextInt();
        if(option==1) {
            System.out.println("Jerry says 'Ahhhhh! The evil monster has escaped its volcano prison! You have to go fight it and save us!");
            System.out.println("Let me teach you a healing spell. All you do is wave your wand in a circle, then say 'burgalo'.");
            System.out.println("This should help you with your travels. Good luck!'");
            System.out.println("You thank Jerry for the information, and start heading up a long, winding path towards the volcano.");
            System.out.println("You realize that you've forgotten your magical shield, and turn back to your village.");
        } else {
            System.out.println("You slowly walk away, hoping that Jerry doesn't notice you, then start running at full speed away from him.");
            System.out.println("As you are running, you find yourself going up a long, winding path towards a cloudy volcano.");
            System.out.println("When the coast seems clear, you start heading back to your village.");
        }
        System.out.println("As you reach the mouth of the path, you notice that a wall of fire separates you from your village.");
        System.out.println("There's no going back now. You turn around, and walk towards the volcano, unsure of your future.");
        System.out.println("As you're turning around, you see a little blue flame. Looking closer, you realize it's a monster! Do you-");
        Monster blueFlame= new Monster("Blue Flame", 20, 5, 15, 30, 30);
        System.out.println("1. Attack it with Magic!");
        System.out.println("2. Attack it with force!");
        System.out.println("3. Use a healing spell!");
        System.out.println("4. Run from it!");
        option=scanner.nextInt();
        switch(option) {
            case 1:
            blueFlame.health-=mAttack;
            if (blueFlame.health <)
            break;
            case 2:

            break;

            case 3:

            break;

            default:

            break;
        }
    }
}
