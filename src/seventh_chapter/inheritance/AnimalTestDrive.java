package seventh_chapter.inheritance;

import seventh_chapter.inheritance.animals.Hippopotamus;

public class AnimalTestDrive {

    public void doSomething(){
        Animal animal = new Hippopotamus(   );
        animal.makeNoise();
        animal.eat();
        animal.sleep();
        animal.roam();
    }
}
