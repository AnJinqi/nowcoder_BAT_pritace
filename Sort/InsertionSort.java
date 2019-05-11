import java.util.*;
// 插入排序时间复杂度O（n ^ 2）  稳定
public class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        // write code here
        if(A == null || A.length < 2)
            return A;
        int temp = 0;
        for(int i = 1;i < A.length;i++){ //插入排序范围是【0,1】，【0,2】，...【0，n-1】，所以外循环是
            //每次向前排序的起始位置，也就是1,2,3,4,...,n-1
            for(int j = i;j >= 1;j--){ // 插入排序是从当前位置开始向前比较，所以内循环就是从当前位置开始
                //依次向前比较，直到比较到位置0。
                if(A[j] < A[j - 1]){
                    temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
            }
        }
        return A;
    }
}
