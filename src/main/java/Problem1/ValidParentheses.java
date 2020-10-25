package Problem1;

import Problem2.ListNode;

import java.util.LinkedList;
import java.util.List;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        // !!! must use ArrayStack or LinkedListStack from problem 1
        Stack<Character> list = new LinkedListStack<>();
        Stack<Character> list2 = new LinkedListStack<>();
        Character temp;
        int endCondition = 0;
//basic conditions
        if (str.length() == 0) {
            return true;
        }
        if (str.length() % 2 == 1) {
            return false;
        }

        //list 1 for whole string
        for (int i = 0; i < str.length(); i++) {
            list.push(str.charAt(i));
        }
        //mirror copy to list2
        for (int j = 0; j < list.size() / 2; j++) {
            temp = list.peek();
            list2.push(temp);
            list.pop();
        }
        for (int k = 0; k < list2.size(); k++) {
            //3 cases
            if (list2.peek().equals(')') && list.peek().equals('(')) {
                endCondition = 1;
            } else if (list2.peek().equals(']') && list.peek().equals('[')) {
                endCondition = 1;
            } else if (list2.peek().equals('}') && list.peek().equals('{')) {
                endCondition = 1;
            } else {
                endCondition = 0;
            }
        }

        //end condition
        if (endCondition == 1) {
            return true;
        } else {
            return false;
        }
    }
}