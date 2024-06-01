import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cc8850.projeto.Model.Produto;
import com.cc8850.projeto.Model.VendaItem;

public class VendaItemTest {

    private VendaItem vendaItem;
    private Produto produto;

    @BeforeAll
    public void setUp() {
        produto = new Produto(1, "Produto Teste", 10.5f);
        vendaItem = new VendaItem(1, 3, 10.5f);
        vendaItem.setProduto(produto);
    }

    @Test
    public void testGetIdVendaItem() {
        assertEquals(1, vendaItem.getIdVendaItem());
    }

    @Test
    public void testGetQuantidade() {
        assertEquals(3, vendaItem.getQuantidade());
    }

    @Test
    public void testGetValorUnitario() {
        assertEquals(10.5f, vendaItem.getValorUnitario());
    }

    @Test
    public void testGetProduto() {
        assertEquals(produto, vendaItem.getProduto());
    }
}
