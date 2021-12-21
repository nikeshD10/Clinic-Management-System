package trab1;
import java.util.Date;
/**
 *
 * @author a46351 Nikesh Dhakal
 * @since 2021-12-06
 */
/*
    Inherits Service Class
*/
public class Consultation extends Service {
    /*
        Data of Consulation Class
        "diagnostic" as diagnosis report
    */
    private String diagnostic;
    /*
        Parameterized Constructor
        @param "dh" as consultation date, "c" as consultation cost
    */
    public Consultation(Date dh, double c) {
        super(dh, c);
    }
    /*
        @function set "diagnostic" to "d"
        @param "d" as new diagnostic
    */
    public void setDiagnostic(String d) {
        diagnostic = d;
    }
    
   
    @Override
    public String toString() {
        return super.toString() + "\nDiagnostic: \t\t" + diagnostic;
    }
}
