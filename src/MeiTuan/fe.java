package MeiTuan;

import java.util.HashMap;
import java.util.Map;

public class fe
{
    public static Map<Integer,Integer> solution(String s, int n){
        char[] strArr = s.toCharArray();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);
        char tmp = strArr[0];
        int index = 0;
        for (int i = 1; i < strArr.length; i++){
            if (tmp == strArr[i]){
                try {
                    map.put(index, map.get(index) + 1);
                } catch (Exception e) {
                    map.put(index, 1);
                }
            }
            index = i;
            tmp = strArr[i];
        }
        for (int i : map.keySet()){
            if (map.get(i) != n)
                map.remove(i);
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "abbcccddeefffgggcc";
        char[] strArr = s.toCharArray();
        int n = 2;
        Map<Integer, Integer> map = solution(s, n);
        for (int i : map.keySet()){
            System.out.print(i);
            System.out.println(strArr[i] * n);
        }
    }
}
