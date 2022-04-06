package POO_Exercicios_2.q3;

public class Main {
    public static void main(String[] args){
        Porta porta = new Porta();

        porta.cor = "Mogno";
        porta.aberta = true;
        porta.largura = (float) 60.0;

        imprimir(porta);

        porta.cor = "Cerejeira";
        porta.aberta = false;
        porta.largura = (float) 70.0;

        imprimir(porta);

        porta.cor = "Branca";
        porta.aberta = true;
        porta.largura = (float) 80.0;

        imprimir(porta);
    }

    static void imprimir(Porta porta){
        System.out.println("A porta de cor: " + porta.cor + " e de " + porta.largura + "cm");
        porta.estaAberta();
    }
}
