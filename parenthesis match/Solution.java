import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            switch(chr) {
                case '(':
                    stack.push(')');
                    break;

                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != chr) return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        
        System.out.println("sol: " + sol.isValid("{[]}"));
        
    }
}