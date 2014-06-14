package classes.Account;
import interfaces.AccountInfo;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 6/27/12
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountInfoImplement implements AccountInfo {

    static{
        interfaceCount.incrementAndGet();
    }
    public AccountInfoImplement(){
        Class[] interfaces = AccountInfoImplement.class.getInterfaces();
        for(Class klass : interfaces){
            if(klass.getName().contentEquals("interfaces.AccountInfo")){
                //interfaceCount.incrementAndGet();
            }
        }
    }

    @Override
    public int getAccountObjCount() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getUserName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setUserName(String username) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getId() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public userType getUserType() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setUserType(userType type) {
        //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    public String getEmail() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setEmail(String email) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getPassword() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setPassword(String password) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getDateOfBirth() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
