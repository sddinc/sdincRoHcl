package assingmentAccount.day5.week1CoreJava;

import java.time.LocalDate;

public abstract class  Policy {

     int policyNumber;
     String policyName;
     int premiumAmount;
     int sumAssuredAmount;
     LocalDate premiumDate;

    public Policy(int policyNumber, String policyName, int premiumAmount, int sumAssuredAmount) {
        super();
        this.policyNumber = policyNumber;
        this.policyName = policyName;
        this.premiumAmount = premiumAmount;
        this.sumAssuredAmount = sumAssuredAmount;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public int getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(int premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public int getSumAssuredAmount() {
        return sumAssuredAmount;
    }

    public void setSumAssuredAmount(int sumAssuredAmount) {
        this.sumAssuredAmount = sumAssuredAmount;
    }

    public LocalDate getPremiumDate() {
        return premiumDate;
    }

    public void setPremiumDate(LocalDate premiumDate) {
        this.premiumDate = premiumDate;
    }


}