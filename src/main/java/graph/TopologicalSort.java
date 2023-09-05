package graph;

import java.util.*;

public class TopologicalSort {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> tree = new HashMap<>();

        tree.put(1, List.of(3,5));
        tree.put(5, List.of(2,3,6));
        tree.put(3, List.of(2));
        tree.put(7, List.of(6));

        System.out.println(sort(tree, List.of(1, 2, 3, 4, 5, 6, 7)));

    }

    public static <T> List<T> sort(Map<T, List<T>> tree, List<T> graphs) {
        List<T> order = new ArrayList<>();

        for(var i = 0; i < graphs.size(); i++) {
            if(!order.contains(graphs.get(i))) {
                dfs(tree, graphs.get(i), order);
            }
        }

        Collections.reverse(order);
        return order;
    }

    public static <T> void dfs(Map<T, List<T>> tree, T key, List<T> order) {
        if(tree.get(key) != null)
            for(var k: tree.get(key)) {
                if(!order.contains(k)) {
                    dfs(tree, k, order);
                }
            }

        order.add(key);
    }
}
