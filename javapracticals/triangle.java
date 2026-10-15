package javapracticals;

import javax.swing.JOptionPane;

public class triangle {
    public static void main(String[] args) {
        String sideA = JOptionPane.showInputDialog("Enter length of side a:");
        double a = Double.parseDouble(sideA);

        String sideB = JOptionPane.showInputDialog("Enter length of side b:");
        double b = Double.parseDouble(sideB);

        String sideC = JOptionPane.showInputDialog("Enter length of side c:");
        double c = Double.parseDouble(sideC);

        if (a + b > c && a + c > b && b + c > a) {
            double perimeter = a + b + c;
            double s = perimeter / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            String message = String.format("Perimeter: %.2f%nArea: %.2f", perimeter, area);
            JOptionPane.showMessageDialog(null, message, "Triangle Results", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The given side lengths do not form a valid triangle.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}
