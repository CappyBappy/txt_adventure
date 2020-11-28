import java.util.Scanner;
public class Main {
    static String option;
    static Scanner scanner = new Scanner(System.in);
    static String playerName;
    public static void main(String args[]) {

        System.out.println("Hello, and welcome to the amazing land of Newtopia! Let's get started! First, please enter your name.");
        playerName = scanner.nextLine();
        System.out.println("Ah, so you're "+playerName+"! Nice to meet you. I have one last question for you: what is your occupation? Don't be shy, this is very important to your time at Newtopia. (pick an option below)");
        characterSetup();

        switch(option) {
            case "A": 
                Magician.magicianStart();
            break;
            case "B":
                Barbarian.barbarianStart();
            break;
            case "C":
            Charlatan.charlatanStart();
            break;
            case "D":
            Knight.knightStart();
            break;
            case "E":
            System.out.println("description goes here");
            characterSetup();
            break;
            default: {
                System.out.println("please enter a valid choice.");
                characterSetup();
                
            }}
        }
    public static void characterSetup() {
        option = scanner.nextLine().toUpperCase();
        System.out.println("A. I'm a magican.");
        System.out.println("B. I'm a barbarian.");
        System.out.println("C. I'm a charlatan.");
        System.out.println("D. I'm a knight.");
        System.out.println("E. I'm not sure what I am.");
}
        

}