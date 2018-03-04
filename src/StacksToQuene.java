import java.util.Stack;

public class StacksToQuene {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public void push(int node){
        s1.push(node);
    }

    public int pop(){
        int node;
        while(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        StacksToQuene stq = new StacksToQuene();
        stq.push(1);
        stq.push(2);
        System.out.println(stq.pop());
        System.out.println(stq.pop());
    }

}
