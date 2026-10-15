package javapracticals;

public class sum {
    public static void main(String[] args) {
        int sum = 0;

        for (int k = 2; k < 100; k += 3) {
            sum += k;
        }
        System.out.println("The sum of the series for k < 100 is: " + sum);
    }

}
