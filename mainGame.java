public class mainGame {
    public mainGame() {
        
    }
    public static void main(String[] args) {
        gameFunctionality myGame=new gameFunctionality();
        System.out.println("Hello there, and welcome to the magical and amazing world of Newtopia!");
        String playerName= myGame.getName();
        System.out.println("Hi there, "+playerName+"! Ah, "+playerName+". What a majestic-sounding name.");
        int storyOption=myGame.getStory();
        //This is a long switch statement but essentially what it does is make it so that idiots can be idiots for a bit
        switch (storyOption) {
            case 1:
            Magician myMagician= new Magician(playerName);
            myMagician.magicianGame();
                break;
            case 2:
            Barbarian myBarbarian= new Barbarian(playerName);
            myBarbarian.barbarianGame();
                break;
            case 3:
            Mountebank myMountebank= new Mountebank(playerName);
            myMountebank.mountebankGame();
                break;
            case 4:
            Knight myKnight= new Knight(playerName);
            myKnight.knightGame();
                break;
            default:
                System.out.println("Please enter a valid option.");
                storyOption=myGame.getStory();
                switch (storyOption) {
                    case 1:
                    Magician mMagician= new Magician(playerName);
                    mMagician.magicianGame();
                        break;
                    case 2:
                    Barbarian mBarbarian= new Barbarian(playerName);
                    mBarbarian.barbarianGame();
                        break;
                    case 3:
                    Mountebank mMountebank= new Mountebank(playerName);
                    mMountebank.mountebankGame();
                        break;
                    case 4:
                    Knight mKnight= new Knight(playerName);
                    mKnight.knightGame();
                        break;
                    default:
                        System.out.println("Please enter a valid option.");
                        storyOption=myGame.getStory();
                        switch (storyOption) {
                            case 1:
                            Magician myMgician= new Magician(playerName);
                            myMgician.magicianGame();
                                break;
                            case 2:
                            Barbarian myBrbarian= new Barbarian(playerName);
                            myBrbarian.barbarianGame();
                                break;
                            case 3:
                            Mountebank myMuntebank= new Mountebank(playerName);
                            myMuntebank.mountebankGame();
                                break;
                            case 4:
                            Knight myKight= new Knight(playerName);
                            myKight.knightGame();
                                break;
                            default:
                                System.out.println("Please enter a valid option");
                                storyOption=myGame.getStory();
                                switch (storyOption) {
                                    case 1:
                                    Magician myMaician= new Magician(playerName);
                                    myMaician.magicianGame();
                                        break;
                                    case 2:
                                    Barbarian myBabarian= new Barbarian(playerName);
                                    myBabarian.barbarianGame();
                                        break;
                                    case 3:
                                    Mountebank myMontebank= new Mountebank(playerName);
                                    myMontebank.mountebankGame();
                                        break;
                                    case 4:
                                    Knight myKnght= new Knight(playerName);
                                    myKnght.knightGame();
                                        break;
                                    default:
                                        System.out.println("Please enter a valid option.");
                                        storyOption=myGame.getStory();
                                        switch (storyOption) {
                                            case 1:
                                            Magician myMagiian= new Magician(playerName);
                                            myMagiian.magicianGame();
                                                break;
                                            case 2:
                                            Barbarian myBarbaian= new Barbarian(playerName);
                                            myBarbaian.barbarianGame();
                                                break;
                                            case 3:
                                            Mountebank myMountbank= new Mountebank(playerName);
                                            myMountbank.mountebankGame();
                                                break;
                                            case 4:
                                            Knight myKniht= new Knight(playerName);
                                            myKniht.knightGame();
                                                break;
                                            default:
                                                System.out.println("Invalid option entered too many times. Please quit and restart.");
                                                storyOption=myGame.getStory();
                                 
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
    //I need to make an instance of the game function class in order for it to run