package classes.SortAlgorithms;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/27/12
 * Time: 3:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeSortRec {
    public static void main(String[] args){
        int[] arr = new int[10];
        populateArray(arr);

        //print array before sorting using Merge sort algorithm
        System.out.println("Array Before Merge Sort");
        printArray(arr);

        arr = mergeSort(arr);

        //print array after sorting using Merge sort algorithm
        System.out.println("\nArray After Merge Sort");
        printArray(arr);
    }

    //Keeps dividing the array into halves, until we have single elements
    public static int[] mergeSort(int[] arr){

        //reached the base case {single element}
        if(arr.length<=1){
            return arr;
        }
        int[] result = new int[arr.length];
        int midpoint = arr.length/2;
        int[] left = new int[midpoint];
        int[] right;

        if(arr.length % 2 == 0){
            right = new int[midpoint];
        } else{
            right = new int[midpoint+1];
        }

        //Populate the left array i.e., 0 -> midpoint
        for(int i=0; i < midpoint; i++){
            left[i] = arr[i];
        }

        int k = 0;
        //Populate the right array i.e., midpoint -> arr.length
        for(int j=midpoint; j < arr.length; j++){
            if(k < right.length){
                right[k] = arr[j];
                k++;
            }
        }

        //split the left & right arrays until you reach single elements
        left = mergeSort(left);
        right = mergeSort(right);

        result = merge(left,right);

        return result;
    }

    public static int[] merge(int[] left,int[] right){
        int lengthResult = left.length + right.length;
        int[] result = new int[lengthResult];

        int indexL = 0;
        int indexR = 0;
        int indexRes = 0;

        //merge till you have elements in the right or left
        while (indexL < left.length || indexR < right.length){

            //if both left & right are present
            if(indexL < left.length && indexR < right.length){
                if(left[indexL] <= right[indexR]){
                    result[indexRes] = left[indexL];
                    indexRes++;
                    indexL++;
                }else{
                    result[indexRes] = right[indexR];
                    indexRes++;
                    indexR++;
                }
            }
            else if(indexL < left.length){   //if only left is present
                result[indexRes] = left[indexL];
                indexRes++;
                indexL++;
            }
            else if(indexR < right.length){   //if only right is present
                result[indexRes] = right[indexR];
                indexRes++;
                indexR++;
            }
        }
         return result;
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
