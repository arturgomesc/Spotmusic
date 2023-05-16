package SpotmusicFiles.calculos;

import SpotmusicFiles.Titulo;
import SpotmusicFiles.Musica;
import SpotmusicFiles.Podcast;
public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}