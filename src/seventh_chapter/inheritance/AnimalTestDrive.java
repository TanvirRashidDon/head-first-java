package seventh_chapter.inheritance;

import seventh_chapter.inheritance.animals.Animal;
import seventh_chapter.inheritance.animals.Hippopotamus;
import seventh_chapter.inheritance.animals.canine.Dog;
import seventh_chapter.inheritance.animals.canine.Wolf;
import seventh_chapter.inheritance.animals.feilne.Cat;
import seventh_chapter.inheritance.animals.feilne.Lion;
import seventh_chapter.inheritance.animals.feilne.Tiger;

public class AnimalTestDrive {

    public void doSomething(){
        doSameJob();
        petBeheviour();
    }

    private void petBeheviour(){
        Dog dog = new Dog();
        dog.beFriendly();
        dog.play();
    }

    private void doSameJob(){
        Animal[] animals = new Animal[6];

        animals[0] = new Hippopotamus();
        animals[1] = new Lion();
        animals[2] = new Tiger();
        animals[3] = new Wolf();
        animals[4] = new Dog();
        animals[5] = new Cat();

        for(Animal animal : animals){
            callSubclassBehaviourBySuperclass(animal);
        }
    }
    private void callSubclassBehaviourBySuperclass(Animal animal){
        //Animal animal = new Lion();
        animal.makeNoise();
        //animal.eat();
        //animal.sleep();
        //animal.roam();
    }
}
