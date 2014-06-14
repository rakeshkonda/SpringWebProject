package classes.Search;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/30/12
 * Time: 4:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch {
    public static void main(String[] args){
        int[] inputArr = {0,1,2,3,4,5,6,7,8,9};
        int key = 1;

        int position = binarySearch(key,inputArr);

        if(position != -1){
            System.out.println("Search Element "+key+" found at index: "+position);
        } else{
            System.out.println("Search Element "+key+" not found in the input Array");
        }
    }

    public static int binarySearch(int key, int[] inputArr){
        int low = 0;
        int high = inputArr.length - 1;
        int mid;

        while(low <= high){
            mid = (low + high)/2;
            if(key > inputArr[mid]){
                low = mid + 1;
            }else if(key < inputArr[mid]){
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
