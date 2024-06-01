import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cc8850.projeto.Model.Produto;

public class ProdutoTest {

    private Produto produto;

    @BeforeEach
    public void setUp() {
        produto = new Produto(1, "Produto Teste", 10.5f);
    }

    @Test
    public void testGetIdProduto() {
        assertEquals(1, produto.getIdProduto());
    }

    @Test
    public void testGetDescricao() {
        assertEquals("Produto Teste", produto.getDescricao());
    }

    @Test
    public void testGetValor() {
        assertEquals(10.5f, produto.getValor());
    }

    @Test
    public void testToString() {
        String expectedString = "1 - Produto Teste";
        assertEquals(expectedString, produto.toString());
    }
}
