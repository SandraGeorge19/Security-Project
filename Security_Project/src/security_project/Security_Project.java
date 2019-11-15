
package security_project;

import java.util.Scanner;


public class Security_Project {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Admins admins1 = new Admins("sandra", "george", "female", "13/7/1999", 20, "01024196555", "helwan", "0123456789", "0123456789");
        Admins admins2 = new Admins("mariam", "mostafa", "female", "13/7/1999", 20, "01024196555", "helwan", "0123456789", "0123456789");
        Admins admins3 = new Admins("rawan", "ashraf", "female", "13/7/1999", 20, "01024196555", "helwan", "0123456789", "0123456789");
        
        
        int ch=1;
        
        String FName,LName,gender,birthDate,phone,address,pass,re_pass,acc_date,disease;
        int id,age;
        
        while(ch!=0){
            ch= input.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Patient Info ... ");
                    System.out.print("Patient ID : ");
                    id = input.nextInt();
                    System.out.print("Patient First Name : ");
                    FName = input.nextLine();
                    System.out.print("Patient Last Name : ");
                    LName = input.nextLine();
                    System.out.print("Patient Gender : ");
                    gender = input.nextLine();
                    System.out.print("Patient Birth Date : ");
                    birthDate=input.nextLine();
                    System.out.print("Patient Age : ");
                    age = input.nextInt();
                    System.out.print("Patient Accepted Date : ");
                    acc_date=input.nextLine();
                    System.out.print("Patient Disease : ");
                    disease=input.nextLine();
                    System.out.print("Patient Phone : ");
                    phone=input.nextLine();
                    System.out.print("Patient Address : ");
                    address=input.nextLine();
                    admins1.addNewPatient(id, FName, LName, gender, birthDate, age, acc_date, disease, phone, address);
                    break;
                    
                case 2:
                    admins1.displayPatients();
                    break;
                    
                default:
                    System.out.println("Enter vaild Option :(");
            }
        }
        
        
    }
    
}
