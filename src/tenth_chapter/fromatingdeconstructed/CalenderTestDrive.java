package tenth_chapter.fromatingdeconstructed;

import java.util.Calendar;

public class CalenderTestDrive {
    public void doSomething(){
        Calendar c = Calendar.getInstance();

        c.set(2020, 0,7, 15, 40);
        System.out.println("Initial Date : " + c.getTime());

        long day1 = c.getTimeInMillis();
        day1 += 1000 * 60 * 60; // sec * minutes * hour

        c.setTimeInMillis(day1);
        System.out.println("New hour : " + c.get(c.HOUR_OF_DAY));

        c.add(c.DATE, 35);
        System.out.println("Add 35 dys : " + c.getTime());

        c.roll(c.DATE, 35); // Roll 35 days without changing the month
        System.out.println("Roll 35 dys : " + c.getTime());

        c.set(c.DATE, 1);
        System.out.println("Set to 1 : " + c.getTime());
    }
}
