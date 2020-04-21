package second_chapter.theguessinggame;

public class Player {
    String name;

    public Player(String name){
        this.name = name;
    }

    public int guessANumber(){
        return (int) (Math.random() * 10);
    }

    public void printPlayer(){
        System.out.println("WInner : " + this.name);
    }
}
