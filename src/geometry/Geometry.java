/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import java.util.Scanner;

/**
 *
 * @author rciarl8967
 */
public class Geometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;       // The user's choice
        double value = 0; // The method's return value
        char letter;      // The user's Y or N decision
        double radius;    // The radius of the circle
        double length;    // The length of the rectangle
        double width;     // The width of the rectangle
        double height;    // The height of the triangle
        double base;      // The base of the triangle
        double side1;     // The first side of the triangle
        double side2;     // The second side of the triangle
        double side3;     // The third side of the triangle

        // Create a scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // The do loop allows the menu to be displayed first
        do {
            // TASK #1 Call the printMenu method
            printMenu();

            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of "
                            + "the circle: ");
                    radius = keyboard.nextDouble();

                    // TASK #3 Call the circleArea method and
                    // store the result in the value variable
                    value = circleArea(radius);

                    System.out.printf("The area of the "
                            + "circle is %.2f:\n", value);
                    break;
                case 2:
                    System.out.print("Enter the length of "
                            + "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of "
                            + "the rectangle: ");
                    width = keyboard.nextDouble();

                    // TASK #3 Call the rectangleArea method and
                    // store the result in the value variable
                    value = rectangleArea(length, width);

                    System.out.printf("The area of the "
                            + "rectangle is %.2f:\n ", value);
                    break;
                case 3:
                    System.out.print("Enter the height of "
                            + "the triangle: ");
                    height = keyboard.nextDouble();
                    System.out.print("Enter the base of "
                            + "the triangle: ");
                    base = keyboard.nextDouble();

                    // TASK #3 Call the triangleArea method and
                    // store the result in the value variable
                    value = triangleArea(height, base);

                    System.out.printf("The area of the "
                            + "triangle is %.2f:\n ", value);
                    break;
                case 4:
                    System.out.print("Enter the radius of "
                            + "the circle: ");
                    radius = keyboard.nextDouble();

                    // TASK #3 Call the circumference method and
                    // store the result in the value variable
                    value = circleCircumference(radius);

                    System.out.printf("The circumference "
                            + "of the circle is %.2f:\n ",
                            value);
                    break;
                case 5:
                    System.out.print("Enter the length of "
                            + "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of "
                            + "the rectangle: ");
                    width = keyboard.nextDouble();

                    // TASK #3 Call the perimeter method and
                    // store the result in the value variable
                    value = rectanglePerimeter(length, width);

                    System.out.printf("The perimeter of "
                            + "the rectangle is %.2f:\n ",
                             value);
                    break;
                case 6:
                    System.out.print("Enter the length of "
                            + "side 1 of the "
                            + "triangle: ");
                    side1 = keyboard.nextDouble();
                    System.out.print("Enter the length of "
                            + "side 2 of the "
                            + "triangle: ");
                    side2 = keyboard.nextDouble();
                    System.out.print("Enter the length of "
                            + "side 3 of the "
                            + "triangle: ");
                    side3 = keyboard.nextDouble();

                    // TASK #3 Call the perimeter method and
                    // store the result in the value variable
                    value = trianglePerimeter(side1, side2, side3);
                    System.out.printf("The perimeter of "
                            + "the triangle is %.2f:\n ",
                             value);
                    break;
                default:

                    System.out.println("You did not enter "
                            + "a valid choice.");
            }
            keyboard.nextLine(); // Consume the new line

            System.out.println("Do you want to exit "
                    + "the program (Y/N)?: ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);

        } while (letter != 'Y' && letter != 'y');
    }

    // TASK #1 Create the printMenu method here
    public static void printMenu() {

        /**
         * Task 4 
         * Prints a menu for the user to choose from.
         */
        System.out.println("This is a geometry calculator");
        System.out.println("Choose what you would like to calculate");
        System.out.println("1. Find the area of a circle");
        System.out.println("2. Find the area of a rectangle");
        System.out.println("3. Find the area of a triangle");
        System.out.println("4. Find the circumference of a circle");
        System.out.println("5. Find the perimeter of a rectangle");
        System.out.println("6. Find the perimeter of a triangle");
        System.out.println("Enter the number of your choice:");
    }

    // TASK #2 Create the value-returning methods here
    public static double circleArea(double radius) {
        /**
         * Task 4 Calculates the area of a circle.
         *
         * @param radius - the radius variable entered by the user.
         * @return - returns the value variable to case 1
         */
        double value;
        value = Math.PI * (radius * radius);
        return value;

    }

    public static double rectangleArea(double length, double width) {
        /**
         * Task 4 Calculates the area of a rectangle.
         *
         * @param length - first numeric value for operation
         * @param width - second numeric value for same purposes
         * @return value of two operands
         */
        double value;
        value = length * width;
        return value;
    }

    public static double triangleArea(double height, double base) {
        /**
         * Task 4 Calculates the area of a triangle.
         *
         * @param base - first numeric value for the operation
         * @param operand2 - second numeric value for same purposes
         * @return value of two operands
         */
        double value;
        value = (base * height) / 2;
        return value;
    }

    public static double circleCircumference(double radius) {

        /**
         * Task 4 Calculates the circumference of a circle.
         *
         * @param radius - numeric value for the operation
         * @return value of the circumference
         */
        double value;
        value = Math.PI * 2 * radius;
        return value;
    }

    public static double rectanglePerimeter(double length, double width) {
        /**
         * Task 4 Calculates the perimeter of a rectangle
         *
         * @param length - first numeric value for the ADD operation
         * @param width - second numeric value for same purposes
         * @return value of the perimeter
         */
        double value;
        value = 2 * (length + width);
        return value;
    }

    public static double trianglePerimeter(double side1, double side2, double side3) {
        /**
         * Task 4 Calculates the perimeter of a triangle.
         *
         * @param side1 - first numeric value for the ADD operation
         * @param side2 - second numeric value for same purposes
         * @param side3 - third numeric value for the same purposes
         * @return value of three operands
         */
        double value;
        value = side1 + side2 + side3;
        return value;
    }

}
    // TASK #4 Write javadoc comments for each method
