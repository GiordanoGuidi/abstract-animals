package org.learning;

public class Eagle extends Animal{
    @Override
    public void howl() {
        System.out.println("waaaaahh");
    }

    @Override
    public void eat() {
        System.out.println("Sono un aquila mangio:carne,pesce");
    }
}
