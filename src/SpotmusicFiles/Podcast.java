package SpotmusicFiles;

public class Podcast extends Titulo {
    private String autor;
    private String genero;
    private int lancamento;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibeFichaTecnicaPodcast() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Lançamento: " + getLancamento());
    }

    @Override
    public double getClassificacao() {
        if(this.getTotalCurtidas() > 5000){
                return 10;
        } else if (this.getTotalCurtidas() >= 3000 && this.getTotalCurtidas() < 5000){
                return 8;
        } else {
            return 6;
        }
    }
}

