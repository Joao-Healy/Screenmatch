package screenmatch.modelos;

public class Serie  extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int minutosPorEpisodio;
    private int episodiosPorTemporda;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getEpisodiosPorTemporda() {
        return episodiosPorTemporda;
    }

    public void setEpisodiosPorTemporda(int episodiosPorTemporda) {
        this.episodiosPorTemporda = episodiosPorTemporda;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return episodiosPorTemporda * minutosPorEpisodio * temporadas;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + getAnoDeLancamento() + ")";
    }
}

