package SpotmusicFiles;

public class Titulo {
    private String nome;
    private String album;
    private int anoDeLancamento;
    private boolean curtida;
    private double somaDeAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeDados() {
        System.out.println("\nTítulo: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração total em minutos: " + duracaoEmMinutos);
        System.out.println("Curtido: " + curtida);
    }

    public void avaliacao(double nota) {
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double media() {
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isCurtida(boolean b) {
        return curtida;
    }

    public void setCurtida(boolean curtida) {
        this.curtida = curtida;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getSomaDeAvaliacoes() {
        return somaDeAvaliacoes;
    }

    public void setSomaDeAvaliacoes(double somaDeAvaliacoes) {
        this.somaDeAvaliacoes = somaDeAvaliacoes;
    }
}
