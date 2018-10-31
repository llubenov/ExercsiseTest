import accounts.Account;
import org.junit.Test;
import services.Service;

import static org.junit.Assert.assertEquals;


public class AccountTest {


    @Test
    public void testAccountFirstNames() {

        Account acc = new Account("aa", "sad", "sa");
        Account acc2 = new Account("aa", "saasdadsa", "saas");
        Service service = new Service();

        service.addAccount(1, acc);
        service.addAccount(2, acc);

        assertEquals(2, service.countFirstNames("aa"));
        assertEquals(2, service.countWithStreams("aa"));




    }


}