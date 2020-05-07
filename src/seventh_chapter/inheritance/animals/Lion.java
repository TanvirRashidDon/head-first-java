package seventh_chapter.inheritance.animals;

import seventh_chapter.inheritance.Animal;

public class Lion extends Animal {

    public Lion(){
        super("Lion");
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
}
