package POO_Exercicios_2.q6;

public class Carta {
    String naipe;
    String valor;

    Carta criaCarta(String valor, String naipe){
        this.naipe = naipe;
        this.valor = valor;
        return this;
    }
}
