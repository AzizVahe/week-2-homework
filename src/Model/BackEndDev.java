package Model;

public class BackEndDev extends Programmer{
    public BackEndDev(String name, String position, int salary){
        super(name,position,salary);
    }
    public void writeCode(){
        System.out.println("Codding with Java");
    }

    @Override
    public String toString() {
        return "BackEndDev{" +
                "firstname='" + getFirstname() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                '}';
    }
}
