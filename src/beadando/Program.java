package beadando;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Person("Peter", 52);
        Person p2 = new Person("Sam", 45);
        
        Doctor d1 = new Doctor("Richard", 66, "surgeon");
        Doctor d2 = new Doctor("Dean", 78, "psychiatrist");
        
        System.out.println("Original:");
        List<Person> people = Arrays.asList(p1, p2, d1, d2);
        printPeople(people);
        
        System.out.println("Sorted by name:");
        Collections.sort(people, new NameComparator());
        printPeople(people);
        
        System.out.println("Sorted by age:");
        Collections.sort(people, new AgeComparator());
        printPeople(people);

//        p1.chat(p2);
//        d1.chat(d2);

    }

    private static void printPeople(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("");
    }
    
}
