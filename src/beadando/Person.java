package beadando;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private boolean healthy;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.healthy = true;
    }
    
    public String chatReturnsNameOfWhoGotSick(Person otherPerson) {
        String nameOfSick = "";
        boolean thisWasHealthy = this.isHealthy();
        boolean otherWasHealthy = otherPerson.isHealthy();
        this.updateHealthy();
        otherPerson.updateHealthy();
        
        if (thisWasHealthy && !this.isHealthy()) {
            nameOfSick += this.getName();
            if (otherWasHealthy && !otherPerson.isHealthy()) {
                nameOfSick += " and " + otherPerson.getName();
            }
        } else if (otherWasHealthy && !otherPerson.isHealthy()) {
            nameOfSick += otherPerson.getName();
        }
        
        return nameOfSick;
    }
    
    public void updateHealthy() {
        if (this.isHealthy()) {
                this.setHealthy(Math.random() < .9);
            }
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    /* GETTERS */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHealthy() {
        return healthy;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", healthy=" + healthy + '}';
    }
    
}
