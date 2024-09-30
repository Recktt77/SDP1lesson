package ass2.Singleton_Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern:");
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        System.out.println(connection1 == connection2);
        System.out.println();
    }
}
