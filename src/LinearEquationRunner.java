import java.util.Scanner;
public class LinearEquationRunner {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String int1 = scan.nextLine();
        int firstNum = int1.length();
        int commaPlace = int1.indexOf(",");
        String firstHalf = int1.substring(1 , commaPlace); // finds x
        String secHalf = int1.substring(commaPlace + 2, firstNum - 1 ); // finds y

        System.out.print("Enter coordinate 2: ");
        String int2 = scan.nextLine();
        int secLength = int2.length();
        int commaPlace2 = int2.indexOf(",");
        String firstHalf2 = int2.substring(1 , commaPlace2);
        String secHalf2 = int2.substring(commaPlace2 + 2, secLength - 1 );

        int x1 = Integer.parseInt(firstHalf);
        int y1 = Integer.parseInt(secHalf);
        int x2 = Integer.parseInt(firstHalf2);
        int y2 = Integer.parseInt(secHalf2);



        if (x1 == x2) {
            System.out.println("The equation of your line is x = " + x1);
            System.out.println("The inputted line is vertical, please try again.");
        } else {

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