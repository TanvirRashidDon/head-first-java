package tenth_chapter.fromatingdeconstructed;

public class NumberFormattingTestDrive {
    public void doSomething(){
        System.out.println("Formatting pattern : %[argument number] [flags] [width) [.precision)type");
        System.out.println("Formatting example : format(\"%,6.3f\", 1000000.9394294) is " + String.format("%,6.3f", 1000000.9394294));

        System.out.println("Integer to string : " + ("" + 1000000));
        System.out.println("Integer comma separated : " + String.format("%,d", 1000000));

        System.out.println("Float precession till four decimal : " + String.format("%.4f", 1000000.9394294));
        System.out.println("Float precession till two decimal with comma separated : " + String.format("%,.2f", 1000000.9394294));
    }
}
