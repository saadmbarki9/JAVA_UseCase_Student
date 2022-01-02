package cours;

public class Person implements Trackable {
    private String firstName;
    private String lastName;
    private String school;
    private int authorizedAbsence=10;

    public Person(String firstName, String lastName, String school, int authorizedAbsence) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
        this.authorizedAbsence = authorizedAbsence;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAuthorizedAbsence() {
        return authorizedAbsence;
    }

    public void setAuthorizedAbsence(int authorizedAbsence) {
        this.authorizedAbsence = authorizedAbsence;
    }

    public void display(){

    }

    public int trackSituation() {
        return 0;
    }
}
