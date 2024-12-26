package com.tv.codeatwork;

import java.util.Stack;

/**
 * Longest Valid Parentheses Substring
 *
 */

public class ValidParentheses {

    public static void stackCheck(String inpuString) {
        Stack<Character> stackBucket = new Stack<>();
        int ValidParenthesesCount = 0;

        for (int i = 0; i < inpuString.length(); i++) {

            if (inpuString.charAt(i) == '(') {
                stackBucket.push(inpuString.charAt(i));
            } else {
                if (!stackBucket.isEmpty()) {
                    ValidParenthesesCount += 2;
                    stackBucket.pop();
                }
            }

        }

        System.out.println("Valid Parentheses with the length of " + ValidParenthesesCount);

    }

    public static void main(String[] args) {
        stackCheck("())))))))))");
    }

}
