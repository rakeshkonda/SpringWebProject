package classes.SortAlgorithms;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/23/12
 * Time: 4:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class InsertionSort {
    public static void main(String[] args){
        int[] inputArr = {8,4,7,3,2,5,1,6};

        //print array before sorting using Insertion sort algorithm
        System.out.println("Array Before Insertion Sort");
        for(int i=0; i < inputArr.length; i++){
            System.out.print(inputArr[i] + " ");
        }

        insertionSort(inputArr);

        System.out.println("");

        //print array after sorting using Insertion sort algorithm
        System.out.println("Array After Insertion Sort");
        for(int i=0; i < inputArr.length; i++){
            System.out.print(inputArr[i] + " ");
        }
    }

    private static  void insertionSort(int[] inputArr){
        int n = inputArr.length;

        for (int i = 1; i < n; i++){
            int j = i;
            int temp = inputArr[i];
            while ((j > 0) && (inputArr[j-1] > temp)){
                inputArr[j] = inputArr[j-1];
                j--;
            }
            inputArr[j] = temp;
        }
    }
}
