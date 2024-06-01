import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cc8850.projeto.Model.Login;

public class LoginTest {

    private Login login;

    @BeforeEach
    public void setUp() {
        login = new Login("usuario", "senha123", "Nome do Usuário", "Administrador");
    }

    @Test
    public void testGetLogin() {
        assertEquals("usuario", login.getLogin());
    }

    @Test
    public void testGetSenha() {
        assertEquals("senha123", login.getSenha());
    }

    @Test
    public void testGetNome() {
        assertEquals("Nome do Usuário", login.getNome());
    }

    @Test
    public void testGetPrivilegio() {
        String privilegio = login.getPrivilegio();
        assertEquals("Administrador", privilegio);
    }
}
