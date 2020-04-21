package second_chapter.theguessinggame;

import java.lang.Math;

public class TheGuessingGame {
    int randNumber;

    Player p1 = new Player("player1");
    Player p2 = new Player("player2");
    Player p3 = new Player("player3");


    public TheGuessingGame(){
        this.randNumber = (int) (Math.random() * 10);
    }

    public void startGame(){
        System.out.println("Random Number for this event : " + randNumber);
        boolean flag = true;

        while (flag){
            int g1 = p1.guessANumber();
            int g2 = p1.guessANumber();
            int g3 = p3.guessANumber();

            if (g1 == randNumber){
                flag = false;
                p1.printPlayer();
                System.out.println("Guessed number : " + g1);
            }
            if (g2 == randNumber){
                flag = false;
                p2.printPlayer();
                System.out.println("Guessed number : " + g2);
            }
            if (g3 == randNumber){
                flag = false;
                p3.printPlayer();
                System.out.println("Guessed number : " + g3);
            }
        }
    }
}
