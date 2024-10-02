package Controllerlivrariasrs;

import com.livrariasrs.livrosrs.Autor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import servicelivrariasrs.AutorService;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AutorController {
    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping
    public List<Autor> getAllAutores() {
        return autorService.getAllAutores();
    }

    @PostMapping
    public Autor createAutor(@RequestBody Autor autor) {
        return autorService.saveAutor(autor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAutor(@PathVariable Long id) {
        autorService.deleteAutor(id);
        return ResponseEntity.noContent().build();
    }
}
