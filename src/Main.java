import SpotmusicFiles.Titulo;
import SpotmusicFiles.Musica;
import SpotmusicFiles.Podcast;
import SpotmusicFiles.calculos.CalculadoraDeTempo;
import SpotmusicFiles.calculos.Classificavel;
import SpotmusicFiles.calculos.Filtro;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setNome("Obstacle 1");
        minhaMusica.setArtista("Interpol");
        minhaMusica.setAlbum("Turn On The Bright Lights");
        minhaMusica.setAnoDeLancamento(2002);
        minhaMusica.setCurtida(true);
        minhaMusica.setDuracaoEmMinutos(4);

        minhaMusica.exibeDados();

        minhaMusica.avaliacao(8.3);
        minhaMusica.avaliacao(10);
        minhaMusica.avaliacao(9.5);
        minhaMusica.avaliacao(7);
        System.out.println("Média de avaliações (" + minhaMusica.getTotalDeAvaliacoes() + "): " + minhaMusica.media());


        Musica outraMusica = new Musica();
        outraMusica.setNome("Welcome to the Machine");
        outraMusica.setArtista("Pink Floyd");
        outraMusica.setAlbum("Wish You Were Here");
        outraMusica.setAnoDeLancamento(1975);
        outraMusica.setCurtida(true);
        outraMusica.setDuracaoEmMinutos(8);

        outraMusica.exibeDados();

        outraMusica.avaliacao(10);
        outraMusica.avaliacao(10);
        outraMusica.avaliacao(9.5);
        outraMusica.avaliacao(9.8);
        System.out.println("Média de avaliações (" + outraMusica.getTotalDeAvaliacoes() + "): " + outraMusica.media());

        Podcast meuPodcast = new Podcast();
        meuPodcast.setNome("Choque de Cultura - Ambiente de Música");
        meuPodcast.setAutor("Canal Brasil");
        meuPodcast.setAnoDeLancamento(2023);
        meuPodcast.setCurtida(false);
        meuPodcast.setDuracaoEmMinutos(36);

        meuPodcast.exibeDados();

        Filtro filtro = new Filtro();
        filtro.filtra(minhaMusica);
        filtro.filtra(outraMusica);
    }
}