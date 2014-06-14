package classes.Account;

import interfaces.AccountInfo;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 6/9/12
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountInfoImpl implements AccountInfo {

    private static int accountObjCount = 0;
    private String userName;
    private String email;
    private String password;
    private String dateOfBirth;
    private userType type;
    private int id;

    private static Random random = new Random();
    private ArrayList<AccountInfo> accountObjectList = new ArrayList<AccountInfo>();


    static {
        interfaceCount.incrementAndGet();
    }


    public AccountInfoImpl(){
        accountObjCount+=1;
       // random.setSeed(System.currentTimeMillis());
        this.id = random.nextInt(99999)+100000;
        Class[] interfaces = AccountInfoImpl.class.getInterfaces();
        for(Class klass : interfaces){
            if(klass.getName().contentEquals("interfaces.AccountInfo")){
                //interfaceCount.incrementAndGet();
            }
        }
    }

    public  static AccountInfoImpl getInstance(){
        return new AccountInfoImpl();
    }

    public ArrayList<AccountInfo> getAccountObject() {
        return accountObjectList;
    }

    public void addAccountObject(AccountInfo accountInfoObj) {
        accountObjectList.add(accountInfoObj);
    }

    public int getAccountObjCount(){
        return accountObjCount;
    }

    @Override
    public int getId(){
        return this.id;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public userType getUserType() {
        return this.type;
    }

    @Override
    public void setUserType(userType type) {
       this.type = type;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(){
       return password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


}
