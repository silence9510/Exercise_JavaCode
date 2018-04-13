// Created by ZCL on 2018-04-13.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaxInSildeWindow {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if (num.length == 0 || num == null || size > num.length || size == 0) return new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++)
            q.add(num[i]);
        for (int i = size; i < num.length; i++) {
            list.add(max(q));
            q.poll();
            q.add(num[i]);
        }
        list.add(max(q));
        return list;
    }

    public int max(Queue<Integer> num) {
        int max = 0;
        for (int ele : num) {
            if (ele > max) max = ele;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = {2,3,4,2,6,2,5,1};
        System.out.println(new MaxInSildeWindow().maxInWindows(num, 3));
    }
}
