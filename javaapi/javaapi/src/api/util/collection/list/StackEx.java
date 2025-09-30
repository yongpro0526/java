package api.util.collection.list;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack.toString());

        System.out.println(stack.peek());// 값을 확인만 하는법

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.toString());

    }
}
