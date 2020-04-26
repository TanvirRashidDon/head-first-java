package tenth_chapter.fromatingdeconstructed;

public class ObjectCounter {
    private static int objectCount;

    public static int getObjectCount(){ return objectCount; }

    public ObjectCounter(){
        objectCount++;
    }
}
