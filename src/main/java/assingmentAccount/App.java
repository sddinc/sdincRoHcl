package assingmentAccount;
public class App extends Account {
    public static void main(String[] args) {
        Account a1=new Account(123,"sdinc","abc123",100,null,null,200);
        ContactDetails details=new ContactDetails("123","bucharest","Bucharest","Rom",1234,789797,"dinc@gmail.com");

        System.out.println("Balance after =");
        a1.depositeOpt(100);

        System.out.println("Balance=");
        a1.withdrawOpt(250);
        System.out.println(a1.getBalance());

        System.out.println("---------");
        System.out.println(a1.getCashback());


        //String accountNum = a1.getAccounNumber();
        a1.submitUserDetails("abc123","HCL");
        a1.printUserAllDetails();

//email
        System.out.println(details.getEmailId());
        details.setEmailId("teo@gmail.com");
        System.out.println("after update email");
        System.out.println(details.getEmailId());
//phoneNumber
        System.out.println("phoneNumber=");
        System.out.println(details.getMobileNumber());
        details.setMobileNumber(456781525);
        System.out.println("after update phonenumber");
        System.out.println(details.getMobileNumber());





    }

}
