package ClassPackage;

import InterfacePackage.*;

public class Cat implements WorkAnimal {

    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void run() {
        System.out.println("Cat is runing...");
    }

    @Override
    public void sleap() {
        System.out.println("Cat is sleaping...");
    }

    @Override
    public void relax() {
        System.out.println("Cat is relax...");
    }
}
