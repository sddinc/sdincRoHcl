package assingmentAccount;

import java.util.HashMap;
import java.util.Map;

public class Account {
    private long accounNumber;
    private String username;
    private String password;
    private int balance;
    private  KYCVerification kycVerification;
    private  ContactDetails contactDetails;
    private double cashback;

    public double getCashback() {
        return cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }

    int deposite;
    int withdrawal;



    public Account(long accounNumber, String username, String password, int balance,KYCVerification kycVerification,ContactDetails contactDetails ,int cachback) {
        this.accounNumber = accounNumber;
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.kycVerification = kycVerification;
        this.contactDetails = contactDetails;
        this.cashback = cashback;

    }



    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }


    public long getAccounNumber() {
        return accounNumber;
    }

    public void setAccounNumber(long accounNumber) {
        this.accounNumber = accounNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public KYCVerification getKycVerification() {
        return kycVerification;
    }

    public void setKycVerification(KYCVerification kycVerification) {
        this.kycVerification = kycVerification;
    }

    public ContactDetails getConrtactDetails() {
        return contactDetails;
    }

    public void setCachback(int cachback) {
        this.cashback = cachback;
    }

    public int depositeOpt(int amount){
        this.balance=balance+amount;
        return this.balance;
    }

    public int withdrawOpt(int amount){
        double cashBack=(amount*0.01);

        this.balance=balance-amount;
        this.cashback=this.cashback+cashBack;
        return this.balance;
    }

    Map<String,String> map=new HashMap<String, String>();



    public void submitUserDetails(String accountNumber, String newUsername){
        map.put("username",accountNumber);
        map.put("username",newUsername);






    }
    public void printUserAllDetails(){

        map.entrySet()
                .stream()
                .forEach(System.out::println);



        /*
        System.out.println("String="+this.accounNumber);
        System.out.println("username="+this.username);
        System.out.println("balance="+this.balance);
        System.out.println("cashback="+this.cashback);
*/

    }
    public void printUserContactDetails(){

    }
    public void printBalance(){
        System.out.println("balance="+this.balance);
    }




}
