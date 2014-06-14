package classes.SortAlgorithms;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/27/12
 * Time: 8:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class InsertionSortNew {
    public static void main(String[] args){
        int[] arr = new int[10];
        populateArray(arr);

        //print array before sorting using Merge sort algorithm
        System.out.println("Array Before Merge Sort");
        printArray(arr);

        insertionSort(arr);

        //print array after sorting using Merge sort algorithm
        System.out.println("\nArray After Merge Sort");
        printArray(arr);
    }

    public static void insertionSort(int[] arr){
        int key; // element we are trying to insert
        int i;

        //j=1 assuming j=0 is already sorted {single element}
        for(int j = 1; j<arr.length;j++){
            key = arr[j]; // first key is the second element in arr (first is already sorted so)
            i = j - 1; //temp var to traverse the array & figure out if the elements to its left are smaller
            while (i > -1 && arr[i] > key){
             // -1 indicate we have already sorted all the elements & see if the elements to its left are smaller or swap it
                 arr[i+1] = arr[i];
                 i = i-1;
            }
            arr[i+1] = key;
        }
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
