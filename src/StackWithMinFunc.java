import java.util.Stack;

public class StackWithMinFunc {

    Stack s = new Stack<Integer>(), minS = new Stack<Integer>();
    int min = 999;

    public void push(int node) {
        s.push(node);
        if (node < min){
            min = node;
            minS.push(min);
        }else
            minS.push(min);
    }

    public void pop() {
        if (s.size() != 0){
            s.pop();
            minS.pop();
        }
    }

    public int top() {
        if (s.size() != 0) return (int)s.peek();
        else return -1;
    }

    public int min() {
        if (s.size() != 0) return (int)minS.peek();
        else return -1;
    }
}
