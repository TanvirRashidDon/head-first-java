package fifth_chapter.simpledotcom;

public class SimpleDotComTestDrive {
    public void doSomething(){
        SimpleDotCom simpleDotCom = new SimpleDotCom();

        int [] locations = {1, 3, 5};
        simpleDotCom.setLocationCells(locations);

        String userGuess = "2";

        String result = simpleDotCom.checkYourself(userGuess);

        String testResult = "failed";

        if(result.equals("hit")){
            testResult = "Pass";
        }

        System.out.println(testResult);
    }

}
