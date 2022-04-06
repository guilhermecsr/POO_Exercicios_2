package POO_Exercicios_2.q8;

public class Celular {
    Bateria bateria = new Bateria();
    Ligacao ligacao = new Ligacao();
    Mensagem mensagem = new Mensagem();

    
    void fazerLigacao(int duracao){
        ligacao.duracao = duracao;
        bateria.nivelCarga -= ligacao.calculaPulso();
    }

    void mandarMensagem(){
        bateria.nivelCarga -= mensagem.custoBateria;
    }

    void verBateria(){
        System.out.println("O nivel atual de bateria é: " + bateria.bateriaAtual());
    }
}
