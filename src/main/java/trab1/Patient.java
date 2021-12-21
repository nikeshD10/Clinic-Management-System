package trab1;

/**
 *
 * @author a46351 Nikesh Dhakal
 * @since 2021/12/06
 */

public class Patient {
    /*
        Data of Patient class
        @data "numID", "name" as Patient ID and Patient Name
    */
    private int numID;
    private String name;
   
    /*
        Parametrized Constructor
    */
    public Patient(String n) {
        name = n;
    }
    /*
        @return "numID" of Patient
    */
    public int getNumID(){
        return numID;
    }
    /*
        @param id as patient ID 
        @function set the numID to  new id;
    */
    public void setNumID(int id){
        numID = id;
    }
    /*
        @return "name"  of the patient;
    */
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "\nPatient ID: " + numID + "\t\tPatient Name: " + name;
    }
}
