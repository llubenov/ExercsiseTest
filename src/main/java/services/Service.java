package services;

import accounts.Account;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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



    public static int countWithStreams(String passedString) {

            return (int) accounts.entrySet().stream().filter(entry -> entry.getValue().getFirstName().equals(passedString)).count();

    }

    public static int countFirstNames(String nameToCheck) {
        int count = 0;
        for (HashMap.Entry<Integer, Account> entry : accounts.entrySet()) {
            String firstname = entry.getValue().getFirstName();
            if (firstname == nameToCheck ){
                count ++;
            }

    }
        return count;


    }


}
