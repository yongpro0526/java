package day06;

//import day06.fruit.Apple;
//import day06.fruit.Melon;
import day06.fruit.*;
import day06.toy.Car;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Melon melon = new Melon();
        Car car = new Car();

        Scanner scan = new Scanner(System.in);

        int a = 1;
        System.out.println(a);
        System.out.println(apple);
        System.out.println(scan);
    }
}
