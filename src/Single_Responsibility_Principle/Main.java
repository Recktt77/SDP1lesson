package Single_Responsibility_Principle;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice", "alice@example.com");
        EmailValidator validator = new EmailValidator();
        if (validator.isValid(user.getEmail())) {
            System.out.println(user.getName() + "'s email is valid.");
        } else {
            System.out.println(user.getName() + "'s email is invalid.");
        }
    }
}

