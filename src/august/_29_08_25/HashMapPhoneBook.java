package august._29_08_25;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPhoneBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> phoneNumbers = new HashMap<>();
        while (true) {
            System.out.println("1 - add phone number.");
            System.out.println("2 - remove phone number.");
            System.out.println("3 - display the current phone number list.");
            System.out.println("4 - end the program");
            int moveChoice = in.nextInt();
            in.nextLine();
            switch (moveChoice) {
                case 1:
                    System.out.println("Enter phone number");
                    String phoneNumber = in.nextLine();
                    System.out.println("Enter name:");
                    String name = in.nextLine();
                    if (phoneNumbers.containsKey(name)) {
                        System.out.println("The number " + name + " is already in the phone book.");
                    } else {
                        phoneNumbers.put(name, phoneNumber);
                        System.out.println("Phone number " + phoneNumber + " successfully added, " + "name: " + name);
                    }
                    break;
                case 2:
                    System.out.println("Enter phone number");
                    String phoneNumber2 = in.nextLine();
                    System.out.println("Enter name:");
                    String name2 = in.nextLine();
                    if (!(phoneNumbers.containsKey(name2))) {
                        System.out.println(name2 + " is not found in the phone book");
                    } else {
                        phoneNumbers.remove(name2, phoneNumber2);
                        System.out.println("Car " + name2 + " successfully deleted");
                    }
                    break;
                case 3:
                    for (String phoneNumberForEach : phoneNumbers.keySet()) {
                        System.out.println("Key: " + phoneNumberForEach + ", phone number: " + phoneNumbers.get(phoneNumberForEach));
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
