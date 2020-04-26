package tenth_chapter.fromatingdeconstructed;

public class StaticMethodTestDrive {
    private int nonStatic;

    public int getNonStatic(){
        return nonStatic;
    }

    public static void doSomething(){
        // System.out.println("Trying to access non static variable : " + nonStatic); // Won't work
        // System.out.println("Trying to access non static method : " + getNonStatic()); // Won't work
        ObjectCounter obj1 = new ObjectCounter();
        System.out.println("Total Object : " + ObjectCounter.getObjectCount());

        ObjectCounter obj2 = new ObjectCounter();
        System.out.println("Total Object : " + ObjectCounter.getObjectCount());
    }

}
