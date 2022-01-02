package cours;

import java.time.LocalDate;

public class Absence {
    private LocalDate dateAbsence;
    private boolean justification;

    public Absence(LocalDate dateAbsence, boolean justification) {
        super();
        this.dateAbsence = dateAbsence;
        this.justification = justification;
    }

    public LocalDate getDateAbsence() {
        return dateAbsence;
    }

    public void setDateAbsence(LocalDate dateAbsence) {
        this.dateAbsence = dateAbsence;
    }

    public boolean isJustification() {
        return justification;
    }

    public void setJustification(boolean justification) {
        this.justification = justification;
    }
}
