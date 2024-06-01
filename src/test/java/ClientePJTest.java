import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cc8850.projeto.Model.ClientePJ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientePJTest {

    private ClientePJ cliente;
    private SimpleDateFormat dateFormat;

    @BeforeAll
    public void setUp() {
        cliente = new ClientePJ(0, null, null, null, 0);
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }

    @Test
    public void testConstructorAndGetters() {
        try {
            Date dataFundacao = dateFormat.parse("01/01/2000");

            ClientePJ cliente = new ClientePJ(1, dataFundacao, "Empresa Teste", "12.345.678/0001-90", 123456789);

            assertEquals(1, cliente.getIdCliente());
            assertEquals(dataFundacao, cliente.getData());
            assertEquals("Empresa Teste", cliente.getNome());
            assertEquals("12.345.678/0001-90", cliente.getCnpj());
            assertEquals(123456789, cliente.getInscricaoEstadual());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSetters() {
        try {
            Date dataFundacao = dateFormat.parse("01/01/2000");

            cliente.setIdCliente(2);
            cliente.setData(dataFundacao);
            cliente.setNome("Outra Empresa");
            cliente.setCnpj("98.765.432/0001-21");
            cliente.setInscricaoEstadual(987654321);

            assertEquals(2, cliente.getIdCliente());
            assertEquals(dataFundacao, cliente.getData());
            assertEquals("Outra Empresa", cliente.getNome());
            assertEquals("98.765.432/0001-21", cliente.getCnpj());
            assertEquals(987654321, cliente.getInscricaoEstadual());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
