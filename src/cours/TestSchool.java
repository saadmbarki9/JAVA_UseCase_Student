package cours;

import java.time.LocalDate;
import java.util.LinkedList;

public class TestSchool {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Absence> abs_youssef= new LinkedList<Absence>();
        LinkedList<Absence> abs_mohamed= new LinkedList<Absence>();
        LinkedList<Absence> abs_mouna= new LinkedList<Absence>();


        Student s_youssef= new Student("Youssef","A","DataTruc",10,'A',abs_youssef);
        Student s_mohammed = new Student("Mohammed", "A", "DataTruc", 10, 'B', abs_mohamed);
        Student s_mouna = new Student("Mouna", "A", "DataTruc", 10, 'A', abs_mouna);

        Professor p_ahmed= new Professor("Ahmed","B","DataTruc",10,12,60,"computer science");
        Professor p_imane= new Professor("Imnae","A","DataTruc",10,32,80,"communication");

        Absence s_youssef_1= new Absence(LocalDate.of(18,12,03),false);
        s_youssef.addAbsence(s_youssef_1);

        Absence s_youssef_2= new Absence(LocalDate.of(18,11,28),false);
        s_youssef.addAbsence(s_youssef_2);


        Absence s_mouna_1=new Absence(LocalDate.of(18,11,26),false);
        s_mouna.addAbsence(s_mouna_1);
        System.out.println(s_mouna.getAllAbsences());;



        try {
            s_mouna.justify(s_mouna_1,"Participation à une journée sportive);");
        } catch (AbsenceException e) {
            e.printStackTrace();
            System.out.println(e);
        }


        Student[] allStudents={s_mohammed,s_mouna,s_youssef};
        int max=0;
        String studentName ="";
        //for (int i=0;i<allStudents.length;i++)
        for (Student i:allStudents){
            if (i.getAllAbsences().size()<=max){
                max=i.getAllAbsences().size();
                studentName=i.getFirstName();
            }

        }
        System.out.println(studentName);



    }
}
