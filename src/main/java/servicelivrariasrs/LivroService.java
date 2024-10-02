package servicelivrariasrs;

import com.livrariasrs.livrosrs.Livro;
import repositorylivrariasrs.LivroRepository;

import java.util.List;
import java.util.Optional;

public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository=livroRepository;
    }
    public Optional<Livro> getLivroById(Long id){
        return livroRepository.findById(id);

    }

    public Livro saveLivro(Livro livro){
        return (Livro) livroRepository.save(livro);

    }
    public void deleteLivro(Long id){
        livroRepository.deleteById(id);
    }


    public List<Livro> getAllLivros() {

        return List.of();
    }
}
