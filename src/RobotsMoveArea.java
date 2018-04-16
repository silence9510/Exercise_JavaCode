// Created by ZCL on 2018-04-16.
// haha
public class RobotsMoveArea {
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[] visited = new boolean[rows * cols];
        for (int i = 0; i < visited.length; i++)
            visited[i] = false;
        int cnt = movingCountCore(threshold, rows, cols, 0, 0, visited);
        return cnt;
    }
    private int movingCountCore(int threshold, int rows,
                                int cols, int row, int col,
                                boolean[] visited){
        int cnt = 0;
        if (check(threshold, rows, cols, row, col, visited)){
            visited[row * cols + col] = true;
            cnt = 1 +
                    movingCountCore(threshold, rows, cols, row + 1, col, visited) +
                    movingCountCore(threshold, rows, cols, row - 1, col, visited) +
                    movingCountCore(threshold, rows, cols, row, col + 1, visited) +
                    movingCountCore(threshold, rows, cols, row, col - 1, visited);
        }
        return cnt;
    }
    private boolean check(int threshold, int rows, int cols,
                          int row, int col, boolean[] visited){
        if (row >= 0 && row < rows && col >=0 && col < cols
                && (getDightSum(row) + getDightSum(col) <= threshold)
                && !visited[row * cols + col])
            return true;
        return false;
    }
    private int getDightSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
