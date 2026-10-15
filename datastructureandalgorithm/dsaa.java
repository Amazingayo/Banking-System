package datastructureandalgorithm;

public class dsaa {
    public static void main(String[] args) {
        double sum = 0;
        int lent;
        double avg;
        double[] num = { 3.5, 4.6, 5.7, 2.3, 8.9 };

        lent = num.length;
        for (int k = 0; k < lent; k++) {
            sum += num[k];
        }

        avg = sum / lent;
        System.out.println("Sum of the Array =" + sum);
        System.out.println("Average of the array =" + avg);
    }
}