package DSAPractice;

import java.util.Stack;
public class NGE {
    public static void printNGE(int[] arr) {
    Stack<Integer> stack = new Stack<>();
    int n = arr.length;
    int[] result = new int[n];

    for (int i = n - 1; i >= 0; i--) {
        while (!stack.isEmpty() && stack.peek() <= arr[i]) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            result[i] = -1;
        } else {
            result[i] = stack.peek();
        }

        stack.push(arr[i]);
    }

    for (int i = 0; i < n; i++) {

        System.out.println(result[i]);
    }
}

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 2, 25};
        printNGE(arr1);

        int[] arr2 = {13, 7, 6, 12};
        printNGE(arr2);
    }
}

