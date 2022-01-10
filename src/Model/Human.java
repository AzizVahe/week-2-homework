package Model;

public class Human {
    private String firstname;
    private String lastname;
    private int age;

    public Human(){

    }
    public Human(String firstname){
        this.firstname = firstname;
    }

    public Human(String firstname,int age){
        this.firstname = firstname;
        this.age = age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }else {
            System.out.println("Set correct value");
        }
    }
    public int getAge() {
        return age;
    }

    public void walking(){
        System.out.println("walking");
    }
    public void sleeping(){
        System.out.println("sleeping");
    }
    public void eating(){
        System.out.println("eating");
    }
}
