package ClassPackage;

import InterfacePackage.*;

public class Dog implements WorkAnimal {

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void run() {
        System.out.println("Dog is runing...");
    }

    @Override
    public void sleap() {
        System.out.println("Dog is sleaping...");
    }

    @Override
    public void relax() {
        System.out.println("Dog is relax...");
    }
}
