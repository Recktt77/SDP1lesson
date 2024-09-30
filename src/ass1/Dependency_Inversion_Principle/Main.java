package ass1.Dependency_Inversion_Principle;

public class Main {
    public static void main(String[] args) {
        Switchable lamp=new Light();
        Button light=new Button(lamp);
        light.press();
        light.drop();
    }
}
