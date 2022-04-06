package POO_Exercicios_2.q4;

public class Casa {
    Porta[] portas = new Porta[100];
    String cor;

    void addPorta(Porta porta){
        for (int i = 0; i < portas.length; i++){
            if (portas[i] == null){
                portas[i] = porta;
                break;
            }        
        }
    }

    void quantasPortasEstaoAbertas(){
        int counter = 0;
        for (int i = 0; i < portas.length; i ++)
            if (portas[i] != null && portas[i].aberta){
                counter ++;
            }
        System.out.println("Tem " + counter + " porta(s) aberta(s)!\n");
    }
}
