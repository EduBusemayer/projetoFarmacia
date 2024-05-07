package br.univille.projeto_farmacia_fso2024_a.service;

import java.util.List;
import br.univille.projeto_farmacia_fso2024_a.entity.Cliente;

public interface ClienteService {
    void save(Cliente cliente);
    Cliente getById(long id);
    List<Cliente> getAll();
    Cliente delete(long id);
}
