package seventh_chapter.inheritance.animals.feilne;

import seventh_chapter.inheritance.animals.Animal;

public abstract class Feilne extends Animal {

    public Feilne(String genre){
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
        System.out.println("Roar..");
    }

    @Override
    public void roam(){
        super.roam();
        System.out.println("And don't come inside my Territory");
    }
}
