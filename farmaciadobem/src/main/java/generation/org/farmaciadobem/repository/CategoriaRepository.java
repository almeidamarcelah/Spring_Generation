package generation.org.farmaciadobem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import generation.org.farmaciadobem.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria>findAllByIdCodigoContainingIgnoreCase(String codigo);

}
