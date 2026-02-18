package screenmatch.principal;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalLista {
    static void main() {
        Serie BreakingBad = new Serie("Breaking Bad", 2008);
        Filme meuFilme = new Filme("Interestellar", 2014);
        Filme outroFilme = new Filme("The Shawshank Redemption", 1994);
        Filme maisFilme = new Filme("Avatar", 2009);
        meuFilme.avalia(7);
        meuFilme.avalia(8);
        meuFilme.avalia(10);

        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(BreakingBad);
        lista.add(maisFilme);
        for (Titulo item: lista){
            System.out.println(item);
            if (item instanceof Filme filme){
                System.out.println("Classificascao " + filme.getClassificacao());
            }
        }
        Collections.sort(lista);
        System.out.println(lista);
    }
}
