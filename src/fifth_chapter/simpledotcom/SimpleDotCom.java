package fifth_chapter.simpledotcom;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells;
    //private int numberOfHits; // 0 is default value for numeric instance variable

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userGuss){

        String result = "miss";

        int index = locationCells.indexOf(userGuss); // return -1 if not found

        if(index >= 0 ){
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            }else{
                result = "hit";
            }
        }

        System.out.println(result);

        return result;
    }
}
