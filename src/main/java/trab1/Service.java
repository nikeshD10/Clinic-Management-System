package trab1;
import java.util.Date;
/**
 *
 * @author a46351 Nikesh Dhakal
 * @since 2021-12-06
 */
public class Service {
    /*
        Data of Service Class
        "cod" as service code
        "datehour" as service assigned date
        "cost" as service cost
        "patient" as patient assigned to this service
    */
    private int cod;
    protected double cost;
    protected Date datehour;
    private Patient patient;
    /*
        Parameterized Constructor
        @param dh, c as date and cost
    */
    public Service(Date dh, double c) {
        datehour = dh;
        cost = c;
    }
    /*
        @return "cod" of service;
    */

    public int getCod() {
        return cod;
    }

    /*
        @function set cod to new code as "c"
        @param "c" as cost of service
    */
    public void setCod(int c) {
        cod = c;
    }
  
    /*
        @return "cost" of service;
    */
    public double getCost() {
        return cost;
    }
    
    /*
        @function set "patient" to "p"
        @param "p" as new patient
    */
    public boolean assignPatient(Patient p) {
        patient = p;
        if (patient == null) {
            System.out.println("\nError in assigning patient");
            return false;
        } else {
            System.out.println("\n---------------------\t\tService Assigned To\t---------------------|");
            System.out.println("\n" + patient + this);
            return true;
        }
    }
    @Override
    public String toString() {
        return "\nService ID: \t\t" + cod + "\nDate: \t\t\t" + datehour + "\nCost: \t\t\t" + cost;
    }
}
