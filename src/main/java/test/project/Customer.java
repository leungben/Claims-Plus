package test.project;

public class Customer {
    private int accountID;
    private String name;
    private int claimID;
    private int telephoneNum;
    public String emailAdress;

    public Customer(int accountID, String name, int claimID, int telephoneNum, String emailAdress) {
        this.accountID = accountID;
        this.name = name;
        this.claimID = claimID;
        this.telephoneNum = telephoneNum;
        this.emailAdress = emailAdress;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClaimID() {
        return claimID;
    }

    public void setClaimID(int claimID) {
        this.claimID = claimID;
    }

    public int getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(int telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

}
