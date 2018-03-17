import java.util.Stack;

public class StackPushPopSeqs {

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int len = pushA.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0, j=0; i<len; i++){
            stack.push(pushA[i]);
            while (j < len && stack.peek() == popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        int[] popB = {4,3,5,1,2};
        System.out.println(new StackPushPopSeqs().IsPopOrder(pushA, popA));
    }
}
