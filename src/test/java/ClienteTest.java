import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cc8850.projeto.Model.Cliente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClienteTest {

    private Cliente cliente;
    private SimpleDateFormat dateFormat;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente();
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }

    @Test
    public void testSetAndGetIdCliente() {
        int id = 1;
        cliente.setIdCliente(id);
        assertEquals(id, cliente.getIdCliente());
    }

    @Test
    public void testSetAndGetNome() {
        String nome = "Teste Nome";
        cliente.setNome(nome);
        assertEquals(nome, cliente.getNome());
    }

    @Test
    public void testSetAndGetData() throws ParseException {
        Date data = dateFormat.parse("01/01/2000");
        cliente.setData(data);
        assertEquals(data, cliente.getData());
    }

    @Test
    public void testGetIdade() throws ParseException {
        Date dataNascimento = dateFormat.parse("01/01/2000");
        cliente.setData(dataNascimento);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int expectedAge = currentYear - 2000;
        assertEquals(expectedAge, cliente.getIdade());
    }

    @Test
    public void testToString() {
        int id = 1;
        String nome = "Teste Nome";
        cliente.setIdCliente(id);
        cliente.setNome(nome);
        assertEquals(id + " - " + nome, cliente.toString());
    }

    @Test
    public void testGetIdadeWithoutDate() {
        assertEquals(0, cliente.getIdade());
    }
}
