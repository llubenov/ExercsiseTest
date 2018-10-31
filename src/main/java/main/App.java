package main;

import accounts.Account;
import services.Service;

public class App {

    private App() {

    }

    public static void main(String[] args){
        Account acc = new Account("aa", "sad", "sa");
        Account acc2 = new Account("aa", "dsadasdas", "sadsadas");
        Account acc3 = new Account("aaz", "dsadasdassadadas", "sadsadsadasdsadas");


        Service service = new Service();

        service.addAccount(1, acc);
        service.addAccount(2, acc2);
        service.addAccount(3, acc3);


        service.countFirstNames("aa");

        System.out.println(service);



    }
}
