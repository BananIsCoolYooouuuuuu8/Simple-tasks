package august._21_08_25;

import java.util.Random;
import java.util.Scanner;

public class MainGP {

    public static void main(String[] args) {
        System.out.println("Enter password length:");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        class PasswordGenerator {

            Random random = new Random();
            String passwordChars = "abcdefghijklmnopqrstuvwxyz1234567890";

            public void generate(int length) {
                String password = "";
                for (int i = 1; i <= length; i++) {
                    int randomPosition = random.nextInt(passwordChars.length());
                    char randomSymbol = passwordChars.charAt(randomPosition);
                    password += randomSymbol;
                }
                System.out.println("Your password:");
                System.out.println(password);
            }
        }
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        passwordGenerator.generate(length);
    }
}
