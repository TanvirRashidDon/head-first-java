package tenth_chapter.fromatingdeconstructed;

import java.util.Date;

public class DateFormattingTestDrive {
    public void doSomething(){
        Date currentTime = new Date();
        System.out.println( "Current DataTime => " + String.format("%tc", currentTime));
        System.out.println( "Current Time => " + String.format("%tr", currentTime));

        System.out.println( "Day of week, month day => " + String.format("%tA, %tB %td", currentTime, currentTime, currentTime));
        System.out.println( "Day of week, month day => " + String.format("%tA, %<tB %<td", currentTime)); // better

    }
}
