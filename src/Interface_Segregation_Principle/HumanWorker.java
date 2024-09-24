package Interface_Segregation_Principle;

public class HumanWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Human is working.");
    }
    public void eat() {
        System.out.println("Human is eating.");
    }
}