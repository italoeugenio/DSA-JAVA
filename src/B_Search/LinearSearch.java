package B_Search;

public class LinearSearch {
    public static Integer linearSearch(int[] arr, int target){
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
                return index;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(linearSearch(arr, 10));
    }
}