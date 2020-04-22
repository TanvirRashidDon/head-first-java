package fifth_chapter.simpledotcom;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public void doSomething(){
        int numOfGuess = 0;
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        GameHelper helper = new GameHelper();

        int randomNumber = (int) (Math.random() * 5);
        ArrayList<String> locations = new ArrayList<String>();
        locations.add(Integer.toString(randomNumber));
        locations.add(Integer.toString(randomNumber + 1));
        locations.add(Integer.toString(randomNumber + 2));

        simpleDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            String userGuess = helper.getUserInput("Entet a number : ");

            String result = simpleDotCom.checkYourself(userGuess);

            numOfGuess++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took "  + numOfGuess + " guesses");
            }
            //System.out.println(testResult);
        }
    }

}
