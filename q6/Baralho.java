package POO_Exercicios_2.q6;
import java.util.*;

public class Baralho {
    Carta[] cartas = new Carta[52]; 
    String[] valores = new Valor().valores;
    String[] naipes = new Naipe().naipes;

    void criaBaralho(){
        int k = 0;

        for (int i = 0; i < 4; i++ ){
            for (int j = 0; j < 13; j++ ){
                Carta carta = new Carta();
                cartas[k] = carta.criaCarta(valores[j], naipes[i]);
                k++;
            }
        }
    }

    void embaralhar(Baralho baralho){
        List<Carta> list = Arrays.asList(baralho.cartas);
        Collections.shuffle(list);
    }
}
