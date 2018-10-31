package services;

import accounts.Account;
import java.util.HashMap;

public class Service {
    private static int id;
    protected static HashMap<Integer, Account> accounts = new HashMap<>();

    public Service(){

    }

    public static void addAccount(Integer id, Account acc) {
        accounts.put(id, acc);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Service.id = id;
    }

    public static HashMap<Integer, Account> getAccounts() {
        return accounts;
    }


    public static void setAccounts(HashMap<Integer, Account> accounts) {
        Service.accounts = accounts;
    }

    public static void getAccount(Account acc) {
        acc.getFirstName();
    }


}
