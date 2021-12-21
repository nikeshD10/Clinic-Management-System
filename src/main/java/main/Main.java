
package main;
import java.util.*;
import trab1.Clinic;
/**
 * Small application that allows to manage the appointments of patients where 
 * they can take service of consultations and medical exams. And ID for each 
 * patient and service are auto incremented.
 * 
 * 
 * @author a46351 Nikesh Dhakal
 * @since 2021-12-06
 */


public class Main {
     public static void main(String[] args) {
        Clinic clinic = new Clinic();
        Date today = Calendar.getInstance().getTime();
        /*
            Adding the patients in the clinic
            @param name Name of the Patient
        */
        clinic.addPatient("Patient Example 1");
        /*
            Adding the Consultation in Clinic"
            @param date, cost_of_consultation
        */
        clinic.addConsultation(today, 120);   
        /*
            Assigning Consultation to Patient
            @param service_id, patient_id
        */
        clinic.assignServicePatient(1, 1);
        /*
            Adding the Medical Exam in CLinic"
            @param date, cost_of_exam, typology
        */
        clinic.addMedicalExam(today, 200, "X-Ray");
        /*
            Assigning Exam to Patient
            @param service_id, patient_id
        */
        clinic.assignServicePatient(2, 1);

        /*
            Setting Diagnostic Report of Consultation
            @param service_id, diagnostic_report
        */
        clinic.setDiagnostic(1, "Body Followup");
        /*
            Calculate the Received Amount in Clinic
        */
        System.out.println("\n---------------------\t\tReceived Amount \t---------------------|");
        System.out.println("\nAmount: €" + clinic.calculateReceivedAmount() + "\n");
       
    }
}
