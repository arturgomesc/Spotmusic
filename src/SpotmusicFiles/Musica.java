package SpotmusicFiles;

import SpotmusicFiles.calculos.Classificavel;

public class Musica extends Titulo implements Classificavel {
    private String artista;
    private String album;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassificacao() {
        return (int) media()/2;
    }
}
