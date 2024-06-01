import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cc8850.projeto.Model.ClientePF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientePFTest {

    private ClientePF cliente;
    private SimpleDateFormat dateFormat;

    @BeforeEach
    public void setUp() {
        cliente = new ClientePF(0, null, null, null, 0);
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }

    @Test
    public void testConstructorAndGetters() {
        try {
            Date dataNasc = dateFormat.parse("01/01/1980");

            ClientePF cliente = new ClientePF(1, dataNasc, "Fulano", "123.456.789-00", 123456);

            assertEquals(1, cliente.getIdCliente());
            assertEquals(dataNasc, cliente.getData());
            assertEquals("Fulano", cliente.getNome());
            assertEquals("123.456.789-00", cliente.getCPF());
            assertEquals(123456, cliente.getIdentidade());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSetters() {
        try {
            Date dataNasc = dateFormat.parse("01/01/1980");

            // Testa os setters
            cliente.setIdCliente(2);
            cliente.setData(dataNasc);
            cliente.setNome("Beltrano");
            cliente.setCPF("987.654.321-00");
            cliente.setIdentidade(654321);

            assertEquals(2, cliente.getIdCliente());
            assertEquals(dataNasc, cliente.getData());
            assertEquals("Beltrano", cliente.getNome());
            assertEquals("987.654.321-00", cliente.getCPF());
            assertEquals(654321, cliente.getIdentidade());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
