package fifth_chapter.simpledotcom;

public class SimpleDotComTestDrive {
    public void doSomething(){
        int numOfGuess = 0;
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        GameHelper helper = new GameHelper();

        int randomNumber = (int) (Math.random() * 5);
        int [] locations = {randomNumber, randomNumber + 1, randomNumber + 2};

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
