public class Person implements Payable, Comparable<Person> {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;

    public Person(){
    this.id = id_gen++;
    }

    public Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public String getPosition(){
        return "Student ";
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}
