package tyreso.gymnasium.BlackJack;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BlackJack {

    //********** VARIABLES ************//
    //1.1 Initialize a new deck(Deck)
    Deck deck = new Deck();
    //1.2 Initialize a new hand(Hand)
    Hand playerHand = new Hand();
    //1.3 Initialize player money(int)
    static int playerMoney = 0;
    //1.4 Initialize a new dealer(Hand)
    Hand dealer = new Hand();

    public static void main(String[] args) {

        System.out.println("Welcome to BlackJack!");

        //************** GAME START *************//
        displayUserStartGameMenu();
    }

    static void displayUserStartGameMenu(){
        //2.1 Start game
        //2.2 Display player money
        System.out.println("Here you see your money burning away in lightning speed!");
        System.out.println("You currently have: " + playerMoney + "$");
        System.out.println("Start game press yes if you don't want to start the game then press no");
        //2.3 Ask the player if they want to start the game or not
        //2.3.1 yes=go to 3.1
        while(true){

            Scanner scanner = new Scanner(System.in);
            String startGame = scanner.next();
            if (startGame.equals("yes")) {
                //start game
                startGame();
            } else if (startGame.equals("no")) {
                //todo fix
                //2.3.2 no=go to (print withdrawal message)
                System.exit(0);
            } else {
                //display error message

                //restart loop
            }
        }


    }

    static void startGame(){
        System.out.println("Game logic goes here");

        //3.1 How much money do you wanna bet?
        while(true) {
            System.out.println("How much money do you want to bet?");
            break;
        }
            //3.2 Player puts in the amount
        
            //3.3 Dealer gives player two cards
            //turn one of the cards face up
            //3.4 Dealer gives itself two cards
            //turn one card face up
            //3.5 Display all cards to player by printing to console
            //3.6 Kontrollera om spelaren har fått blackjack
            //3.6.1 om ja gå till X.X (lägg till vinst i player money)
            //3.6.2 om nej gå till 3.7
            //3.7 Fråga spelaren om hen vill ha ett till kort
            //om ja ge ett till kort
            //om nej ge givaren ett till kort
            //3.8 Kontrollera om spelaren
            //har fått mer än 21
            //har fått 21
            //3.9 Räkna hur mycket poäng givaren och spelaren har fått
            //3.9.1 om spelaren har fått mer än givaren så ge pengarna till spelaren
            //3.9.2 om spelaren har fått mindre än givaren så ge inte tillbaka hens pengar
            //3.9.3 om spelaren har fått lika mycket som givaren så ge inte tillbaka hens pengar
            //4.0 fråga om spelaren vill spela igen

        }
}
