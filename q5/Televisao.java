package POO_Exercicios_2.q5;

public class Televisao {
    boolean ligada;
    int volume;
    int canal;
    boolean silencioso;
    
    void ligar_desligar(){
        if (ligada){
            ligada = false;
        } else {
            ligada = true;
        }
    }

    // usando o metodo da sobrecarga para mudarCanal
    void mudarCanal(Integer ch){
        if (ch <= 99 && ch >= 0){
            canal = ch;
        } else {
            System.out.println("Este canal não existe!");
        }
    }
    void mudarCanal(boolean plus, boolean minus){
        int ch = canal;
        if (plus) {
            ch++;
        }
        if (minus) {
            ch--;
        }
        if (ch <= 99 && ch >= 0){
            canal = ch;
        } else {
            System.out.println("Este canal não existe!");
        }
    }

    void silenciar(){
        if (silencioso){
            silencioso = false;
        } else {
            silencioso = true;
        }
    }

    void mudarVolume(int vol){
        if (vol >= 0 && vol <= 10){
            volume = vol;
        } else {
            System.out.println("Este volume não é possível!");
        }
    }

    void imprimeEstado(){
        System.out.println("\nImprime estado \n");

        if (ligada){
            System.out.println("A televisão está ligada");
            if (silencioso){
                System.out.println("A televisão está silenciada");
            } else {
                System.out.println("A televisão não está silenciada");
            }
            System.out.println("A televisão está no canal " + canal + " e no volume " + volume);
        } else {
            System.out.println("A televisão está desligada");
        }
    } 
}
