import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import com.cc8850.projeto.Model.ComparadorItensVenda;
import com.cc8850.projeto.Model.VendaItem;

public class ComparadorItensVendaTest {

    @Test
    public void testOrdenacaoItensVenda() {
        VendaItem item1 = new VendaItem(1, 3, 10.5f);
        VendaItem item2 = new VendaItem(2, 2, 15.75f);
        VendaItem item3 = new VendaItem(3, 1, 20.0f);

        ArrayList<VendaItem> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);

        Collections.sort(itens, new ComparadorItensVenda());

        assertEquals(item1, itens.get(0));
        assertEquals(item2, itens.get(1));
        assertEquals(item3, itens.get(2));
    }
}
