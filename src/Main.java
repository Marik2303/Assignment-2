import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Main{
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Student("Dauren","Koshkenbek",1.0));
        personArrayList.add(new Student("Timur","Matan",4.0));
        personArrayList.add(new Employee("Palma","Dada","Sok",950));
        personArrayList.add(new Employee("Yeti","Monster","Energetik",850));

        Collections.sort(personArrayList);
        printData(personArrayList);


    }
    public static void printData(Iterable<Person> personArrayList){
        for (Person person : personArrayList) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge ");
        }
    }

}