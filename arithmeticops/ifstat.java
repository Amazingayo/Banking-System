package arithmeticops;

public class ifstat {
    public static void main(String[] args) {
        int age = 22;

        if (age >= 70) {
            System.out.println("Old");
        } else if (age >= 40) {
            System.out.println("Middle Age");
        } else if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teenager");
        } else if (age >= 7) {
            System.out.println("Child");
        } else if (age >= 3) {
            System.out.println("Toddler");
        } else if (age >= 0) {
            System.out.println("Infant");
        } else {
            System.out.println("Invalid age");
        }
    }

}
