package classes.Trees;

import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/27/12
 * Time: 10:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class HeapSortApp {
    public static void main(String[] args){
        int[] arr = new int[11];
        populateArray(arr);

        //print array before sorting using Heap sort algorithm
        System.out.println("Array Before Heap Sort");
        printArray(arr);

        System.out.println("");

        heapSort(arr);

        //print array after sorting using Heap sort algorithm
        System.out.println("\nArray After Heap Sort");
        printArray(arr);
    }

    public static void heapSort(int[] arr){
       Heap<Integer> hp = new Heap<Integer>();

        //constructing heap with given array elements
        for (int i = 0; i < arr.length; i++ ){
            hp.insert(arr[i]);
            System.out.println(hp);
        }

        //TODO print in sorted order

        //destructing heap with given array elements
        for (int i = 0; i < arr.length; i++ ){
            try {
                hp.delete();
            } catch (NoSuchElementException e) {

            }
            System.out.println(hp);
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
