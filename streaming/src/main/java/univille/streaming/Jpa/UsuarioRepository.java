package univille.streaming.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import univille.streaming.entidades.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario,Long> { }