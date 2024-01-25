public class Student extends Person {
    private double Gpa;

    @Override
    public double getPaymentAmount() {
        if (Gpa > 2.67){
            return 36660.0;
        }
        else{
            return 0;
        }
    }

    public Student(){
        super();
    }

    public Student(String name, String surname, double Gpa){
        super(name,surname);
        setGpa(Gpa);
    }

    public void setGpa(double gpa) {
        this.Gpa = gpa;
    }

    public double getGpa() {
        return Gpa;
    }

    @Override
    public String toString() {
        return "Student " + getId() + ' ' + getName() + ' ' + getSurname();
    }
}
