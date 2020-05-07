package seventh_chapter.inheritance;

import seventh_chapter.inheritance.animals.Animal;
import seventh_chapter.inheritance.animals.Hippopotamus;
import seventh_chapter.inheritance.animals.canine.Dog;
import seventh_chapter.inheritance.animals.canine.Wolf;
import seventh_chapter.inheritance.animals.feilne.Lion;
import seventh_chapter.inheritance.animals.feilne.Tiger;

public class AnimalTestDrive {

    public void doSomething(){
        doSameJob();
        //callSubclassBehaviourBySuperclass();
    }

    private void doSameJob(){
        Animal[] animals = new Animal[5];

        animals[0] = new Hippopotamus();
        animals[1] = new Lion();
        animals[2] = new Tiger();
        animals[3] = new Wolf();
        animals[4] = new Dog();

        for(Animal animal : animals){
            animal.makeNoise();
        }
    }
    private void callSubclassBehaviourBySuperclass(){
        Animal animal = new Lion();
        animal.makeNoise();
        animal.eat();
        animal.sleep();
        animal.roam();
    }
}
