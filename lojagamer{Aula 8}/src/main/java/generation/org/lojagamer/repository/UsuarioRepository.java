package generation.org.lojagamer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import generation.org.lojagamer.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);
	//select * from tb_usuarios where ususario = "usuario";

	public List<Usuario> findAllByNomeContainingIgnoreCase(String string);

}