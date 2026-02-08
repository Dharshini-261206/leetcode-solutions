// Last updated: 08/02/2026, 20:04:43
import java.util.Stack;

class Solution {
    public boolean isValid(String s1) {
        Stack<Character> s = new Stack<>();
        char[] ch = s1.toCharArray();
        
        for (char c : ch) {
            if (c == '(' || c == '[' || c == '{') {
                s.push(c);
            } else {
                if (s.isEmpty()) return false;
                
                if (c == ')' && s.peek() == '(') {
                    s.pop();
                } else if (c == ']' && s.peek() == '[') {
                    s.pop();
                } else if (c == '}' && s.peek() == '{') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}