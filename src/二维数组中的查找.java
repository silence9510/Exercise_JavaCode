public class 二维数组中的查找 {

    public static boolean Find(int targret, int[][] array){
        if(array==null || array.length==0 || array[0].length==0){
            return false;
        }
        int m = array.length, n = array[0].length;
        int row = 0, col = n-1;
        while (row < m && col >= 0){
            if(targret == array[row][col])  return true;
            else if(targret > array[row][col])  row++;
            else col--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Find(10, array));
    }
}
