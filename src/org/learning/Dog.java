package org.learning;

public class Dog extends Animal {

    @Override
    public void howl() {
        System.out.println("Bau-Bau");
    }

    @Override
    public void eat() {
        System.out.println("Sono un cane mangio:carne,croccantini");
    }
}
