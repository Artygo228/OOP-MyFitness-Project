public class PayAsYouGoMembership extends Membership{

    private double costPerVisit;
    private int validityDays;


    public PayAsYouGoMembership(int membershipId, double basePrice, boolean isActive, String startDate, String expiryDate, double costPerVisit, int validityDays) {
        super(membershipId, basePrice, isActive, startDate, expiryDate);
        this.costPerVisit = costPerVisit;
        this.validityDays = validityDays;
     

    }

    public double getCostPerVisit()  {
        return costPerVisit;
    }

    public void setCostPerVisit(double costPerVisit)  {
        this.costPerVisit = costPerVisit;
    
    }

    public int getValidityDays()  {
        return validityDays;
    }

    public void setValidityDays(int validityDays)  {
        this.validityDays = validityDays;
    
    }
}