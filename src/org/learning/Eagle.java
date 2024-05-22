package org.learning;

public class Eagle extends Animal implements CanFly{
    @Override
    public void howl() {
        System.out.println("waaaaahh");
    }

    @Override
    public void eat() {
        System.out.println("Sono un aquila mangio:carne,pesce");
    }

    @Override
    public void fly() {
        System.out.println("Sto volandooo!!!");
    }
}
