package POO_Exercicios_2.q8;

public class Main {
    public static void main(String[] args){
        Celular celular = new Celular();

        celular.bateria.nivelCarga = 100;
        celular.verBateria();

        celular.mandarMensagem();
        celular.verBateria();

        celular.fazerLigacao(30);
        celular.verBateria();
    }
}
