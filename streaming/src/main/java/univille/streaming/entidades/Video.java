package univille.streaming.entidades;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String descricao;
    private int duracao;
    private long categoria_id;
    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;


    public Video(){
    };

    public Video(long id, String titulo, String descricao, int duracao, long categoria_id, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
        this.categoria_id = categoria_id;
        this.categoria = categoria;
    }



    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public long getCategoria_id() {
        return categoria_id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setCategoria_id(long categoria_id) {
        this.categoria_id = categoria_id;
    }
}
