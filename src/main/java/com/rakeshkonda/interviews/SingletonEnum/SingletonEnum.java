package classes.SingletonEnum;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 7/10/13
 * Time: 12:17 AM
 * To change this template use File | Settings | File Templates.
 */
public enum SingletonEnum {
    INSTANCE;
    private static String testStr = "";

    public static void setTestStr(String newTestStr) {
        testStr = newTestStr;
    }

    public static String getTestStr() {
        return testStr;
    }

    public static String sayHello(String name) {
        return "Hello " + name;
    }
}
