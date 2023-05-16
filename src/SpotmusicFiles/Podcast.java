package SpotmusicFiles;

import SpotmusicFiles.calculos.Classificavel;

public class Podcast extends Titulo implements Classificavel {
    private String autor;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int getClassificacao() {
        return (int) media()/2 ;
    }
}
