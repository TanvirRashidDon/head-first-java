package seventh_chapter.inheritance;

import seventh_chapter.inheritance.animals.Hippopotamus;
import seventh_chapter.inheritance.animals.Lion;

public class AnimalTestDrive {

    public void doSomething(){
        callSubclassBehaviourBySuperclass();
    }

    private void callSubclassBehaviourBySuperclass(){
        Animal animal = new Lion();
        animal.makeNoise();
        animal.eat();
        animal.sleep();
        animal.roam();
    }
}
