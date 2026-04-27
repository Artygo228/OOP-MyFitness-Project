public class Staff extends Person {

private int staffID;
private boolean isFullTime;

public Staff(String name, String email, int staffID, boolean isFullTime) {
    super(name,email);
    this.staffID = staffID;
    this.isFullTime = isFullTime;
}

public int getStaffID() {
    return staffID;
}

public void setStaffID(int staffID) {
    this.staffID = staffID;
}

public boolean getIsFullTime() {
    return isFullTime;
}

public void setIsFullTime(boolean isFullTime) {
    this.isFullTime = isFullTime;
}
}