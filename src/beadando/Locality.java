package beadando;

import java.util.ArrayList;
import java.util.Collections;

public class Locality {
    public ArrayList<Person> people;
    
    public Locality() {
        this.people = new ArrayList<>();
    }
    
    public void addPerson(Person person) {
        people.add(person);
    }

    public ArrayList<Person> getPeople() {
        return people;
    }
    
    public void sortPeopleByName() {
        Collections.sort(people, new NameComparator());
    }
    
    public void sortPeopleByAge() {
        Collections.sort(people, new AgeComparator());
    }
}
