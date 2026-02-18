import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroDeAvaliacoes;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

import java.util.ArrayList;

    public static void main(String[] args) {
        Filme meuFilme = new Filme("Interestellar", 2014);
        meuFilme.setDuracaoEmMinutos(169);

        Filme outroFilme = new Filme("The Shawshank Redemption", 1994);
        outroFilme.setDuracaoEmMinutos(142);

        Filme maisFilme = new Filme("Avatar", 2009);
        maisFilme.setDuracaoEmMinutos(162);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(7);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Nota Media: " + meuFilme.pegaMedia());


        Serie breakingBad = new Serie("Breaking Bad", 2008);
        breakingBad.setTemporadas(5);
        breakingBad.setMinutosPorEpisodio(50);
        breakingBad.setEpisodiosPorTemporda(12);

        Episodio episodio = new Episodio();
        episodio.setNumero(57);
        episodio.setNome("Ozymandious");
        episodio.setSerie(breakingBad);
        episodio.setAvaliacoes(9);

        breakingBad.exibeFichaTecnica();
        System.out.println("Tempo para assitir Breaking Bad " + breakingBad.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(breakingBad);
        System.out.println(calculadora.getTempoTotal());
        FiltroDeAvaliacoes filtro = new FiltroDeAvaliacoes();
        filtro.filtra(meuFilme);
        filtro.filtra(episodio);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(meuFilme);
        filmes.add(outroFilme);
        filmes.add(maisFilme);
        System.out.println(filmes);

        Collections.sort(filmes);
        System.out.println(filmes);

    }

