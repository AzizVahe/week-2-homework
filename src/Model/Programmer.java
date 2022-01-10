package Model;

public class Programmer extends Human {
    private String position;
    private int salary;
    private Computer computer;


    public Programmer(String name, String position, int salary){
        super(name);
        this.position = position;
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    public int getSalary(){
        return salary;
    }

    public void writeCode(){
        System.out.println("Codding");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "firstname='" + getFirstname() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", position='" + position + '\'' +
                ", age=" + getAge() +
                ", salary=" + salary +
                '}';
    }
}

