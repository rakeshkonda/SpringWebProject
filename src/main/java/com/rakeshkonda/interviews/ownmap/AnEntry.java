package classes.ownmap;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 6/20/13
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class AnEntry<K, V>  {
    private AnEntry<K, V> next;
    private final K key;
    private V value;

    public AnEntry(K key, V value) {
        this.key = key;
        this.setValue(value);
    }

    public K getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setNext(AnEntry<K, V> next) {
        this.next = next;
    }

    public AnEntry<K, V> getNext() {
        return next;
    }
}
