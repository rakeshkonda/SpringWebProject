package classes.SortAlgorithms;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/15/12
 * Time: 11:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort {
   /*
    * In bubble sort, we basically traverse the array from first
    * to array_length - 1 position and compare the element with the next one.
    * Element is swapped with the next element if the next element is greater.
    *
    * Bubble sort steps are as follows.
    *
    * 1. Compare array[0] & array[1]
    * 2. If array[0] > array [1] swap it.
    * 3. Compare array[1] & array[2]
    * 4. If array[1] > array[2] swap it.
    * ...
    * 5. Compare array[n-1] & array[n]
    * 6. if [n-1] > array[n] then swap it.
    *
    * After this step we will have largest element at the last index.
    *
    * Repeat the same steps for array[1] to array[n-1]
    *
    */
    public static void main(String[] args){
        int[] inputArr = {8,4,7,3,2,5,1,6};

        //print array before sorting using bubble sort algorithm
        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < inputArr.length; i++){
            System.out.print(inputArr[i] + " ");
        }

        bubbleSort(inputArr);

        System.out.println("");

        //print array after sorting using bubble sort algorithm
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < inputArr.length; i++){
            System.out.print(inputArr[i] + " ");
        }
    }

    private static void bubbleSort(int[] inputArr) {
        int n = inputArr.length;
        int temp = 0;

        for(int i=0;i<n;i++){
            for(int j=1; j < (n-i); j++){
                if(inputArr[j-1] > inputArr[j]){
                    //swap the elements!
                    temp = inputArr[j-1];
                    inputArr[j-1] = inputArr[j];
                    inputArr[j] = temp;
                }
            }
        }
    }
}
