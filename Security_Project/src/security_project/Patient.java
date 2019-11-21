
package security_project;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Patient extends Person{
    
    private int id;
    private String acceptedDate;
    private String disease;
    
    private final String patients_FileName = "Patients.txt";
    
    public static ArrayList<Patient> patients = new ArrayList<Patient>();

    public Patient() {
    }

    public Patient(int id, String FName, String LName, String gender, String birthDate, int age, String acceptedDate, String disease, String phone,String address) {
        
        super( FName,  LName,  gender,  birthDate,  age,  phone,  address);
        
        this.id = id;
        this.acceptedDate = acceptedDate;
        this.disease = disease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(String acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
    
    
    
    public boolean addPatient(){
        if(FManger.Write(getPatientData(), patients_FileName, true)){
            return true;
        }else{
            return false;
        }
    }
    
    private String getPatientData() {

        return this.id + "@" + this.FName + "@" + this.LName + "@" + this.gender + "@" + this.birthDate + "@" + this.age + "@" + this.acceptedDate + "@" + this.disease + "@" + this.phone + "@"+ this.address + "@";

    }
    
    private void loadFromFile() {

            patients = (ArrayList<Patient>) (Object) FManger.Read(patients_FileName);

    }
    
    
    public String displayAllPatients() {

        loadFromFile();

        String pa = "\nAll Patient Data:\n";

        for (Patient pt : patients) {

            pa = pa + pt.toString();

        }

        return pa;

    
        
        
}

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", acceptedDate=" + acceptedDate + ", disease=" + disease +",FName="+FName+" , LName"+LName+" ,gender"+gender+" ,birth date"+birthDate+" ,age"+ age+" ,phone"+phone+" ,address"+address+'}';
    }
      private int getPatientIndex(int id){
        for (int i = 0; i < patients.size(); i++){
            
            if(patients.get(i).getId() == id)
                return i;
        }
        return -1;
    }
   

        public String searchPatient(int id) throws FileNotFoundException{
        loadFromFile();
        int index = getPatientIndex(id);
        if(index != -1)
            return  patients.get(index).toString();
        else 
            return "\nNot Found ...!";
    }
            private void commitToFile() {
        FManger.Write(patients.get(0).getPatientData(), patients_FileName, false);
        for (int i = 1; i < patients.size(); i++) {
            FManger.Write(patients.get(i).getPatientData(), patients_FileName, true);
        }
            }
        public void deletePatient(int id){
        loadFromFile();
        int index = getPatientIndex(id);
        patients.remove(index);
        commitToFile();
    } 
         @Override
    public String toString() {
        return   "\n Patient ID : " + id +"  "+"Frist Name : "+FName+"  "+"Last Name : "+LName+"\n"+" Gender : " +gender
                +"  "+"Brith Date : "+birthDate+" "+"Age : "+age+"\n"+"Accepted Date"+acceptedDate+"  "+
                "Disease : "+disease+"  "+"Phone : "+phone+"\n"+"Address : "+address;
    }
}
