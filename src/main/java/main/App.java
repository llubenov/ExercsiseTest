package main;

import accounts.Account;
import services.Service;

public class App {

    private App() {

    }

    static void main(){
        Account acc = new Account("aa", "sad", "sa");

        Service service = new Service();

        service.addAccount(1, acc);

    }
}
