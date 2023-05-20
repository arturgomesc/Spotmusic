package SpotmusicFiles.calculos;

import SpotmusicFiles.Titulo;

public class estrelinhas {
    public static void inclui(Titulo titulo) {
        if (titulo.getClassificacao() >= 9) {
            System.out.println("Avaliações: ★★★★★\n");
        } else if (titulo.getClassificacao() < 9 && titulo.getClassificacao() >= 7) {
            System.out.println("Avaliações: ★★★★\n");
        } else {
            System.out.println("Avaliações: ★★★\n");
        }
    }
}
