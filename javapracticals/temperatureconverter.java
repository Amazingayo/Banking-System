package javapracticals;

import java.util.Scanner;

public class temperatureconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option");
        System.out.println("[1] Degree CelciuS (C) to Degree Farenheit (F)");
        System.out.println("[2] Degree Farenheit (F) to Degree Celcius (C)");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celcius: ");
            double c = scanner.nextDouble();
            double f = (9.0 / 5.0) * c + 32;
            System.out.printf("Temperature in Farenheit: %2f\u00B0F%n", f);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Farenheit: ");
            double f = scanner.nextDouble();
            // Note: the standard formular is (5.0 / 9.0) * (F - 32)
            double c = (5.0 / 9.0) * (f - 32);
            System.out.printf("Temperature in Celcius: %2f\u00B0C%N", c);
        } else {
            System.out.println("Invalid selection.");
        }
        scanner.close();
    }
}
