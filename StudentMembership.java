public class StudentMembership extends Membership{

    private String studentId;
    private double discountRate;
    private int discountMonths;


    public StudentMembership(int membershipId, double basePrice, boolean isActive, String startDate, String expiryDate, String studentId, double discountRate, int discountMonths) {
        super(membershipId, basePrice, isActive, startDate, expiryDate);
        this.studentId = studentId;
        this.discountRate = discountRate;
        this.discountMonths = discountMonths;

    }

    public String getStudentId()  {
        return studentId;
    }

    public void setStudentId(String studentId)  {
        this.studentId = studentId;
    
    }

    public double getDiscountRate()  {
        return discountRate;
    }

    public void setDiscountRate(double discountRate)  {
        this.discountRate = discountRate;
    
    }

    public int getDiscountMonths()  {
        return discountMonths;
    }

    public void setDiscountMonths(int discountMonths)  {
        this.discountMonths = discountMonths;
    
    }
    
}
