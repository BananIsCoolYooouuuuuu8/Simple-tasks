package august._29_08_25;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class CollectionsCars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<>();
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
                    int carName2Index = cars.indexOf(carName2);
                    if (carName2Index > -1) {
                        cars.remove(carName2Index);
                        System.out.println("Car " + carName2 + " successfully deleted");
                        break;
                    }
                    break;
                case 3:
                    cars.forEach(string -> System.out.println(string));
//                    cars.forEach(new Consumer<String>() {
//                        @Override
//                        public void accept(String string) {
//                            System.out.println(string);
//                        }
//                    });
//                    for (String car : cars) {
//                        System.out.println(car);
//                    }
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
