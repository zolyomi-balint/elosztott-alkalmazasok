package beadando;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Locality {
    public ArrayList<Person> people;
    
    public Locality() {
        this.people = new ArrayList<>();
        loadPeople();
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

    public void savePeople() {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("locality.bin"));
            o.writeObject(people);
            o.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    
    private void loadPeople() {
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("locality.bin"));
            people = (ArrayList<Person>) o.readObject();
            o.close();
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
