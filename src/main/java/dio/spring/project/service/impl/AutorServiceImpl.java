package dio.spring.project.service.impl;

import dio.spring.project.model.Autor;
import dio.spring.project.repository.AutorRepository;
import dio.spring.project.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Iterable<Autor> findAll() {
        return autorRepository.findAll();
    }

    @Override
    public Optional<Autor> findById(Integer id) {
        return autorRepository.findById(id);
    }

    @Override
    public void save(Autor autor) {
        autorRepository.save(autor);
    }

    @Override
    public void deleteById(String name) {

    }

    @Override
    public void update(String nome, Autor autor) {

    }

}
