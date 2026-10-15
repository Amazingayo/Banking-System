package datastructureandalgorithm;

import java.util.HashSet;
import java.util.Set;

public class ActivityThree {
    public static void main(String[] args) {
        Set<String> A = new HashSet<>();
        A.add("Ada");
        A.add("Bola");
        A.add("Chidi");
        A.add("Dayo");

        Set<String> B = new HashSet<>();
        B.add("Bola");
        B.add("Chidi");
        B.add("Emeka");

        Set<String> U = new HashSet<>();
        U.add("Ada");
        U.add("Bola");
        U.add("Chidi");
        U.add("Dayo");
        U.add("Emeka");
        U.add("Femi");

        // Union
        Set<String> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println("Union: " + union);

        // Intersection
        Set<String> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println("Intersection: " + intersection);

        // A - B
        Set<String> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.println("A - B: " + difference);

        // Complement of A
        Set<String> complement = new HashSet<>(U);
        complement.removeAll(A);
        System.out.println("Complement A: " + complement);

        // Symmetric difference
        Set<String> symmetricDifference = new HashSet<>(A);
        symmetricDifference.addAll(B);

        Set<String> common = new HashSet<>(A);
        common.retainAll(B);

        symmetricDifference.removeAll(common);
        System.out.println("Symmetric difference: " + symmetricDifference);

        // Check whether B is a subset of A
        System.out.println("B is subset of A: " + A.containsAll(B));
    }
}