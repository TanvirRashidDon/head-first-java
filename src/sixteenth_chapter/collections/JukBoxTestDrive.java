package sixteenth_chapter.collections;

public class JukBoxTestDrive {
    public void doSomething(){
        System.out.println("\nUsing ArrayList : \n_____________");
        JukBoxArrayList player1 = new JukBoxArrayList();
        player1.go();

        System.out.println("\nUsing TreeSet : \n_____________");
        // TreeSet needs objects to be extends from Comparable or a Comparator object while instantiate
        JukBoxTreeSet player2 = new JukBoxTreeSet();
        player2.go();
    }
}
