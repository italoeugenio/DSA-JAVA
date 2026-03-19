package C_Sort;

import java.util.Arrays;

public class BubbleSort {
    //Time Complexity:
//    - Best Case : o(n)
//    - Worst Case: o(n^2)
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }


    public static void main(String[] args){
        int[] arr = {10,5,3,7,1};
        bubbleSort(arr);
    }
}
