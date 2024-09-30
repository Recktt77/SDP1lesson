package ass1.Single_Responsibility_Principle;
public class EmailValidator {
    public boolean isValid(String email) {
        return email.contains("@") && email.contains(".");
    }
}
