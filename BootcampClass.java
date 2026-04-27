public class BootcampClass implements Discountable {

    private int classID;
    private String className;
    private double monthlyFee;
    private int durationDays;

    public BootcampClass(int classID, String className, double monthlyFee, int durationDays) { 
        this.classID = classID;
        this.className = className;
        this.monthlyFee = monthlyFee;
        this.durationDays = durationDays;
    }
    
    public double calculateFee(int enrolledClasses) {
        if (enrolledClasses >= 2) {
            double discount = monthlyFee * 0.07;
            return monthlyFee - discount;
        }
        return monthlyFee;
    }

    public void addParticipant(Member m) {
        System.out.println("Participant " + m.getName() + " added for a bootcamp class");
    }

    public void removeParticipant(Member m) {
        System.out.println("Participant " + m.getName() + " removed from the bootcamp class");
    }

    public int getClassID() {
        return classID;
    }
    
    public void setClassID(int classID) {
        this.classID = classID;
    }
    
    public String getClassName() {
        return className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }
    
    public double getMonthlyFee() {
        return monthlyFee;
    }
    
    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
    
    public int getDurationDays() {
        return durationDays;
    }
    
    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }



}