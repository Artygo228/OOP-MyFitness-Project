public class Instructor extends Staff {
    
    private String speciality;

    public Instructor(String name, String email, int staffID, boolean isFullTime, String speciality) {
        super(name, email, staffID, isFullTime);
        this.speciality = speciality;
    }

    public void organiseClass() {
        System.out.println("Instructor " + getName() + " is now organizing a " + speciality + " class!");
    }

    public String getSpeciality() {
        return speciality;
    }
}