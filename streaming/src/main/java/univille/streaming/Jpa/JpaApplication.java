package univille.streaming.Jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import univille.streaming.entidades.*;


import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.List;

@EntityScan("univille.streaming.entidades")
@SpringBootApplication
public class JpaApplication {

	Timestamp dataAtual = new Timestamp(System.currentTimeMillis());

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}


	@Bean
	CommandLineRunner run( UsuarioRepository usuarioRepo,
						   PerfilRepository perfilRepo,
						   CategoriaRepository catRepo,
						   VideoRepository vidRepo,
						   VisualizacaoRepository visRepo,
						   AvaliacaoRepository avaRepo) {

		return args -> {

			visRepo.deleteAll();
			avaRepo.deleteAll();
			vidRepo.deleteAll();
			perfilRepo.deleteAll();
			catRepo.deleteAll();
			usuarioRepo.deleteAll();

			Usuario usuario1 = usuarioRepo.save(new Usuario("João Silva", "joao@email.com", "123456",dataAtual));
			Usuario usuario2 = usuarioRepo.save(new Usuario("Maria Souza", "maria@email.com", "123456", dataAtual));
			Usuario usuario3 = usuarioRepo.save(new Usuario("Pedro Santos", "pedro@email.com", "123456", dataAtual));
			Usuario usuario4 = usuarioRepo.save(new Usuario("Ana Costa", "ana@email.com", "123456", dataAtual));
			Usuario usuario5 = usuarioRepo.save(new Usuario("Lucas Lima", "lucas@email.com", "123456", dataAtual));
			Usuario usuario6 = usuarioRepo.save(new Usuario("Beatriz Rocha", "beatriz@email.com", "123456", dataAtual));
			Usuario usuario7 = usuarioRepo.save(new Usuario("Rafael Alves", "rafael@email.com", "123456",dataAtual));
			Usuario usuario8 = usuarioRepo.save(new Usuario("Carla Dias", "carla@email.com", "123456", dataAtual));
			Usuario usuario9 = usuarioRepo.save(new Usuario("Bruno Martins", "bruno@email.com", "123456", dataAtual));
			Usuario usuario10 = usuarioRepo.save(new Usuario("Fernanda Pinto", "fernanda@email.com", "123456", dataAtual));


			Perfil perfil1 = perfilRepo.save(new Perfil("João", 1L,usuario1));
			Perfil perfil2 = perfilRepo.save(new Perfil("Maria", 2L,usuario2));
			Perfil perfil3 = perfilRepo.save(new Perfil("Pedro", 3L,usuario3));
			Perfil perfil4 = perfilRepo.save(new Perfil("Ana", 4L,usuario4));
			Perfil perfil5 = perfilRepo.save(new Perfil("Lucas", 5L,usuario5));
			Perfil perfil6 = perfilRepo.save(new Perfil("Beatriz", 6L,usuario6));
			Perfil perfil7 = perfilRepo.save(new Perfil("Rafael", 7L,usuario7));
			Perfil perfil8 = perfilRepo.save(new Perfil("Carla", 8L,usuario8));
			Perfil perfil9 = perfilRepo.save(new Perfil("Bruno", 9L,usuario9));
			Perfil perfil10 = perfilRepo.save(new Perfil("Fernanda", 10L,usuario10));

			List<Categoria> categorias = new ArrayList<>();
			categorias.add(catRepo.save(new Categoria("Ação")));
			categorias.add(catRepo.save(new Categoria("Comédia")));
			categorias.add(catRepo.save(new Categoria("Drama")));
			categorias.add(catRepo.save(new Categoria("Ficção")));
			categorias.add(catRepo.save(new Categoria("Terror")));
			categorias.add(catRepo.save(new Categoria("Romance")));
			categorias.add(catRepo.save(new Categoria("Documentário")));
			categorias.add(catRepo.save(new Categoria("Infantil")));
			categorias.add(catRepo.save(new Categoria("Animação")));
			categorias.add(catRepo.save(new Categoria("Musical")));


			Video video1 = vidRepo.save(new Video("Duro de Matar", "Um policial de Nova York luta contra terroristas em um prédio.", 120, categorias.get(0)));
			Video video2 = vidRepo.save(new Video("O Auto da Compadecida", "As aventuras de João Grilo e Chicó no sertão da Paraíba.", 90, categorias.get(1)));
			Video video3 = vidRepo.save(new Video("A Vida é Bela", "Um judeu italiano usa a imaginação para proteger seu filho em um campo de concentração.", 110, categorias.get(2)));
			Video video4 = vidRepo.save(new Video("Blade Runner 2049", "Um caçador de andróides descobre um segredo que pode mergulhar a sociedade no caos.", 130, categorias.get(3)));
			Video video5 = vidRepo.save(new Video("O Exorcista", "Uma mãe procura ajuda para sua filha, que está possuída por uma entidade demoníaca.", 100, categorias.get(4)));
			Video video6 = vidRepo.save(new Video("Diário de uma Paixão", "Um romance de verão entre um casal de classes sociais diferentes.", 105, categorias.get(5)));
			Video video7 = vidRepo.save(new Video("Pássaros na Floresta", "A vida e os hábitos de diversas espécies de pássaros.", 80, categorias.get(6)));
			Video video8 = vidRepo.save(new Video("Procurando Nemo", "Um peixe-palhaço embarca em uma jornada para encontrar seu filho sequestrado.", 70, categorias.get(7)));
			Video video9 = vidRepo.save(new Video("Toy Story", "Os brinquedos de um garoto ganham vida e precisam lidar com um novo boneco astronauta.", 95, categorias.get(8)));
			Video video10 = vidRepo.save(new Video("La La Land", "Um pianista de jazz e uma aspirante a atriz se apaixonam em Los Angeles.", 110, categorias.get(9)));


			Visualizacao visualizacao1 = visRepo.save(new Visualizacao(dataAtual, 45,perfil1,video1));
			Visualizacao visualizacao2 = visRepo.save(new Visualizacao(dataAtual, 20,perfil2,video2));
			Visualizacao visualizacao3 = visRepo.save(new Visualizacao(dataAtual, 70,perfil3,video3));
			Visualizacao visualizacao4 = visRepo.save(new Visualizacao(dataAtual, 12,perfil4,video4));
			Visualizacao visualizacao5 = visRepo.save(new Visualizacao(dataAtual, 120,perfil5,video5));
			Visualizacao visualizacao6 = visRepo.save(new Visualizacao(dataAtual, 5,perfil5,video6));
			Visualizacao visualizacao7 = visRepo.save(new Visualizacao(dataAtual, 123,perfil2,video7));
			Visualizacao visualizacao8 = visRepo.save(new Visualizacao(dataAtual, 100,perfil7,video8));
			Visualizacao visualizacao9 = visRepo.save(new Visualizacao(dataAtual, 60,perfil9,video9));
			Visualizacao visualizacao10 = visRepo.save(new Visualizacao(dataAtual, 128,perfil10,video10));
			Visualizacao visualizacao11 = visRepo.save(new Visualizacao(dataAtual, 50,perfil6,video5));
			Visualizacao visualizacao12 = visRepo.save(new Visualizacao(dataAtual, 12,perfil8,video2));


			Avaliacao avaliacao1 = avaRepo.save(new Avaliacao(perfil1,video1,5, "Muito bom!"));
			Avaliacao avaliacao2 = avaRepo.save(new Avaliacao(perfil2,video2 ,4, "Gostei!"));
			Avaliacao avaliacao3 = avaRepo.save(new Avaliacao(perfil3,video3,3, "Ok."));
			Avaliacao avaliacao4 = avaRepo.save(new Avaliacao(perfil4,video4,5, "Excelente!"));
			Avaliacao avaliacao5 = avaRepo.save(new Avaliacao(perfil5,video5,2, "Não gostei."));
			Avaliacao avaliacao6 = avaRepo.save(new Avaliacao(perfil5,video6,4, "Bom filme."));
			Avaliacao avaliacao7 = avaRepo.save(new Avaliacao(perfil2,video7,3, "Razoável."));
			Avaliacao avaliacao8 = avaRepo.save(new Avaliacao(perfil7,video8,5, "Adorei!"));
			Avaliacao avaliacao9 = avaRepo.save(new Avaliacao(perfil9,video9,4, "Gostoso de assistir."));
			Avaliacao avaliacao10 = avaRepo.save(new Avaliacao(perfil10,video10,3, "Pode melhorar."));
			Avaliacao avaliacao11 = avaRepo.save(new Avaliacao(perfil6,video5,1, "Me caguei toda vendo."));
			Avaliacao avaliacao12 = avaRepo.save(new Avaliacao(perfil8,video2,5, "kkkkkkkkkkkk"));


			System.out.println("Vídeos contendo 'Missão':");
			vidRepo.findByTituloContainingIgnoreCaseOrderByTituloAsc("Missão")
					.forEach(System.out::println);

			System.out.println("\nVídeos da categoria Ação:");
			vidRepo.findByCategoriaOrderByTituloAsc(categorias.get(0))
					.forEach(System.out::println);

			System.out.println("\nTop 10 vídeos mais bem avaliados:");
			vidRepo.findTop10ByAverageNota()
					.forEach(System.out::println);

			System.out.println("\nTop 10 vídeos mais assistidos:");
			vidRepo.findTop10ByMostViewed()
					.forEach(System.out::println);

			System.out.println("\nUsuário que mais assistiu vídeos:");
			visRepo.findUsuariosMaisAssiduos(PageRequest.of(0,1))
					.forEach(System.out::println);
		};
	}

}
