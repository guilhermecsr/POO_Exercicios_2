package POO_Exercicios_2.q1;

public class Main {
    public static void main(String[] args){

        Agenda pessoa = new Agenda();

        pessoa.nome = "Fulano";
        pessoa.telefone.celular = "21 912 345 678";

        imprimir(pessoa);
    }

    static void imprimir(Agenda pessoa){
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Numero: " + pessoa.telefone.celular);
    }
}
