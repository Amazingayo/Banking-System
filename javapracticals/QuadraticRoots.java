package javapracticals;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter coefficientt a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Invalid equation: 'a' cannot be 0 in a quadratic equation.");
        } else {
            double d = (b * b) - (4 * a * c);

            if (d < 0) {
                System.out.printf("Discriminant = %.2f. The roots are complex.%n", d);
            } else if (d == 0) {
                double root = -b / (2 * a);
                System.out.printf("Discrimant = 0. Roots are real & equal: x1 = x32 = %.4f%n", root);
            } else {
                double root1 = (-b + Math.sqrt(d)) / (2 * a);
                double root2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.printf("Discriminant = %.2f. Roots are real and disctinct:%n", d);
                System.out.printf("x1 = %.4f%n", root1);
                System.out.printf("x2 = %.4f%n", root2);
            }
        }
        scanner.close();
    }

}
