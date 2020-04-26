package tenth_chapter.staticsomething;

public class ObjectCounter {
    private static int objectCount; // default value is 0 for static variable also
    public static final double PI_CONSTANT = 3.141592653589793; // public static variable is constant

    public static int getObjectCount(){ return objectCount; }

    public ObjectCounter(){
        objectCount++;
    }
}
