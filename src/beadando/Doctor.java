package beadando;

public class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void chat(Person person) {
        System.out.println(this.getName() + " chatting with: " + person.getName());
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return super.toString() + " Doctor{specialization=" + specialization + "}";
    }
    
}
