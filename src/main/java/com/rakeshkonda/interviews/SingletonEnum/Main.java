package classes.SingletonEnum;

public class Main {

    public static void main(String[] args) {

        //Set the testStr to HI
        SingletonEnum.setTestStr("Hi");

        //Create a new instance of NewClass and display the value of testStr
        NewClass nc = new NewClass();
        nc.showTestStr();

        //Create a second instance of newClass and display the value of testStr
        NewClass nc2 = new NewClass();
        nc.showTestStr();

        //Change the testStr value and display it from both instances
        //of NewClass
        SingletonEnum.setTestStr("BYE");
        nc.showTestStr();
        nc2.showTestStr();

        //Call the hello method in the enum
        System.out.println(SingletonEnum.sayHello("Kailey"));
    }

}