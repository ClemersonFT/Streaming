package univille.streaming.entidades;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
public class Visualizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Timestamp data_hora;
    private int progresso;
    @ManyToOne
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;
    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;

    public Visualizacao(Timestamp data_hora, int progresso, Perfil perfil, Video video) {
        this.data_hora = data_hora;
        this.progresso = progresso;
        this.perfil = perfil;
        this.video = video;
    }

    public Visualizacao(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getData_hora() {
        return data_hora;
    }

    public void setData_hora(Timestamp data_hora) {
        this.data_hora = data_hora;
    }

    public int getProgresso() {
        return progresso;
    }

    public void setProgresso(int progresso) {
        this.progresso = progresso;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }


}



