package br.univille.projeto_farmacia_fso2024_a;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import br.univille.projeto_farmacia_fso2024_a.entity.Cliente;
import br.univille.projeto_farmacia_fso2024_a.service.ClienteService;

@SpringBootTest
@ContextConfiguration
@ActiveProfiles(profiles = "test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class ClienteServiceTests {
    
    @Autowired
    private ClienteService service;

    @Test
    void getAllClientesEmptyList() {
        var listaClientes = service.getAll();
        assertEquals(listaClientes.size(), 0);
    }

    @Test
    void saveNewClienteFindAll(){
        var newCliente = new Cliente();
        newCliente.setNome("Zezinho");
        newCliente.setEndereco("Rua lalal 100");
        service.save(newCliente);

        var listaCliente = service.getAll();
        assertEquals(listaCliente.get(0).getNome(), "Zezinho");
    }
}
