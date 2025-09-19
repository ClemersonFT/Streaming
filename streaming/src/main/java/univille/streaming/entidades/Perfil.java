package univille.streaming.entidades;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome_perfil;
    private long usuario_id;
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public Perfil(long id, String nome_perfil, long usuario_id, Usuario usuario) {
        this.id = id;
        this.nome_perfil = nome_perfil;
        this.usuario_id = usuario_id;
        this.usuario = usuario;
    }

    public Perfil() {}

    public long getId() {
        return id;
    }

    public String getNome_perfil() {
        return nome_perfil;
    }

    public long getUsuario_id() {
        return usuario_id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome_perfil(String nome_perfil) {
        this.nome_perfil = nome_perfil;
    }

    public void setUsuario_id(long usuario_id) {
        this.usuario_id = usuario_id;
    }
}
