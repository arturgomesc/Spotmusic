import SpotmusicFiles.Musica;
import SpotmusicFiles.Podcast;
import SpotmusicFiles.calculos.estrelinhas;

public class Main {
    public static void main(String[] args) {
        estrelinhas minhasEstrelinhas = new estrelinhas();
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Obstacle 1");
        minhaMusica.setArtista("Interpol");
        minhaMusica.setGenero("Alternativo/Indie");
        minhaMusica.setLancamento(2002);

        for (int i = 0; i < 2043; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 2004; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Choque de Cultura");
        meuPodcast.setAutor("Canal Brasil");
        meuPodcast.setGenero("Humor");
        meuPodcast.setLancamento(2023);

        for (int i = 0; i < 4000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 3215; i++) {
            meuPodcast.curte();
        }

        minhaMusica.exibeFichaTecnica();
        estrelinhas.inclui(minhaMusica);

        meuPodcast.exibeFichaTecnicaPodcast();
        estrelinhas.inclui(meuPodcast);
    }
}