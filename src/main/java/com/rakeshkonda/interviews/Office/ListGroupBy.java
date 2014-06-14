package classes.Office;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 1/2/13
 * Time: 3:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListGroupBy {

    public static void main(String[] args){
        String[] testArr = {"one","two","three","two","three","three","four","four","four"};
        List<String> inputList = Arrays.asList(testArr);
        Collections.sort(inputList);
        Iterator<String> iterator = inputList.iterator();
        Iterator<String> iterator2 = inputList.iterator();

         while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        String prevToken = null;
        String currentToken = null;
        int numOfDuplicates = 0;
        int expectedThreshold = 3;
        int actualCount = 1;

        while(iterator.hasNext()){
            currentToken = iterator.next();
            if(currentToken.equals(prevToken)) {
                 actualCount++;
            }
            if(StringUtils.isNotBlank(prevToken) && (!currentToken.equals(prevToken) || !iterator.hasNext())){
                if(actualCount == expectedThreshold){
                    numOfDuplicates++;
                    System.out.println("-----:>"+prevToken);
                }
                actualCount = 1;
            }
            prevToken = currentToken;
        }

        System.out.println(numOfDuplicates);

    }
}
