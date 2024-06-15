package dio.spring.project.service;

import dio.spring.project.model.Autor;

import java.util.Optional;

public interface AutorService {

    Iterable<Autor> findAll();

    Optional<Autor> findById(Integer id);

    void save(Autor autor);

    void deleteById(String name);

    void update(String nome, Autor autor);

}
