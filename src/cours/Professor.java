package cours;

public class Professor extends Person implements Trackable {
    private int techingHours,objectif;
    private String speciality;

    public Professor(String firstName, String lastName, String school, int authorizedAbsence, int techingHours, int objectif, String speciality) {
        super(firstName, lastName, school, authorizedAbsence);
        this.techingHours = techingHours;
        this.objectif = objectif;
        this.speciality = speciality;
    }

    public int getTechingHours() {
        return techingHours;
    }

    public void setTechingHours(int techingHours) {
        this.techingHours = techingHours;
    }

    public int getObjectif() {
        return objectif;
    }

    public void setObjectif(int objectif) {
        this.objectif = objectif;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
