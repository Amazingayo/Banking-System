package javapracticals;

import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score (0 - 100): ");
        double score = scanner.nextDouble();

        char grade = 0;

        if (score >= 80 && score <= 100) {
            System.out.println('A');
        } else if (score >= 60) {
            System.out.println('B');
        } else if (score >= 50) {
            System.out.println('C');
        } else if (score >= 40) {
            System.out.println('D');
        } else if (score >= 0) {
            System.out.println('F');
        } else {
            System.out.println("Invalid score entered");
            scanner.close();
            return;
        }
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        scanner.close();
    }

}
