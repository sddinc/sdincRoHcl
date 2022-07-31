package assingmentAccount.day5.week1CoreJava;
import java.security.Policy;
import java.util.List;
public class Account {
    int accountNumber;
    String accountHolderName;
    int balance;
    List<Policy> policies;
    ContactDetails contactDetails;


    public Account(int accountNumber, String accountHolderName, int balance, List<Policy> policies, ContactDetails contactDetails) {
        super();
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.policies = policies;
        this.contactDetails = contactDetails;
    }



    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public List<Policy> getPolicies() {
        return policies;
    }
    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }
    public ContactDetails getContactDetails() {
        return contactDetails;
    }
    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
}
