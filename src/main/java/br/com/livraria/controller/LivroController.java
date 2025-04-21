package br.com.livraria.controller;

import br.com.livraria.model.Livro;
import br.com.livraria.service.LivroService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class LivroController implements Serializable {

    private Livro livro = new Livro();
    private List<Livro> livros;

    @Autowired
    private LivroService livroService;

    @PostConstruct
    public void init() {
        livros = livroService.listar();
    }

    public void salvar() {
        livroService.salvar(livro);
        livro = new Livro();
        livros = livroService.listar();
    }

    public void excluir(Long id) {
        if (id != null) {
            livroService.excluir(id);
            livros = livroService.listar();
        }
    }
    
    // Getters e Setters
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
