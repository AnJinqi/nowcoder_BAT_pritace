import java.util.*;
//快速排序时间复杂度O（n * log(n)）
public class QuickSort {
    public int[] quickSort(int[] A, int n) {
        // write code here
        if(A == null || A.length < 2)
            return A;
        int low = 0;
        int high = A.length - 1;
        sort(A,low,high);
        return A;
    }
    
    public static int partition(int[] array,int low,int high){ //以枢纽元素为中心，分为小于枢纽元素的左集合，
        //大于枢纽元素的右集合。在递归处理左集合，递归处理右集合。
        int key = array[low];
        while(low < high){
            while(array[high] >= key && low < high){
                high--;
            }
            array[low] = array[high];
            while(array[low] <= key && low <high){
                low++;
            }
            array[high] = array[low];
        }
        array[high] = key;
        return high;
    }
    
    public static void sort(int[] array,int low,int high){
        if(low >= high)
            return;
        int mid = partition(array,low,high);
        sort(array,low,mid-1);
        sort(array,mid+1,high);
    }
}
