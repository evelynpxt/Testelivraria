package repositorylivrariasrs;

import com.livrariasrs.livrosrs.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor,Long> {
}
