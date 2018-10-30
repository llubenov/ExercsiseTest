public class App {

    static void main(String[] args){
        Account acc = new Account("aa", "sad", "sa");

        Service service = new Service();

        service.addAccount(acc);


        System.out.println(service.getAccounts());

    }
}
