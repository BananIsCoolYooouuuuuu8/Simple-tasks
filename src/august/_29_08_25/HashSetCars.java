package august._29_08_25;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetCars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> cars = new HashSet<>();
        while (true) {
            System.out.println("1 - add car.");
            System.out.println("2 - remove car.");
            System.out.println("3 - display the current car list.");
            System.out.println("4 - end the program");
            int moveChoice = in.nextInt();
            in.nextLine();
            switch (moveChoice) {
                case 1:
                    System.out.println("Enter car name:");
                    String carName = in.nextLine();
                    cars.add(carName);
                    System.out.println("Car " + carName + " successfully added");
                    break;
                case 2:
                    System.out.println("Enter car name:");
                    String carName2 = in.nextLine();
                    if (cars.remove(carName2)) {
                        System.out.println("Car " + carName2 + " successfully deleted");
                    } else {
                        System.out.println("Car " + carName2 + " was not deleted");
                    }
                    break;
                case 3:
                    for (String car : cars) {
                        System.out.println(car);
                    }
                    break;
                case 4:
                    System.out.println("Program is end");
                    return;
                default:
                    System.out.println("Incorrect mode is specified");
            }
        }
    }
}
