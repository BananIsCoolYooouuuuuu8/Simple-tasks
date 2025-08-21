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
            public void generate(int length) {
                String password = "";
                for (int i = 1; i <= length; i++) {
                    boolean chooseLetter = random.nextBoolean();
                    char result;
                    if (chooseLetter) {
                        result = (char) ('A' + random.nextInt(26));
                    } else {
                        result = (char) ('0' + random.nextInt(10));
                    }
                    password += result;
                }
                System.out.println("Your password:");
                System.out.println(password);
            }
        }
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        passwordGenerator.generate(7);
    }
}
