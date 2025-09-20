package univille.streaming.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import univille.streaming.entidades.Categoria;
import univille.streaming.entidades.Video;

import java.util.List;


public interface VideoRepository extends JpaRepository<Video,Long> {

    List<Video> findByTituloContainingIgnoreCaseOrderByTituloAsc(String titulo);
    List<Video> findByCategoriaOrderByTituloAsc(Categoria categoria);
    @Query("SELECT v FROM Video v JOIN v.avaliacoes a GROUP BY v ORDER BY AVG(a.nota) DESC")
    List<Video> findTop10ByAverageNota();
    @Query("SELECT v FROM Video v JOIN v.visualizacoes vis GROUP BY v ORDER BY COUNT(vis) DESC")
    List<Video> findTop10ByMostViewed();

}

