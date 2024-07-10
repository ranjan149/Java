package org.example.collections;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        stack.push('a');
        stack.push('b');
        stack.push('c');

        System.out.println("Peek : " + stack.peek());
        System.out.println("Pop : " + stack.pop());
        System.out.println(stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Is Stack empty: " + stack.isEmpty());

        //sting concat
    }
}
