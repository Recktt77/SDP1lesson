package ass3;

// Interface for bank accounts
interface BankAccount {
    void accessAccount();
}
// Real bank account object
class RealBankAccount implements BankAccount {
    private String accountHolder;
    public RealBankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void accessAccount() {
        System.out.println("Accessing bank account of: " + accountHolder);
    }
}
// Proxy class
class BankAccountProxy implements BankAccount {
    private RealBankAccount realAccount;
    private String accountHolder;
    public BankAccountProxy(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void accessAccount() {
        if (authenticate()) {
            if (realAccount == null) {
                realAccount = new RealBankAccount(accountHolder);
            }
            realAccount.accessAccount();
        } else {
            System.out.println("Access denied for: " + accountHolder);
        }
    }
    private boolean authenticate() {
        // Simple authentication logic
        return "authorizedUser".equals(accountHolder);
    }
}
// Client code
public class MainProxyTask {
    public static void main(String[] args) {
        BankAccount authorizedAccount = new BankAccountProxy("authorizedUser");
        authorizedAccount.accessAccount(); // Access granted
        BankAccount unauthorizedAccount = new BankAccountProxy("unauthorizedUser");
        unauthorizedAccount.accessAccount(); // Access denied
    }
}
