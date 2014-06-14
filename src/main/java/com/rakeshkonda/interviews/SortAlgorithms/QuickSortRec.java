package classes.SortAlgorithms;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/23/12
 * Time: 4:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuickSortRec {

    public static void main(String[] args){
        int[] arr = new int[11];
        populateArray(arr);

        //print array before sorting using Quick sort algorithm
        System.out.println("Array Before Quick Sort");
        printArray(arr);

        quickSort(arr,0,arr.length-1);

        //print array after sorting using Quick sort algorithm
        System.out.println("\nArray After Quick Sort");
        printArray(arr);
    }

    public static void quickSort(int[] arr,int left,int right){
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }

    public static int partition(int arr[], int left, int right){
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };
        return i;
    }

    public static void populateArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = (int) (Math.random()*100);
        }
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
