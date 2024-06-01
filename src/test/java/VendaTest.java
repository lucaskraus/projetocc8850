import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import com.cc8850.projeto.Model.Cliente;
import com.cc8850.projeto.Model.Produto;
import com.cc8850.projeto.Model.Venda;
import com.cc8850.projeto.Model.VendaItem;

public class VendaTest {

    private Venda venda;
    private Cliente cliente;
    private Produto produto1;
    private Produto produto2;
    private VendaItem vendaItem1;
    private VendaItem vendaItem2;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente();
        cliente.setIdCliente(1);
        cliente.setNome("Cliente Teste");
        cliente.setData(new Date());

        produto1 = new Produto(1, "Produto 1", 10.5f);
        produto2 = new Produto(2, "Produto 2", 20.0f);

        vendaItem1 = new VendaItem(1, 3, produto1.getValor());
        vendaItem2 = new VendaItem(2, 2, produto2.getValor());
        
        venda = new Venda(1, new Date(), cliente, 5.0f, 50.0f);
        venda.adicionaItem(vendaItem1);
        venda.adicionaItem(vendaItem2);
    }

    @Test
    public void testGetDesconto() {
        assertEquals(5.0f, venda.getDesconto());
    }

    @Test
    public void testGetValorPago() {
        assertEquals(50.0f, venda.getValorPago());
    }

    @Test
    public void testGetTotalVenda() {
        assertEquals(71.5f, venda.getTotalVenda());
    }

    @Test
    public void testGetTotalVendaLiquida() {
        assertEquals(66.5f, venda.getTotalVendaLiquida());
    }

    @Test
    public void testGetItens() {
        assertEquals(2, venda.getItens().size());
    }

    @Test
    public void testGetNextItemCodigo() {
        assertEquals(3, venda.getNextItemCodigo());
    }
}
