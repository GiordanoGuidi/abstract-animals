package org.learning;

public class LittleSparrow extends Animal implements CanFly{
    @Override
    public void howl() {
        System.out.println("cheep-cheep");
    }

    @Override
    public void eat() {
        System.out.println("Sono un passerotto mangio:frutta,semi");
    }

    @Override
    public void fly() {
        System.out.println("Sono un passerotto Sto volandooo!!!");
    }
}
