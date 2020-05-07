package seventh_chapter.inheritance.animals.feilne;

import seventh_chapter.inheritance.animals.Pet;

public class Cat extends Feilne implements Pet {
    public Cat(){
        super("Cat");
    }

    @Override
    public void beFriendly() {
        System.out.println("Hello from " + getGenre().toUpperCase());
    }

    @Override
    public void play() {
        System.out.println("Lets Play ");
    }
}
