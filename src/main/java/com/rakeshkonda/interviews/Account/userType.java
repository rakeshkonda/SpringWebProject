package classes.Account;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 6/12/12
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public enum userType {
    PREMIUM(5000), REGULAR(2000);
    private double userTypePrice;

    userType(double userTypePrice) {
        this.userTypePrice = userTypePrice;
    }

    public double getUserTypePrice(){
        return userTypePrice;
    }
}
