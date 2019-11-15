
package security_project;


public class Person {
    
    protected String FName;
    protected String LName;
    protected String gender;
    protected String birthDate;
    protected int age;
    protected String phone;
    protected String address;
    
    FileManager FManger = new FileManager();

    public Person() {
    }

    public Person(String FName, String LName, String gender, String birthDate, int age, String phone, String address) {
        this.FName = FName;
        this.LName = LName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FileManager getFManger() {
        return FManger;
    }

    public void setFManger(FileManager FManger) {
        this.FManger = FManger;
    }
    
    
}
