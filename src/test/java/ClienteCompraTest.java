import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cc8850.projeto.Model.Cliente;
import com.cc8850.projeto.Model.ClienteCompra;

public class ClienteCompraTest {

    private Cliente cliente;
    private ClienteCompra clienteCompra;

    @BeforeAll
    public void setUp() {
        cliente = new Cliente();
        cliente.setIdCliente(1);
        cliente.setNome("Cliente Teste");
        clienteCompra = new ClienteCompra(cliente, 5);
    }

    @Test
    public void testGetCliente() {
        assertEquals(cliente, clienteCompra.getCliente());
    }

    @Test
    public void testGetQuantidade() {
        assertEquals(5, clienteCompra.getQuantidade());
    }

    @Test
    public void testToString() {
        String expectedString = "Cliente: 1 - Cliente Teste - Quantidade Venda(s): 5";
        assertEquals(expectedString, clienteCompra.toString());
    }
}
