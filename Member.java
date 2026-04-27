import java.time.LocalDate;
import java.time.Period;


public class Member extends Person {

    private int memberID;
    private String phone;
    private String dateOfBirth;

    public Member(String name, String email, int memberID, String phone, String dateOfBirth) {
        super(name, email);
        this.memberID = memberID;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;

    }

    public int calculateAge()  {
        LocalDate birthDate = LocalDate.parse(this.dateOfBirth);
        LocalDate currentDate = LocalDate.now()

        return Period.between(birthdate, currentDate).getYears();

    }

    public void register()  {
        System.out.println("Member " + getName + " (ID: " + memberID + ") has been succesfull registered.");
    }

    public void bookClass()  {
        System.out.println(getName + " is managing their subscription details. ");
    }

    public void makePayment(double amount) {
        System.out.println(getName() + " has made a payment of £" + amount);
    }
    // --- GETTERS & SETTERS ---
    
    public int getMemberID()  {
        return memberID;
    }

    public void setMemberID(int memberID)  {
        this.memberID = memberID;
    }

    public String getPhone() {
        return phone;
    
    }

    public void setPhone(int phone) {
        this.phone = phone;

    }

    public String getDateOfBirth() {
        return dateOfBirth
    }

    public void setDateOfBirth()  {
        this.dateOfBirth = dateOfBirth;
    }

}
