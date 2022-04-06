package POO_Exercicios_2.q2;

public class Main {
    public static void main(String[] args){

        Pessoa fulano = new Pessoa();
        fulano.nome = "Fulano";
        fulano.idade = 18;

        imprimir(fulano);

        fulano.aniversario();

        imprimir(fulano);

        fulano.aniversario();

        imprimir(fulano);

    }

    static void imprimir(Pessoa pessoa){
        System.out.println(pessoa.nome + " tem " + pessoa.idade + " anos!\n");
    }
}
