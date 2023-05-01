package validParentheses;

import java.util.Stack;

//See the problem here: https://leetcode.com/problems/valid-parentheses
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char tempChar = s.charAt(i);
            if (tempChar == '{' || tempChar == '[' || tempChar == '(') {
                //Pop on the stack and continue
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.size() == 0) {
                return false;
            }
            char topOfStack = stack.pop();
            if(!match(topOfStack, tempChar)) {
                return false;
            }
        }
        if(stack.size() > 0) {
            return false;
        }
        return true;

    }


    public boolean match(char charOne, char charTwo) {
        String together = String.valueOf(charOne)+ String.valueOf(charTwo);
        System.out.println(together);
        return together.equals("{}") || together.equals("()") || together.equals("[]");
    }
}
