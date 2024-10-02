package servicelivrariasrs;

import com.livrariasrs.livrosrs.Autor;
import repositorylivrariasrs.AutorRepository;

import java.util.List;
import java.util.Optional;

public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    // Retorna todos os autores
    public List<Autor> getAllAutores() {
        return autorRepository.findAll();  // Corrigi para usar findAll() em vez de findAllById()
    }

    // Retorna um autor por ID
    public Optional<Autor> getAutorById(Long id) {
        return autorRepository.findById(id);
    }

    // Salva um novo autor
    public Autor saveAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    // Deleta um autor pelo ID
    public void deleteAutor(Long id) {
        autorRepository.deleteById(id);
    }
}
