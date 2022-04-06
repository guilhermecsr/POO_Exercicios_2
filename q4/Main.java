package POO_Exercicios_2.q4;

public class Main {
    public static void main(String[] args){
        Casa casa = new Casa();

        // pinta a casa
        casa.cor = "Amarela";
        
        // cria as portas
        Porta porta_1 = new Porta();
        Porta porta_2 = new Porta();
        Porta porta_3 = new Porta();
        
        // abre algumas portas
        porta_1.aberta = true;
        porta_2.aberta = true;

        // adiciona as portas à casa
        casa.addPorta(porta_1);
        casa.addPorta(porta_2);
        casa.addPorta(porta_3);

        imprimir(casa);
    }

    static void imprimir(Casa casa){
        System.out.println("A casa " + casa.cor);
        casa.quantasPortasEstaoAbertas();
    }
    
}
