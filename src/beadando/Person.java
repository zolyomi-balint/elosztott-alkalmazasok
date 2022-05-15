package beadando;

public class Person {
    private String name;
    private int age;
    private boolean isHealthy;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.isHealthy = true;
    }
    
    public void chat(Person person) {
        System.out.println(this.name + " chatting with: " + person.name);
        this.setIsHealthy(Math.random() < .9);
        person.setIsHealthy(Math.random() < .9);
    }

    public void setIsHealthy(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isIsHealthy() {
        return isHealthy;
    }
    
}
