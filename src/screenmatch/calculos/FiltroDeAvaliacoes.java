package screenmatch.calculos;

public class FiltroDeAvaliacoes {
    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Peak Cinema");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito Bom");
        } else System.out.println("Epa");
        }
    }
