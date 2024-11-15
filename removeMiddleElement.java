package DSAPractice;

import java.util.Stack;

public class removeMiddleElement {

    public static void deleteMiddle(Stack<Integer> stack, int currentIndex, int middleIndex) {
        if (currentIndex == middleIndex) {
        stack.pop();
        return;
    }
        int top = stack.pop();
        deleteMiddle(stack, currentIndex + 1, middleIndex);
        stack.push(top);
    }

    public static void removeMiddle(Stack<Integer> stack) {
        int size = stack.size();
        if (size == 0) {
            return;
        }
        int middleIndex = size / 2;
        deleteMiddle(stack, 0, middleIndex);
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        removeMiddle(stack1);
        System.out.println(stack1); // Output: [1, 2, 4, 5]

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        removeMiddle(stack2);
        System.out.println(stack2); // Output: [1, 2, 4, 5, 6]
    }
}
