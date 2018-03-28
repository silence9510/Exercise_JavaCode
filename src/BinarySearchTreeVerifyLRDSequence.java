public class BinarySearchTreeVerifyLRDSequence {
    public boolean VerifySquenceOfBST(int [] sequence) {
        int len = sequence.length;
        if (len <= 0 || sequence == null) return false;
        return solution(sequence, 0, len-1);
    }
    public boolean solution(int [] seq, int first, int last){
        if (last - first <= 1) return true;
        int root = seq[last];
        int cutIndex = first;
        while (cutIndex < last && seq[cutIndex] < root) cutIndex++;
        for (int i = cutIndex; i < last; i++){
            if (seq[i] < root) return false;
        }
        return solution(seq, first, cutIndex - 1) && solution(seq, cutIndex, last - 1);
    }
}