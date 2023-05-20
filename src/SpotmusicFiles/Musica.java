package SpotmusicFiles;

public class Musica extends Titulo {
    private String artista;
    private String album;
    private String genero;
    private int lancamento;

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }
    public void exibeFichaTecnica() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista/Banda: " + getArtista());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Lançamento: " + getLancamento());
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalCurtidas() > 2000) {
            return 10;
        } else if (this.getTotalCurtidas() > 1000){
            return 8;
        } else {
            return 6;
        }
    }
}
