package beadando;

public class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void updateHealthy() {
      // doctor can't get sick from chatting
    }
    
    @Override
    public String toString() {
        return super.toString() + " Doctor{specialization=" + specialization + "}";
    }
    
}
