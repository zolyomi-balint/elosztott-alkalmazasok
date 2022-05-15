package beadando;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Person("Peter", 22);
        Person p2 = new Person("Sam", 45);
        
        Doctor d1 = new Doctor("Richard", 56, "surgeon");
        Doctor d2 = new Doctor("Dean", 78, "psychiatrist");

        p1.chat(p2);
        d1.chat(d2);

        System.out.println("p1: " + p1.isHealthy());
        System.out.println("p2: " + p1.isHealthy());
        System.out.println("d1: " + d1.isHealthy() + " " + d1.getSpecialization());
        System.out.println("d2: " + d2.isHealthy() + " " + d2.getSpecialization());
    }
    
}
