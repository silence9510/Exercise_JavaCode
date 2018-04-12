// Created by ZCL on 2018-04-12.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LastNumInCircle {
    public int LastRemaining_Solution(int n, int m) {
        if (n <= 0 || m <= 0) return -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);
        ListIterator<Integer> iterator = list.listIterator();
        int i = 0;
        while (list.size() != 1){
            iterator.next();
            if (++i == m){
                iterator.remove();
                i = 0;
            }
            if (!iterator.hasNext())
                iterator = list.listIterator();
        }
        return list.get(0);
    }

//    f(1) = 0
//    f(n) = (f(n-1)+m) % n 不断缩小问题规模
    public int LastRemaining_Solution1(int n, int m) {
        if (n <= 0 || m <= 0) return -1;
        int last = 0;
        for (int i = 2; i <= n; i++)
            last = (last + m) % i;
        return last;
    }
    public static void main(String[] args) {
        System.out.println(new LastNumInCircle().LastRemaining_Solution1(5, 4));
    }
}
