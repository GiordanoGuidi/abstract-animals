package org.learning;

public class Zoo {
    public static void main(String[] args) {
        //Istanzio gli animale e utilizzo i metodi
        Dog dog= new Dog();
        dog.sleep();
        dog.eat();
        dog.howl();
        LittleSparrow littleSparrow = new LittleSparrow();
        littleSparrow.sleep();
        littleSparrow.eat();
        littleSparrow.howl();
        Eagle eagle= new Eagle();
        eagle.sleep();
        eagle.eat();
        eagle.howl();
        Dolphin dolphin=new Dolphin();
        dolphin.sleep();
        dolphin.eat();
        dolphin.howl();
    }
}
