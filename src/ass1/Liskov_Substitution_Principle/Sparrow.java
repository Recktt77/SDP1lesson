package ass1.Liskov_Substitution_Principle;

public class Sparrow extends Bird implements Flyable {
    public void fly() {
        System.out.println("The sparrow is flying.");
    }
    public void eat() {
        System.out.println("The sparrow is eating.");
    }
}
