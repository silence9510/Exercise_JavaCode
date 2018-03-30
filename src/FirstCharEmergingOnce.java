import java.util.HashMap;

public class FirstCharEmergingOnce {
    public int FirstNotRepeatingChar(String str) {
        if (str == null) return -1;
        int tableSize = (int)Math.pow(2, 8);
        char[] strArr = str.toCharArray();
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < tableSize; i++)
            hashMap.put(i, 0);
        for (int c : strArr)
            hashMap.put(c, hashMap.get(c)+1);
        for (int i = 0; i < strArr.length; i++){
            int index = strArr[i];
            if (hashMap.get(index) == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstCharEmergingOnce().FirstNotRepeatingChar("google"));
    }
}
