package classes.Threads;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 7/9/13
 * Time: 10:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class RaceDemo {
    public static void main(String[] args) {
        Racer racer = new Racer();
        Thread tortoiseThread = new Thread(racer, "Tortoise");
        Thread hareThread = new Thread(racer, "Hare");
        //Race to start. tell threads to start
        tortoiseThread.start();
        hareThread.start();
    }
}
