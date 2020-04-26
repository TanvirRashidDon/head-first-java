package tenth_chapter.finalsomething;

public class FinalTestDrive {
    private final int constantInt = 123;

    private int changeConstantInt(){
        // constantInt = 12345; // Won't work
        return constantInt;
    }

    public void doSomething(){
        System.out.println(changeConstantInt());
    }

}
