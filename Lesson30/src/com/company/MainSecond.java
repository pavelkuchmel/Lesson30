package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainSecond {
    public static void filterCars(List<Car> cars, Predicate<Car> predicate, Consumer<Car> consumer){
        for (Car car : cars) {
            if (predicate.test(car)){
                consumer.accept(car);
            }
        }
    }

    public static void main(String[] args) {
        List<Car> casrs = new ArrayList<>();
        Car car1 = new Car(Car.Body.CABRIOLET, 200, "Maseratti");
        Car car2 = new Car(Car.Body.SEDAN, 150, "Nissan");
        Car car3 = new Car(Car.Body.ROADSTER, 666, "Toyota");
        Car car4 = new Car(Car.Body.VAGON, 500, "BMW");
        Car car5 = new Car(Car.Body.ROADSTER, 100, "PEUGEOT");
        Car car6 = new Car(Car.Body.COUPE, 334, "AUDI");

//        casrs.add(car1);
//        casrs.add(car2);
//        casrs.add(car3);

        casrs.addAll(Arrays.asList(car1, car2, car3, car4, car5, car6));

        filterCars(casrs, (Car car) -> {return car.getPower() >= 200;}, (Car car) -> {
            System.out.println(car);
        });

        System.out.println();

        filterCars(casrs, (car) -> {return car.getBody()/* .equals(Car.Body.ROADSTER)*/ == Car.Body.ROADSTER;}, (car) -> {
            System.out.println(car);
        });

        System.out.println();

        filterCars(casrs, car -> {return (car.getBody() == Car.Body.SEDAN) && (car.getPower() < 200);}, car -> System.out.println(car));
    }
}
