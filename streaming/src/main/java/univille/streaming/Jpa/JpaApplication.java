package univille.streaming.Jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.*;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}


	@Bean
	CommandLineRunner run(TarefaRepository repo) {
		return args -> {
			// Inserções

			repo.save(new Tarefa(null,"Exercício de POO",false, LocalDateTime.of(LocalDate.of(2025,9,1),LocalTime.now()),null,null));
			repo.save(new Tarefa(null,"Exercício de SOP",true, LocalDateTime.of(LocalDate.of(2025,9,1),LocalTime.now()),null,LocalDateTime.now()));
			repo.save(new Tarefa(null,"Exercício de ESTD",false, LocalDateTime.of(LocalDate.of(2025,9,1),LocalTime.now()),LocalDateTime.of(LocalDate.of(2025,9,2),LocalTime.now()),null));

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
