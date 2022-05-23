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
    
    public void chat(Person person) {
        System.out.println(this.name + " chatting with: " + person.name);
        this.updateHealthy();
        person.updateHealthy();
    }
    
    public void updateHealthy() {
        if (this.isHealthy()) {
                this.setHealthy(Math.random() < .9);
            }
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

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
