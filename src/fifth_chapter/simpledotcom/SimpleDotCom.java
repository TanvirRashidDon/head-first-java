package fifth_chapter.simpledotcom;

public class SimpleDotCom {
    private int [] locationCells;
    private int nuberOfHits; // 0 is default value for numeric instance variable

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userGuss){
        int guess = Integer.parseInt(userGuss);

        String result = "miss";

        for(int cell : locationCells){
            if(guess ==  cell) {
                result = "hit";
                nuberOfHits += 1;
                break;
            }
        }

        if(nuberOfHits == locationCells.length){
            result = "kill";
        }

        System.out.println(result);

        return result;
    }
}
