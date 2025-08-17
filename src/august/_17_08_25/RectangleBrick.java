package august._17_08_25;

import java.util.Scanner;

public class RectangleBrick {
    public static void main(String[] args) {
        ///TODO: дописать для других сторон.
        //brick: 2x3x6     hole: 3x2
        //2x3 2x6 3x6
        //if brickLength <= holeLength && brickWidth <= holeWidth || brickWidth <= holeLength && brickLength <= holeWidth
        //brickLength x brickWidth    brickLength x brickHeight    brickWidth x brickHeight
        Scanner in = new Scanner(System.in);
        System.out.println("Enter holeLength:");
        int holeLength = in.nextInt();
        System.out.println("Enter holeWidth:");
        int holeWidth = in.nextInt();
        System.out.println("Enter brickLength:");
        int brickLength = in.nextInt();
        System.out.println("Enter brickWidth:");
        int brickWidth = in.nextInt();
        System.out.println("Enter brickHeight:");
        int brickHeight = in.nextInt();
        boolean firstSideComparison = brickLength <= holeLength && brickWidth <= holeWidth || brickWidth <= holeLength && brickLength <= holeWidth;
        boolean secondSideComparison = brickLength <= holeLength && brickHeight <= holeWidth || brickHeight <= holeLength && brickLength <= holeWidth;
        boolean thirdSideComparison = brickWidth <= holeLength && brickHeight <= holeWidth || brickHeight <= holeLength && brickWidth <= holeWidth;
        if (firstSideComparison || secondSideComparison || thirdSideComparison) {
            System.out.println("The brick goes through the hole");
        } else {
            System.out.println("The brick not goes through the hole");
        }
    }
}
