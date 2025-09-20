package univille.streaming.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import univille.streaming.entidades.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {}
