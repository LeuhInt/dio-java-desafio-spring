package dio.spring.project.service.impl;

import dio.spring.project.model.Autor;
import dio.spring.project.model.Livro;
import dio.spring.project.repository.AutorRepository;
import dio.spring.project.repository.LivroRepository;
import dio.spring.project.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroServiceimpl implements LivroService {

    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Iterable<Livro> findAll() {
        return livroRepository.findAll();
    }

    @Override
    public Optional<Livro> findById(Integer id) {
        return livroRepository.findById(id);
    }

    @Override
    public void save(Livro livro) {
        verificar(livro);
    }

    private void verificar(Livro livro) {
        Integer autor_id = livro.getAutor().getId();
        Autor autor = autorRepository.findById(autor_id).orElseGet(() -> {
            Autor novo_autor = new Autor();
            autorRepository.save(novo_autor);
            return novo_autor;
        });
        livro.setAutor(autor);
        livroRepository.save(livro);
    }

    @Override
    public void deleteById(Integer id) {
        livroRepository.deleteById(id);

    }

    @Override
    public void update(Integer id, Livro livro) {
        Optional<Livro> livroBd = livroRepository.findById(id);
        if (livroBd.isPresent()) {
            verificar(livro);
        }
    }
}
