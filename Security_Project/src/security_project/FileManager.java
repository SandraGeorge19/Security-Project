
package security_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileManager {
    public boolean Write(String Query, String FilePath, boolean appendType){
        
        PrintWriter writer = null;
        
        try{
            System.out.println("Writing in : "+ FilePath);
            
            writer = new PrintWriter(new FileWriter(new File(FilePath), appendType));
            writer.println(Query);
            System.out.println("Done ..");
            
            return true;
        } catch (IOException e) {
            System.out.println(e);
        }finally{
            writer.close();
        }
        return false;
    }
    
    
    public ArrayList<Object> Read (String FilePath){
        
        Scanner Reader = null;
        
        try{
            System.out.println("Reading from :"+ FilePath);
            Reader= new Scanner(new File(FilePath));
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
        if(FilePath.equals("Patients.txt")){
            
            ArrayList<Patient> patients = new ArrayList<Patient>();
            Patient P;
            
            while (Reader.hasNext()) {
                P = new Patient();
                String next = Reader.nextLine();
                String[] seprated = next.split("@");
                
                P.setId(Integer.parseInt(seprated[0]));
                P.setFName(seprated[1]);
                P.setLName(seprated[2]);
                P.setGender(seprated[3]);
                P.setBirthDate(seprated[4]);
                P.setAge(Integer.parseInt(seprated[5]));
                P.setAcceptedDate(seprated[6]);
                P.setDisease(seprated[7]);
                P.setPhone(seprated[8]);
                P.setAddress(seprated[9]);
                      
                patients.add(P);
             
            }
            return (ArrayList<Object>) (Object) patients;
            
        }else if(FilePath.equals("Admins.txt")){
            
            ArrayList<Admins> admins = new ArrayList<Admins>();
            Admins A;
            
            while (Reader.hasNext()) {
                A = new Admins();
                String next = Reader.nextLine();
                String[] seprated = next.split("@");
                
                A.setFName(seprated[0]);
                A.setLName(seprated[1]);
                A.setGender(seprated[2]);
                A.setBirthDate(seprated[3]);
                A.setAge(Integer.parseInt(seprated[4]));
                A.setPhone(seprated[5]);
                A.setAddress(seprated[6]);
                A.setPasswoed(seprated[7]);
                A.setRe_passwoed(seprated[8]);
                      
                admins.add(A);
             
            }
        
            return (ArrayList<Object>) (Object) admins;
    }else {
            return null;
        }
    
}
}
