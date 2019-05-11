import java.util.*;
// Bubble Sort的时间复杂度为O（n ^ 2） 稳定
public class BubbleSort {
    public int[] bubbleSort(int[] A, int n) {
        // write code here
        int temp = 0;
        for(int i = A.length - 1;i >= 1;i--){  //外循环控制每一轮的比较次数，假设数组长度为7，
            //则比较次数依次为6,5,4,3,2,1,
            for(int j = 0;j <  i ;j++){    //内循环是当前轮的元素替换，依次前后两个元素比较，
                //最后最大元素位于数组末尾
                if(A[j] > A[j + 1])
                {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        return A;
    }
}
