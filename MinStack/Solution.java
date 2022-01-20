import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min = Integer.MAX_VALUE;
// HashMap<Integer, Integer> elements = new HashMap<>();
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.add(val);
        
        if (minStack.size() == 0) minStack.push(val);
        else minStack.push(Math.min(val, minStack.peek()));
        
    }
    
    public void pop() {
        minStack.pop();
        stack.pop();
    }
    
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}