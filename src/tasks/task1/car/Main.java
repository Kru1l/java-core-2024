package tasks.task1.car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 170, 2.5, true);
        Car car2 = new Car("Audi", 190, 4.0, false);
        Car car3 = new Car("Toyota", 150, 2.2, true);
        Car car4 = new Car("Mercedes", 230, 3.2, true);
        Car car5 = new Car("Honda", 130, 1.8, false);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}