//Created by ZCL on 2018-04-10.

import java.util.ArrayList;

public class IsContinuous {
    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length == 0) return false;
        int kingNum = 0;
        ArrayList<Integer> poker = new ArrayList<Integer>(){
            {
                for (int i = 1; i <= 13; i++)
                    add(0);
            }
        };

        for (int i  = 0; i < numbers.length; i++){
            if (numbers[i] == 0)
                kingNum++;
            else {
                poker.set(numbers[i], poker.get(numbers[i])+1);
                if (poker.get(numbers[i]) > 1) return false;
            }
        }
        if (kingNum == 4) return true;
        else {
            int l = poker.indexOf(1);
            for (int i = 0; i < 4 - kingNum; i++)
                poker.set(poker.indexOf(1), 0);
            int r = poker.indexOf(1);
            if (r - l <= 4) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,6,4};
        System.out.println(new IsContinuous().isContinuous(arr));
    }
}