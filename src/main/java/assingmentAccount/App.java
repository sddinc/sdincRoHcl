package assingmentAccount;
public class App extends Account {
    public static void main(String[] args) {
        Account a1=new Account(123,"sdinc","abc123",100,null,null,200);

           a1.depositeOpt(100);
           a1.withdrawOpt(50);
           System.out.println(a1.getBalance());
        System.out.println("---------");
        System.out.println(a1.getCashback());
        a1.submitUserDetails("hcl123","HCL");
        a1.printUserAllDetails();


    }

}
