package classes.SortAlgorithms;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/23/12
 * Time: 4:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {
    public static void main(String[] args){
        int[] inputArr = {8,4,7,3,2,5,1,6};

        //print array before sorting using Merge sort algorithm
        System.out.println("Array Before Merge Sort");
        for(int i=0; i < inputArr.length; i++){
            System.out.print(inputArr[i] + " ");
        }

        mergeSort(inputArr,0, inputArr.length-1);

        System.out.println("");

        //print array after sorting using Merge sort algorithm
        System.out.println("Array After Merge Sort");
        for(int i=0; i < inputArr.length; i++){
            System.out.print(inputArr[i] + " ");
        }
    }
    private static void mergeSort(int[] array,int lo,int n){
        int low = lo;
        int high = n;
        if (low >= high) {
            return;
        }

        int middle = (low + high) / 2;
        mergeSort(array, low, middle);
        mergeSort(array, middle + 1, high);
        int end_low = middle;
        int start_high = middle + 1;
        while ((lo <= end_low) && (start_high <= high)) {
            if (array[low] < array[start_high]) {
                low++;
            } else {
                int Temp = array[start_high];
                for (int k = start_high- 1; k >= low; k--) {
                    array[k+1] = array[k];
                }
                array[low] = Temp;
                low++;
                end_low++;
                start_high++;
            }
        }
    }
}
