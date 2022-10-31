import java.util.Scanner;
public class LinearEquationRunner {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String int1 = scan.nextLine();
        int firstNum = int1.length();
        int commaPlace = int1.indexOf(","); // Looks for the index of the comma.
        String firstHalf = int1.substring(1 , commaPlace); // Finds the x-value.
        String secHalf = int1.substring(commaPlace + 2, firstNum - 1 ); // Finds the y-value.

        System.out.print("Enter coordinate 2: ");
        String int2 = scan.nextLine();
        int secLength = int2.length();
        int commaPlace2 = int2.indexOf(","); // Looks for the index of the comma.
        String firstHalf2 = int2.substring(1 , commaPlace2); // Finds the x-value.
        String secHalf2 = int2.substring(commaPlace2 + 2, secLength - 1 ); // Finds the y-value.

        // Parsing all the previous Strings into Integers.
        int x1 = Integer.parseInt(firstHalf);
        int y1 = Integer.parseInt(secHalf);
        int x2 = Integer.parseInt(firstHalf2);
        int y2 = Integer.parseInt(secHalf2);


        // If the x values are equal to each other the rest of the program won't run.
        if (x1 == x2) {
            System.out.println("The equation of your line is x = " + x1);
            System.out.println("The inputted line is vertical, please try again.");
        } else {
            // Creation of the equation with each of the respective x and y values.
            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
            // Printing out all necessary information about the line given the previous point inputs.
            System.out.println("");
            System.out.println("----- Line info -----");
            System.out.println(equation.lineInfo());
            System.out.println();
            System.out.print("Enter a value for x: ");
            double xValue = scan.nextDouble();
            System.out.println("Coordinate for x: " + equation.coordinateForX(xValue));
        }
    }
}