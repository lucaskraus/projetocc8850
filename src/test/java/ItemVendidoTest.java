import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cc8850.projeto.Model.ItemVendido;
import com.cc8850.projeto.Model.Produto;

public class ItemVendidoTest {

    private Produto produto;
    private ItemVendido itemVendido;

    @BeforeEach
    public void setUp() {
        produto = new Produto(1, "Produto Teste", 10.5f);
        itemVendido = new ItemVendido(produto, 5);
    }

    @Test
    public void testGetProduto() {
        assertEquals(produto, itemVendido.getProduto());
    }

    @Test
    public void testGetQuantidade() {
        assertEquals(5, itemVendido.getQuantidade());
    }

    @Test
    public void testToString() {
        String expectedString = "Produto: 1 - Produto Teste - Quantidade: 5";
        assertEquals(expectedString, itemVendido.toString());
    }
}
