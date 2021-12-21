package trab1;
import java.util.Date;
/**
 *
 * @author a46351 Nikesh Dhakal
 * @since 2021-12-06
 */
/*
    Inherits the Service class
*/
public class MedicalExam extends Service {
    /*  
        Data of MedicalExam Class
        "typology" as exam type;
    */
    protected String typology;
    /*
        Parameterized Constructor
        @param "dh" as exam_date, "c" as exam_cost, "t" as typology
    */
    public MedicalExam(Date dh, double c, String t){
        super(dh, c);
        typology = t;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTypology: \t\t" + typology;
    }
}
