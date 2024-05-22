package org.learning;

public class Dolphin extends Animal implements CanSwim{
    @Override
    public void howl() {
        System.out.println("scr-scr");
    }

    @Override
    public void eat() {
        System.out.println("Sono un delfino mangio:pesce");
    }

    @Override
    public void swim() {
        System.out.println("Sono un delfino Sto nuotandooo!!!");
    }
}
