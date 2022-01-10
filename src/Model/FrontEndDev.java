package Model;

public class FrontEndDev extends Programmer{
    public FrontEndDev(String name, String position, int salary){
        super(name, position, salary);
    }
    public void writeCode(){
        System.out.println("Codding with JavaScript");
    }

    @Override
    public String toString() {
        return "FrontEndDev{" +
                "firstname='" + getFirstname() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                '}';
    }
}
