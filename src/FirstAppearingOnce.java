import java.util.LinkedList;
import java.util.Queue;

public class FirstAppearingOnce {

    private int[] counts = new int[256];
    private Queue<Character> queue = new LinkedList<>();

    //Insert one char from stringstream
    public void Insert(char ch)
    {
        counts[ch]++;
        queue.add(ch);
        while (!queue.isEmpty() && counts[queue.peek()] > 1)
            queue.poll();
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if (queue.isEmpty()) return '#';
        return queue.peek();
    }

}
