package classes.SortAlgorithms;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/28/12
 * Time: 1:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort {
    public static void main(String[] args){
        int[] arr = new int[10];
        populateArray(arr);

        //print array before sorting using Quick sort algorithm
        System.out.println("Array Before Quick Sort");
        printArray(arr);

        quickSort(arr,0,arr.length-1);

        //print array after sorting using Quick sort algorithm
        System.out.println("\nArray After Quick Sort");
        printArray(arr);
    }

    public static void quickSort(int[] array,int start,int end){
        int i = start;                          // index of left-to-right scan
        int k = end;                            // index of right-to-left scan

        if (end - start >= 1)                   // check that there are at least two elements to sort
        {
            int pivot = array[start];       // set the pivot as the first element in the partition
            while (k > i)                   // while the scan indices from left and right have not met,
            {
                // from the left, look for the first element greater than the pivot
                while (array[i] <= pivot && i <= end && k > i)
                    i++;

                // from the right, look for the first element not greater than the pivot
                while (array[k] > pivot && k >= start && k >= i)
                    k--;

                // if the left seek index is still smaller than the right index, swap the corresponding elements
                if (k > i)
                    swap(array, i, k);
            }

            //after the indices have crossed, swap the last element in the left partition with the pivot
            swap(array, start, k);

            quickSort(array, start, k - 1); // quicksort the left partition
            quickSort(array, k + 1, end);   // quicksort the right partition
        }
        else    // if there is only one element in the partition, do not do any sorting
        {
            return;                     // the array is sorted, so exit
        }
    }

    public static void swap(int array[], int index1, int index2)
    // pre: array is full and index1, index2 < array.length
    // post: the values at indices 1 and 2 have been swapped
    {
        int temp = array[index1];           // store the first value in a temp
        array[index1] = array[index2];      // copy the value of the second into the first
        array[index2] = temp;               // copy the value of the temp into the second
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
