package seventh_chapter.inheritance.animals;

import seventh_chapter.inheritance.Animal;

public class Hippopotamus extends Animal {

    public Hippopotamus(){
        super("Hippopotamus");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("Plant");
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Hipps..");
    }
}
