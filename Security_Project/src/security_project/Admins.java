
package security_project;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Admins extends Person{
    private String passwoed;
    private String re_passwoed;
    
    private final String admins_FileName = "Admins.txt";
    
    public static ArrayList<Admins> admins = new ArrayList<Admins>();

    public Admins() {
    }

    public Admins(String FName, String LName, String gender, String birthDate, int age, String phone, String address,String passwoed, String re_passwoed) {
        
        super( FName,  LName,  gender,  birthDate,  age,  phone,  address);
        
        this.passwoed = passwoed;
        this.re_passwoed = re_passwoed;
    }

    public String getPasswoed() {
        return passwoed;
    }

    public void setPasswoed(String passwoed) {
        this.passwoed = passwoed;
    }

    public String getRe_passwoed() {
        return re_passwoed;
    }

    public void setRe_passwoed(String re_passwoed) {
        this.re_passwoed = re_passwoed;
    }

    
    public void addNewPatient(int id, String FName, String LName, String gender, String birthDate, int age, String acceptedDate, String disease, String phone,String address) {

        Patient patie = new Patient(id, FName, LName, gender, birthDate, age, acceptedDate, disease, phone,address);

        if (patie.addPatient()) {

            System.out.println(patie.toString() + "Patient Added Successfully ... !");

        } else {

            System.out.println("Patient Failed to insert ... !");

        
        }
    
    
}
  
    
    public void displayPatients() {

        Patient patie = new Patient();

        System.out.println(patie.displayAllPatients());

    }

    @Override
    public String toString() {
        return "Admins{" + "passwoed=" + passwoed + ", re_passwoed=" + re_passwoed + ",FName="+FName+" , LName"+LName+" ,gender"+gender+" ,birth date"+birthDate+" ,age"+ age+" ,phone"+phone+" ,address"+address+ '}';
    }
 public void searchForPatient(int id) throws FileNotFoundException {
        Patient x = new Patient();
        System.out.println(x.searchPatient(id));
    }

   public void deletePatient(int id) {
        Patient patie = new Patient();
        patie.deletePatient(id);
        System.out.println("deleted Successfully ... !");    }
   
    

}
