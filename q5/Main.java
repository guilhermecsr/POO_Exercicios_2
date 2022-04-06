package POO_Exercicios_2.q5;

public class Main {
    public static void main(String[] args){
    Televisao tv = new Televisao();

    imprimir(tv);

    tv.ligar_desligar();

    imprimir(tv);

    tv.mudarCanal(50);

    imprimir(tv);

    tv.mudarCanal(true, false);

    imprimir(tv);

    tv.mudarCanal(false, true);

    imprimir(tv);

    tv.mudarVolume(5);

    imprimir(tv);

    }

    static void imprimir(Televisao tv){
        tv.imprimeEstado();
    }
    
}
