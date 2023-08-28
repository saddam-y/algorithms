package sort;

import model.Tree;
import structure.impl.SimpleQueue;
import structure.impl.SimpleStack;

public class TreeSearch {

    public static <T> Tree<T> searchUsingRecursion(T search, Tree<T> root) {
        if(root.getValue().equals(search)){
            return root;
        } else {
            if(root.getLeft() != null) {
                Tree<T> result = searchUsingRecursion(search, root.getLeft());
                if(result != null) return result;
            }
            if(root.getRight() != null) {
                Tree<T> result = searchUsingRecursion(search, root.getRight());
                if(result != null) return result;
            }
            return null;
        }
    }


    public static Integer sumUsingRecursion(Tree<Integer> root) {

        var sum = root.getValue();

        if(root.getLeft() != null) {
            sum += sumUsingRecursion(root.getLeft());
        }
        if(root.getRight() != null) {
            sum += sumUsingRecursion(root.getRight());
        }

        return sum;
    }


    public static Integer sumUsingStackDeep(Tree<Integer> root) {

        var sum = 0;
        SimpleStack<Tree<Integer>> stack = new SimpleStack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            var tree = stack.pop();
            sum += tree.getValue();

            if(tree.getLeft() != null) {
                stack.push(tree.getLeft());
            }
            if(tree.getRight() != null) {
                stack.push(tree.getRight());
            }
        }
        return sum;
    }

    public static <T> Tree<T> searchUsingStackDeep(T value, Tree<T> root) {

        SimpleStack<Tree<T>> stack = new SimpleStack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            var tree = stack.pop();
            if(tree.getValue().equals(value)) return tree;

            if(tree.getLeft() != null) {
                stack.push(tree.getLeft());
            }
            if(tree.getRight() != null) {
                stack.push(tree.getRight());
            }
        }
        return null;
    }

    public static Integer sumUsingQueueWide(Tree<Integer> root) {

        var sum = 0;
        SimpleQueue<Tree<Integer>> queue = new SimpleQueue<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            var tree = queue.remove();
            sum += tree.getValue();

            if(tree.getLeft() != null) {
                queue.add(tree.getLeft());
            }
            if(tree.getRight() != null) {
                queue.add(tree.getRight());
            }
        }
        return sum;
    }
}
