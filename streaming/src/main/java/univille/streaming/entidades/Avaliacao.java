package univille.streaming.entidades;

import jakarta.persistence.*;

@Entity
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "perfil_id", nullable = false)
    private Perfil perfil;
    @ManyToOne
    @JoinColumn(name = "video_id", nullable = false)
    private Video video;
    private Integer nota;
    private String comentario;

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public Perfil getPerfil() {return perfil;}

    public void setPerfil(Perfil perfil) {this.perfil = perfil;}

    public Video getVideo() {return video;}

    public void setVideo(Video video) {this.video = video;}

    public Integer getNota() {return nota;}

    public void setNota(Integer nota) {this.nota = nota;}

    public String getComentario() {return comentario;}

    public void setComentario(String comentario) {this.comentario = comentario;}
}
