package datastructureandalgorithm;

public class ActivityOne {
    public static void main(String[] args) {

        String name = "Amina Bello";
        String matricNumber = "CTE/ND1/001";
        int age = 19;
        String department = "Computer Engineering";
        int score = 75;

        System.out.println("name: " + name);
        System.out.println("matric_number: " + matricNumber);
        System.out.println("age: " + age);
        System.out.println("department: " + department);
        System.out.println("score: " + score);

        System.out.println("name type: " + ((Object) name).getClass().getSimpleName());
        System.out.println("score type: " + ((Object) name).getClass().getSimpleName());
    }
}
