package assingmentAccount;

public class ContactDetails extends Account {
    private String houseNumber;
    private String localityName;
    private String stateName;
    private String countryName;
    private long pincode;
    private long mobileNumber;
    private String emailId;

    public ContactDetails(String houseNumber, String localityName, String stateName, String countryName, long pincode, long mobileNumber, String emailId) {
        this.houseNumber = houseNumber;
        this.localityName = localityName;
        this.stateName = stateName;
        this.countryName = countryName;
        this.pincode = pincode;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }




    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }






}
