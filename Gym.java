import java.util.ArrayList;

public class Gym {
    
    private String gymName;
    private ArrayList<Member> membersList;
    private ArrayList<Staff> staffList;
    private ArrayList<BootcampClass> bootcampList;

    public Gym(String gymName) {
        this.gymName = gymName;
        this.membersList = new ArrayList<>();
        this.staffList = new ArrayList<>();
        this.bootcampList = new ArrayList<>();
    }

    public void addMember(Member m) {
        membersList.add(m);
        System.out.println("Member added: " + m.getName());
    }

    public void removeMember(Member m) {
        membersList.remove(m);
        System.out.println("Member removed: " + m.getName());
    }

    public void addStaff(Staff s) {
        staffList.add(s);
        System.out.println("Staff added: " + s.getName());
    }

    public void displayAllMemberships() {
        System.out.println("\n--- All Memberships for " + gymName + " ---");
        for (Member m : membersList) {
            System.out.println("Member ID: " + m.getMemberID() + " | Name: " + m.getName());
        }
    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public ArrayList<Member> getMembersList() {
        return membersList;
    }

    public void setMembersList(ArrayList<Member> membersList) {
        this.membersList = membersList;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }

    public ArrayList<BootcampClass> getBootcampList() {
        return bootcampList;
    }

    public void setBootcampList(ArrayList<BootcampClass> bootcampList) {
        this.bootcampList = bootcampList;
    }
}