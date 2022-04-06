package POO_Exercicios_2.q8;

public class Bateria {
    int capacidade = 100;
    int nivelCarga;

    void consomeBateria(float consumo){
        nivelCarga -= consumo;
    }

    int bateriaAtual(){
        return nivelCarga;
    }
}
