// Created by ZCL on 2018-04-16.

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianInDataStreaming {

//    大顶堆
    private PriorityQueue<Integer> left = new PriorityQueue<Integer>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
//    默认小顶堆
    private PriorityQueue<Integer> right = new PriorityQueue<Integer>();
    int N = 0;
    public void Insert(Integer num) {
        if (N % 2 == 0) {
            left.add(num);
            right.add(left.poll());
        } else {
            right.add(num);
            left.add(right.poll());
        }
        N++;
    }

    public Double GetMedian() {
        if (N % 2 == 0)
            return (left.peek() + right.peek()) / 2.0;
        else
            return (double)right.peek();
    }
}
