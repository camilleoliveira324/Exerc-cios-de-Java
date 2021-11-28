import java.util.Scanner;

public class MesDoAno {
    public static void main(String[] args) {
        //Declaração de variaveis
        Scanner in = new Scanner(System.in);
        int n;

        //Entrada de dados
        System.out.println("Digite um número entre 1 e 12");
        n = in.nextInt();

        //Saída de dados
        if (n == 1) {
            System.out.println("Você escolheu o mês de Janeiro");
        } else if (n == 2) {
            System.out.println("Você escolheu o mês de Fevereiro");
        } else if (n == 3) {
            System.out.println("Você escolheu o mês de Março");
        } else if (n == 4) {
            System.out.println("Você escolheu o mês de Abril");
        } else if (n == 5) {
            System.out.println("Você escolheu o mês de Maio");
        } else if (n == 6) {
            System.out.println("Você escolheu o mês de Junho");
        } else if (n == 7) {
            System.out.println("Você escolheu o mês de Julho");
        } else if (n == 8) {
            System.out.println("Você escolheu o mês de Agosto");
        } else if (n == 9) {
            System.out.println("Você escolheu o mês de Setembro");
        } else if (n == 10) {
            System.out.println("Você escolheu o mês de Outubro");
        } else if (n == 11) {
            System.out.println("Você escolheu o mês de Novembro");
        } else if (n == 12) {
            System.out.println("Você escolheu o mês de Dezembro");
        }
    }
}
