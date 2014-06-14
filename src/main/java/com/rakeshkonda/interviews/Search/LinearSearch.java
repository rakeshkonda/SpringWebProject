package classes.Search;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/30/12
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinearSearch {
    public static void main(String[] args){
        int[] inputArr = {8,4,7,3,2,5,1,6};
        int key = 50;

        int position = linearSearch(key,inputArr);

        if(position != -1){
            System.out.println("Search Element "+key+" found at index: "+position);
        } else{
            System.out.println("Search Element "+key+" not found in the input Array");
        }
    }

    public static int linearSearch(int key, int[] inputArr){
        for(int i=0; i<inputArr.length; i++){
            if(inputArr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
