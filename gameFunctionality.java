import java.util.Scanner;
public class gameFunctionality {
    String playername;
//constructor
public gameFunctionality() {

}
public String getName() {
    Scanner scanner= new Scanner(System.in);
    System.out.println("I haven't seen you before- what is your name?");
    System.out.println("(Please enter your name)");
    String playerName= scanner.nextLine();
    return playerName;
}
public int getStory() {
    Scanner scanner= new Scanner(System.in);
    System.out.println("And what happens to be your occupation?");
    System.out.println("1. I'm a magician.");
    System.out.println("(Magicians have high magic attack, high magic defense, very low regular defense,");
    System.out.println("very low regular attack, moderate wealth, and the healing ability)");
    System.out.println("2. I'm a barbarian");
    System.out.println("(Barbarians have no magic attack, low magic defense, moderate regular defense,");
    System.out.println("very high regular attack, low wealth, and the berserk ability)");
    System.out.println("3. I'm a mountebank");
    System.out.println("(Mountebanks have moderate magic attack, moderate defense, low regular defense,");
    System.out.println("moderate regular attack, high wealth, and the smooth tongue ability)");
    System.out.println("4. I'm a knight");
    System.out.println("(Knights have moderate magic attack, high magic defense, very high regular defense,");
    System.out.println("moderate regular attack, high wealth, and the horse ability)");
    int storyOption= scanner.nextInt();
    return storyOption;

}

}
