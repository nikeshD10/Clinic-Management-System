package trab1;
import java.util.*;
/**
 *
 * @author a46351 Nikesh Dhakal
 * @since 2021-12-06
 */
public class Clinic {
    /*
        Collection of Patient with key as patient_id;
        
    */
    private final TreeMap<Integer, Patient> patients;
    /*
        Collection of Service with key as service_id;
    */
    private final TreeMap<Integer, Service> services;
    /*
        Default Constructor
    */
    public Clinic(){
        patients = new TreeMap<Integer, Patient>();
        services = new TreeMap<Integer, Service>();
    };
    /*
        Adding the Patient in the collection of the Patient Object;
        @param "n" Name of the Patient
    */
    
    public boolean addPatient(String n) {
        Patient patient = new Patient(n);
        int id = patients.size()+1;
        patient.setNumID(id);
        patients.put(id, patient);
        System.out.println("\n---------------------\t\tAdded Patient: \t---------------------|");
        System.out.println(patient);
        return true;
    }
    /*
        Adding the Consultation in the collection of Services 
        @param "dh" as service_date,  "c" as service_cost, "d" as diagonistic 
    */

    public boolean addConsultation(Date dh, double c) {
       int id = services.size() + 1;
        Consultation consultation = new Consultation(dh, c);
        consultation.setCod(id);
        services.put(id, consultation);
        System.out.println("\n---------------------\t\tAdded Consultation: \t---------------------|");
        System.out.println(consultation);
        return true;
    }
    /*
        Adding the Medical Exam in the collection of Services
        @param "dh" as service_date, "c" as service_cost,  "t" as typology
    */
    
    public boolean addMedicalExam(Date dh, double c, String t) {
        int id = services.size() + 1;
        MedicalExam exam = new MedicalExam(dh, c, t);
        exam.setCod(id);
        services.put(id, exam);
        System.out.println("\n---------------------\t\tAdded Exam: \t\t---------------------|");
        System.out.println(exam);
        return true;
    }
    
    /*
        Assigning the service to the patient with using there unique ID;
        @param  "cod" as service_code, "numID" as patient_id         
        Unique sequential ID provided to each services and patient.
        
        @return true if both service and patient exist;
                false and msg if anyone of object doesn't exists;
    */
    public boolean assignServicePatient(int cod, int numID) {
        if (patients.containsKey(numID)) {
            if (services.containsKey(cod)) {
                Patient patient = patients.get(numID);
                if (services.get(cod) instanceof Consultation){
                    Consultation consultation = (Consultation) services.get(cod);
                    consultation.assignPatient(patient);
                    return true;
                } else if (services.get(cod) instanceof MedicalExam) {
                    MedicalExam exam = (MedicalExam) services.get(cod);
                    exam.assignPatient(patient);
                    return true;
                }
                return true;
            } else{
                System.out.println("Service doesn't exist !!!");
                return false;
            }
        } else {
            System.out.println("Patient doesn't exist !!!");
            return false;
        }
    }
    
    /*
        Calculate the total amount received by Clinic
        @return receivedAmount;
    */
    public double calculateReceivedAmount(){
        double receivedAmount = 0;
        for (Service service: services.values()) {
            receivedAmount += service.getCost();
        }
        return receivedAmount;
    }
    
    /*
        @param "cod" as service code, "d" as diagnosis
    */
    
    public void setDiagnostic(int cod, String d) {
        if (services.containsKey(cod)) {
            for (Service service: services.values()) {
                if (service.getCod() == cod) {
                    Consultation consultation = (Consultation) service;
                    consultation.setDiagnostic(d);
                    System.out.println("\n---------------------\t\tDiagnostic Report: \t---------------------|");
                    System.out.println(consultation);
                }
            }
        } else {
            System.out.println("\nSorry Consultation ID " + cod + " doesn't exist!!!");
        }
    }
}
