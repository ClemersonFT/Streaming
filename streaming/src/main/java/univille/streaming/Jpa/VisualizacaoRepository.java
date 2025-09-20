package univille.streaming.Jpa;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import univille.streaming.entidades.Usuario;
import univille.streaming.entidades.Visualizacao;

import java.util.List;

public interface VisualizacaoRepository extends JpaRepository<Visualizacao, Long> {

    @Query("SELECT v.perfil.usuario FROM Visualizacao v GROUP BY v.perfil.usuario ORDER BY COUNT(v.id) DESC")
    List<Usuario> findUsuariosMaisAssiduos(Pageable pageable);
}
