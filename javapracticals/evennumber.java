package javapracticals;

public class evennumber {
    public static void main(String[] args) {
        long sum = 0;
        int count = 0;

        for (int i = 2; i <= 502; i += 2) {
            sum += i;
            count++;
        }

        double average = (double) sum / count;
        long squareOfSum = sum * sum;

        System.out.println("Count of even numbers: " + count);
        System.out.println("Sum of even numbers: " + sum);
        System.out.println("Aveerage: " + average);
        System.out.println("Square of the sum: " + squareOfSum);
    }
}
