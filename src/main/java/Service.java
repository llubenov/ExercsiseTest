import java.util.List;

public class Service {

    public static List<Account> accounts;

    public static void addAccount(Account acc) {
        accounts.add(acc);
    }

    public static List<Account> getAccounts() {
        return accounts;
    }

    public static void setAccounts(List<Account> accounts) {
        Service.accounts = accounts;
    }

    public static void getAccount(Account acc) {
        acc.getFirstName();
    }


}
