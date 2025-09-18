package univille.streaming.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

// DAO
//JpaRepository<Pessoa,Long>
// Pessoa -> Tabela que vai ser consultada e convertida em objeto
// Long -> tipo de dados do id da tabela
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
}
