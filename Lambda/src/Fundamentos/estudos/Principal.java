package Fundamentos.estudos;

public class Principal {
    public static void main(String[] args) {
        Conta user_1 = new Conta();
        Conta user_2 = new Conta();
        Conta user_3 = new Conta();


        user_1.nome = "Aurélio";

        System.out.println("O nome é: "+ user_1.nome);
    }
}
