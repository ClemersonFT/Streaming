package univille.streaming.Jpa;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import univille.streaming.entidades.Video;

import java.util.List;


public interface VideoRepository extends JpaRepository<Video,Long> {

    List<Video> findByTituloContainingIgnoreCaseOrderByTituloAsc(String titulo);

    List<Video> findByCategoriaIdOrderByTituloAsc(Long categoriaId);

    @Query("""
        SELECT v
        FROM Video v
        JOIN Avaliacao a ON a.video = v
        GROUP BY v
        ORDER BY AVG(a.nota) DESC
    """)
    List<Video> findTop10ByMelhorAvaliacao(Pageable pageable);

    @Query("""
        SELECT v
        FROM Video v
        JOIN Visualizacao vis ON vis.video = v
        GROUP BY v
        ORDER BY COUNT(vis.id) DESC
    """)
    List<Video> findTop10MaisAssistidos(Pageable pageable);
}

