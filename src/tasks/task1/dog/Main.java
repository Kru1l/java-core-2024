package tasks.task1.dog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 4, "Vivchar");
        Dog dog2 = new Dog("Arny", 5, "Kane-Korso");
        Dog dog3 = new Dog("Bob", 3, "Sharpei");
        Dog dog4 = new Dog("Nex", 8, "Retriever");
        Dog dog5 = new Dog("Kun", 1, "Picines");

        Dog[] dogsArr = new Dog[5];
        dogsArr[0] = dog1;
        dogsArr[1] = dog2;
        dogsArr[2] = dog3;
        dogsArr[3] = dog4;
        dogsArr[4] = dog5;

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
