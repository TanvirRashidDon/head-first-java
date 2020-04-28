package sixteenth_chapter.collections;

public class JukBoxTestDrive {
    public void doSomething(){
        System.out.println("Using ArrayList : \n_____________");
        JukBoxArrayList player1 = new JukBoxArrayList();
        player1.go();

        System.out.println("Using TreeSet : \n_____________");
        JukBoxTreeSet player2 = new JukBoxTreeSet();
        player2.go();
    }
}
