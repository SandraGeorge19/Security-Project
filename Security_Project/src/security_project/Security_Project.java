
package security_project;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Security_Project {

    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        
        Admins admins1 = new Admins("sandra", "george", "female", "13/7/1999", 20, "01024196555", "helwan", "0123456789", "0123456789");
        Admins admins2 = new Admins("mariam", "mostafa", "female", "13/7/1999", 20, "01024196555", "helwan", "0123456789", "0123456789");
        Admins admins3 = new Admins("rawan", "ashraf", "female", "13/7/1999", 20, "01024196555", "helwan", "0123456789", "0123456789");
        Patient patient =new Patient();
        Admins admin=new Admins();
          
        
        int ch=1;
        
        String FName,LName,gender,birthDate,phone,address,pass,re_pass,acc_date,disease;
        int id,age;
         System.out.print("Enter 1:Add "+"\n"+"2: display "+"\n"+"3: Search"+"\n"+"4: delete"+"\n");

        while(ch!=0){
            ch= input.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Patient Info ... ");
                    System.out.println("Patient ID : ");
                    id = input.nextInt();
                    System.out.println("Patient First Name : ");
                    FName = input.nextLine();
                    System.out.println("Patient Last Name : ");
                    LName = input.nextLine();
                    System.out.println("Patient Gender : ");
                    gender = input.nextLine();
                    System.out.println("Patient Birth Date : ");
                    birthDate=input.nextLine();
                    System.out.println("Patient Age : ");
                    age = input.nextInt();
                    System.out.println("Patient Accepted Date : ");
                    acc_date=input.nextLine();
                    System.out.println("Patient Disease : ");
                    disease=input.nextLine();
                    System.out.println("Patient Phone : ");
                    phone=input.nextLine();
                    System.out.println("Patient Address : ");
                    address=input.nextLine();
                    admins1.addNewPatient(id, FName, LName, gender, birthDate, age, acc_date, disease, phone, address);
                    break;
                    
                case 2:
                    admins1.displayPatients();
                    break;
                case 3:
                      System.out.print("\nSearch for Patient ...!\nEnter Patient ID : ");
                        id = input.nextInt();
                        admin.searchForPatient(id);
                    break;
                case 4:
                        System.out.print("\nDelete Patient info ...!\nEnter Patient ID : ");
                        id = input.nextInt();
                        admin.deletePatient(id);
                        break;
                default:
                    System.out.println("Enter vaild Option :(");
                    break;
            }
        }
        
        
    }
    
}
