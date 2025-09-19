package univille.streaming.Jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import univille.streaming.entidades.Usuario;
import univille.streaming.entidades.Video;

import java.time.*;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}


	@Bean
	CommandLineRunner run(VideoRepository repoVid, UsuarioRepository repoUser) {
		return args -> {
			// Inserções

			repoVid.save(new Video()

			// Select
			System.out.println("Lista de tarefas : Total:"+repo.count());
			repo.findAll().forEach(p ->
					System.out.println(p)
			);
			// Select
			System.out.println("---------------------");
			System.out.println("Tarefas finalizadas");
			repo.findByFinalizadoTrue().forEach(p ->
					System.out.println(p)
			);
			System.out.println("---------------------");
			System.out.println("Tarefas atrasadas");
			repo.findByFinalizadoFalseAndDataPrevistaDeConclusaoLessThan(LocalDateTime.now()).forEach(p ->
					System.out.println(p)
			);
			System.out.println("---------------------");
			System.out.println("Tarefas para fazer");
			repo.findByFinalizadoFalse().forEach(p ->
					System.out.println(p)
			);
			repo.deleteAll();
		};
	}

}
