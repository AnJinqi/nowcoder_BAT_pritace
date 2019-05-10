import java.util.*;
// selectionSort的时间复杂度O（n ^ 2）
public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        // write code here
        if(A.length < 1)
            return null;
        int mini = 0;  //最小值下标
        int temp = 0;
        for(int i = 0;i < A.length - 1;i++){   // 因为选择排序的查找范围从【0，n-1】,【1,n-1】，【2,n-1】
            //逐渐缩小，所以外循环可以是0,1,2，...，一直到n-2;
            mini = i; // 每一轮查找开始时都将mini设置为第一个元素
            for(int j = i + 1;j < A.length;j++){ // 内循环的查找范围每一次都结束于n-1
                mini = (A[j] < A[mini])?j:mini;
            }
            temp = A[i];
            A[i] = A[mini];
            A[mini] = temp;
        }
        return A;
    }
}
