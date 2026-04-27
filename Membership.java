public abstract class Membership {

    private int membershipID;
    private double basePrice;
    private boolean isActive;
    private String startDate;
    private String expiryDate;

    public Membership(int membershipID, double basePrice, boolean isActive, String startDate, String expiryDate) {
        this.membershipID = membershipID;
        this.basePrice = basePrice;
        this.isActive = isActive;
        this.startDate = startDate;
        this.expiryDate = expiryDate;
    }

    public void displayDetails() {
        if (isActive) {
            System.out.println("The base price of membership is " + basePrice + " and is active, it expires on " + expiryDate);
        } else {
            System.out.println("The base price of membership is " + basePrice + " and is not active.");
        }
    }

    public int getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(int membershipID) {
        this.membershipID = membershipID;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}