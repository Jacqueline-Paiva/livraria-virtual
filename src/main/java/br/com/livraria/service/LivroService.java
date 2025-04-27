package br.com.livraria.service;

import br.com.livraria.model.Livro;
import br.com.livraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> listar() {
        return livroRepository.findAll();
    }

    public void salvar(Livro livro) {
        livroRepository.save(livro);
    }

    @Transactional
    public void excluir(Long id) {
        livroRepository.deleteById(id);
    }
}
