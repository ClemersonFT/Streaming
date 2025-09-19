package univille.streaming.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import univille.streaming.entidades.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    @Query("""
        SELECT u
        FROM Usuario u
        JOIN Perfil p ON p.usuario = u
        JOIN Visualizacao vis ON vis.perfil = p
        GROUP BY u
        ORDER BY COUNT(vis.id) DESC
    """)
    Usuario findUsuarioQueMaisAssistiu();

}