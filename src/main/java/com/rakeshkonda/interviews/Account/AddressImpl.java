package classes.Account;

import interfaces.Address;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 10/4/12
 * Time: 8:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class AddressImpl implements Address {

    private String userName;

    @Override
    public String getUserName() {
        return userName;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setUserName(String username) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
