package dio.spring.project.controller;

import dio.spring.project.model.Livro;
import dio.spring.project.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("Livros")
public class BookStore {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public ResponseEntity<Iterable<Livro>> findAll() {
        return ResponseEntity.ok(livroService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Livro>> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(livroService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Livro> save(@RequestBody Livro livro) {
        livroService.save(livro);
        return ResponseEntity.ok(livro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> update(@PathVariable Integer id, @RequestBody Livro livro) {
        livroService.update(id, livro);
        return ResponseEntity.ok(livro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        livroService.deleteById(id);
        return ResponseEntity.ok().build();
    }




}
