package test.project;

public class Claim {

    private int claimID;
    private String info;
    private String holder;
    private String date;

    public Claim(int claimID, String info, String holder, String date) {
        this.claimID = claimID;
        this.info = info;
        this.holder = holder;
        this.date = date;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getClaimID() {
        return claimID;
    }

    public void setClaimID(int claimID) {
        this.claimID = claimID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
