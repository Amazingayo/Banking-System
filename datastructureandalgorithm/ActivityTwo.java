package datastructureandalgorithm;

import java.util.HashMap;
import java.util.HashSet;

public class ActivityTwo {
    public static void main(String[] args) {
        HashMap<String, String[]> graph = new HashMap<>();

        graph.put("A", new String[] { "B", "C" });
        graph.put("B", new String[] { "A", "D" });
        graph.put("C", new String[] { "A", "D", "E" });
        graph.put("D", new String[] { "B", "C" });
        graph.put("E", new String[] { "C" });

        System.out.println("Neighbours of C: ");
        for (String n : graph.get("C")) {
            System.out.print(n + " ");
        }

        System.out.println();

        System.out.println("Neighbours of E: ");
        for (String n : graph.get("E")) {
            System.out.print(n + " ");
        }

        System.out.println();

        System.out.print("DFS from A: ");
        dfs(graph, "A", new HashSet<String>());

        System.out.println();

        System.out.print("DFS from B: ");
        dfs(graph, "B", new HashSet<String>());
    }

    public static void dfs(
            HashMap<String, String[]> graph,
            String start,
            HashSet<String> visited) {

        visited.add(start);
        System.out.print(start + " ");

        for (String n : graph.get(start)) {
            if (!visited.contains(n)) {
                dfs(graph, n, visited);
            }
        }
    }
}