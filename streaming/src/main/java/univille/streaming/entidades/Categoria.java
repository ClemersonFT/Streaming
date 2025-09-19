package univille.streaming.entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @OneToMany(mappedBy = "categoria")
    private List<Video> videos = new ArrayList<>();

    public Categoria(long id, String nome, List<Video> videos) {
        this.id = id;
        this.nome = nome;
        this.videos = videos;
    }

    public Categoria(){}

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
