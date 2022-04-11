package POO_Exercicios_2.q6;

public class Main {
    public static void main(String[] args){
        Baralho baralho = new Baralho(); 
        
        baralho.criaBaralho();
        System.out.println("\nBaralho\n");
        mostraBaralho(baralho);

        baralho.embaralhar(baralho);
        System.out.println("\nBaralho embaralhado\n");
        mostraBaralho(baralho);
    }

    static void mostraBaralho(Baralho baralho){
        for (int l = 0; l < 52; l++ ){
            System.out.println(baralho.cartas[l].valor + " de " + baralho.cartas[l].naipe);
        }
    }
}
