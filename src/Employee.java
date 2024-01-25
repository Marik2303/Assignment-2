public class Employee extends Person {
    private int salary;
    private String position;
    public Employee(){
        super();
    }

    public Employee(String name, String surname, String position, int salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee " + getId() + ' ' + getName() +' ' + getSurname() + ' ' + position;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
