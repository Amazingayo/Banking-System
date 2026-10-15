package datastructureandalgorithm;

public class dssascoretest {
    public static void main(String[] args) {
        int passCount = 0;
        double total = 0;
        double[] score = { 72.4, 67.5, 71.0, 69.2, 86.3, 22.2, 90.6, 87.7, 35.9, 39.6 };

        for (int i = 0; i < score.length; i++) {
            total += score[i];

            if (score[i] >= 40) {
                passCount++;
            }
        }
        System.out.println("Number of students that passed =" + passCount);
    }

}
