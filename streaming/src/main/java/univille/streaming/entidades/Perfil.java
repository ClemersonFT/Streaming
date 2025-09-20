package univille.streaming.entidades;

import jakarta.persistence.*;


@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome_perfil;
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public Perfil(String nome_perfil, long usuario_id, Usuario usuario) {
        this.nome_perfil = nome_perfil;
        this.usuario = usuario;
    }

    public Perfil() {}

    public long getId() {
        return id;
    }

    public String getNome_perfil() {
        return nome_perfil;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome_perfil(String nome_perfil) {
        this.nome_perfil = nome_perfil;
    }

}
