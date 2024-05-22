package org.learning;

public class Zoo{
    public static void main(String[] args) {
        //STEP 1 :Istanzio gli animale e utilizzo i metodi
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

        //STEP2:
        //Creo l'array con le istanze delle classi come elementi
        Animal[] zoo = {new Dog(),new LittleSparrow(),
                new Eagle(),new Dolphin()};
        for (int i = 0; i < zoo.length;i++){
            //Se l'indice dell'array è un istanza di Canfly eseguo il metodo
            if (zoo[i] instanceof CanFly){
                letItFly((CanFly) zoo[i]);
            }
            //Se l'indice dell'array è un istanza di CanSwim eseguo il metodo
            else if (zoo[i] instanceof CanSwim) {
                letItSwim((CanSwim) zoo[i]);
            }
        }
    }

    //Metodo per far volare le classi di CanFly
     public static void letItFly(CanFly animal){
        animal.fly();
    }
    //Metodo per far nuotare le istanze di CanSwim
     public static void letItSwim(CanSwim animal){
        animal.swim();
    }
}
