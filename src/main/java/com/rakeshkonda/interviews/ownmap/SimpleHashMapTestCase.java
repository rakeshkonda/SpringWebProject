package classes.ownmap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 6/20/13
 * Time: 11:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleHashMapTestCase {
    @Test
    public void readWriteSimpleValue() {
        SimpleHashMap<String, Integer> map = new SimpleHashMap<String, Integer>();

        map.put("duck", 7);
        map.put("goose", 42);

        assertEquals(Integer.valueOf(7), map.get("duck"));
        assertEquals(Integer.valueOf(42), map.get("goose"));
    }

    @Test
    public void getSomethingThatIsntThere() {
        SimpleHashMap<Integer, String> map = new SimpleHashMap<Integer, String>();
        assertEquals(null, map.get(42));
    }

    @Test
    public void overWriteValue() {
        SimpleHashMap<Integer, String> map = new SimpleHashMap<Integer, String>();

        map.put(42, "meh");
        assertEquals("meh", map.get(42));
        map.put(42, "we have the technology to rebuild him");
        assertEquals("we have the technology to rebuild him", map.get(42));
    }

    @Test
    public void doNotOverwriteValueJustBecauseSameHashCode() {
        String diffButSameHash1 = "Ea";
        String diffButSameHash2 = "FB";

        //prove they really have the same hash
        assertEquals(diffButSameHash1.hashCode(), diffButSameHash2.hashCode());

        SimpleHashMap<String, String> map = new SimpleHashMap<String, String>();

        //prove they really go into the same bucket (yes, might be overdoing it here!)
        assertEquals(map.bucketIndexForKey(diffButSameHash1), map.bucketIndexForKey(diffButSameHash2));

        map.put(diffButSameHash1, "We Are All Unique");
        map.put(diffButSameHash2, "I'm Not!");

        //same hash but amazingly still different values!
        assertEquals("We Are All Unique", map.get(diffButSameHash1));
        assertEquals("I'm Not!", map.get(diffButSameHash2));
    }
}

