package SpotmusicFiles.calculos;

public class Filtro {
    private String recomendacao;
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4.5) {
            System.out.println("Classificação = ★★★★★");
        } else if (classificavel.getClassificacao() < 4 && classificavel.getClassificacao() >= 3) {
            System.out.println("Classificação = ★★★★");
        } else if (classificavel.getClassificacao() < 3 && classificavel.getClassificacao() >= 2) {
            System.out.println("Classificação = ★★★");
        } else if (classificavel.getClassificacao() < 2 && classificavel.getClassificacao() >= 1) {
            System.out.println("Classificação = ★★");
        } else if (classificavel.getClassificacao() < 1) {
            System.out.println("Classficação = ★");
        }
    }
}
