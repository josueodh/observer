import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void shouldNotifyClient(){
        Company company = new Company("Empresa 1", "Gerente 1");
        Client client1 = new Client("Cliente 1");
         client1.answerForm(company);
        company.newAnswer();
        assertEquals("Cliente 1, respondeu a pesquisa da empresa Empresa 1, gerente: Gerente 1", client1.getLastNofification());
    }

    @Test
    void sloudNotifyClients(){
        Company company = new Company("Empresa 1", "Gerente 1");
        Client client1 = new Client("Client1");
        Client client2 = new Client("Client2");
        client1.answerForm(company);
        client2.answerForm(company);
        company.newAnswer();
        assertEquals("Client1, respondeu a pesquisa da empresa Empresa 1, gerente: Gerente 1", client1.getLastNofification());
        assertEquals("Client2, respondeu a pesquisa da empresa Empresa 1, gerente: Gerente 1", client2.getLastNofification());
    }

    @Test
    void shouldNotNotifyClient(){
        Company company = new Company("Empresa 1", "Gerente 1");
        Client client = new Client("Client1");
        company.newAnswer();
        assertEquals(null, client.getLastNofification());
    }
}