package dio.spring.project.service;

import dio.spring.project.model.Autor;
import dio.spring.project.model.Livro;

import java.util.Optional;

public interface LivroService {

    Iterable<Livro> findAll();

    Optional<Livro> findById(Integer id);

    void save(Livro livro);

    void deleteById(Integer id);

    void update(Integer id, Livro livro);
}
