package cours;

import java.util.List;

public class Student extends Person implements Trackable{
    private char groupe;
    private List<Absence> allAbsences;

    public Student(String firstName, String lastName, String school, int authorizedAbsence, char groupe, List<Absence> allAbsences) {
        super(firstName, lastName, school, authorizedAbsence);
        this.groupe = groupe;
        this.allAbsences = allAbsences;
    }

    public char getGroupe() {
        return groupe;
    }

    public void setGroupe(char groupe) {
        this.groupe = groupe;
    }

    public List<Absence> getAllAbsences() {
        return allAbsences;
    }

    public void setAllAbsences(List<Absence> allAbsences) {
        this.allAbsences = allAbsences;
    }

    public boolean justify(Absence a, String reason) throws AbsenceException{
        if (reason.equals("")){
            throw new AbsenceException();
        }else {
            a.setJustification(true);
            return true;
        }

    }

    public void addAbsence(Absence a){
        this.allAbsences.add(a);

    }

}
