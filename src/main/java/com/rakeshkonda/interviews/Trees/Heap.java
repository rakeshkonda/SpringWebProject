package classes.Trees;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 12/28/12
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Heap<T extends Comparable<T>> {
    private ArrayList<T> items;

    public Heap(){
        items = new ArrayList<T>();
    }

    private void siftUp(){
        //sift up starts at last index i.e., new element is added at the end & then sifted up accordingly

        int k = items.size() - 1; //index of element at last index
        while (k > 0){
            int p = (k-1)/2; //Index of Parent
            T newItem = items.get(k);
            T parent = items.get(p);

            //Swap if newly inserted item is greater than parent
            if(newItem.compareTo(parent) > 0){
                items.set(k,parent);
                items.set(p,newItem);

                k = p; //changing the index of k to p (parent`s index) to continue checking up the tree for sift ups
            } else {
                break;
            }
        }
    }

    public void insert(T newItem){
        items.add(newItem); //list.add adds the element at the end of list
        siftUp();
    }

    private void siftDown(){
        //sift down starts at first index (zero) i.e., delete the root first & then sift down accordingly

        int k = 0;
        int leftIndex = 2*k + 1;

        //Loop until you reach last leaf node
        while(leftIndex < items.size()){
            int max = leftIndex;
            int rightIndex = leftIndex + 1;

            if(rightIndex < items.size()){  // i.e., there is a right child
                /* this check is to see if left or right element is greater
                 * if right > left, then max should point to right
                 * which is max++
                 */
                if(items.get(rightIndex).compareTo(items.get(leftIndex)) > 0) {
                    max++;
                }
            }

            if(items.get(k).compareTo(items.get(max)) > 0){
                //if item at index k is greater than max element (i.e., greater than both the children)
                //SWITCH

                T temp = items.get(k);
                items.set(k,items.get(max));
                items.set(max,temp);

                k = max;
                leftIndex = 2*k + 1; //to continue checking till the last leaf node
            }  else {
                break;
            }
        }  //end of while loop
    }

    public T delete() throws NoSuchElementException{
        if(items.size() == 1){
            items.remove(0);
            //Removing the single item
        }
        if(items.size() == 0){
            throw new NoSuchElementException("No Items found to delete");
        }

        T hold = items.get(0); // Storing the root element which will be deleted to return to the caller
        items.set(0,items.remove(items.size() - 1)); // removing the last element & storing it at the root
        siftDown(); //siftDown will set the heap accordingly

        return hold;
    }

    public int size(){
        return items.size();
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public String toString(){
        return items.toString();
    }
}
