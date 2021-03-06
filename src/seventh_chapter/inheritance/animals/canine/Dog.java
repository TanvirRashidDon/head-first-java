package seventh_chapter.inheritance.animals.canine;

import seventh_chapter.inheritance.animals.Pet;

public class Dog extends Canine implements Pet {
    public Dog(){
        super("Dog");
    }

    @Override
    public void beFriendly() {
        System.out.println("Hello from " + getGenre().toUpperCase());
    }

    @Override
    public void play() {
        System.out.println("Lets Play");
    }
}
