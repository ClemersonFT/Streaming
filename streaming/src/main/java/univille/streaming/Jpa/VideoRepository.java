package univille.streaming.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import univille.streaming.entidades.Categoria;
import univille.streaming.entidades.Video;

import java.util.List;


public interface VideoRepository extends JpaRepository<Video,Long> {

    List<Video> findByTituloContainingIgnoreCaseOrderByTituloAsc(String titulo);
    List<Video> findByCategoriaOrderByTituloAsc(Categoria categoria);
    List<Video> findTop10ByOrderByNotaDesc();
    List<Video> findTop10ByOrderByVisualizacoesDesc();
}

