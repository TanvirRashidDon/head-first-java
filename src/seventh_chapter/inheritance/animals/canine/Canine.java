package seventh_chapter.inheritance.animals.canine;

import seventh_chapter.inheritance.animals.Animal;

public abstract class Canine extends Animal {
    public Canine(String genre){
        super(genre);
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("Meat");
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Howl..");
    }

    @Override
    public void roam(){
        super.roam();
        System.out.println("And will attack you if I don't like you");
    }
}
