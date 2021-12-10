import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        //Declaração de Variaveis
        Scanner in = new Scanner(System.in);
        int day;

        //Entrada de dados
        System.out.println("Digite um número entre 1 e 7");
        day = in.nextInt();

        //Saída de dados
        if (day == 1) {
            System.out.println("Você escolheu o Domingo");
        } else if (day == 2) {
            System.out.println("Você escolheu a Segunda");
        } else if (day == 3) {
            System.out.println("Você escolheu a Terça");
        } else if (day == 4) {
            System.out.println("Você escolheu a Quarta");
        } else if (day == 5) {
            System.out.println("Você escolheu a Quinta");
        } else if (day == 6) {
            System.out.println("Você escolheu a Sexta, bom fim de semana");
        } else if (day == 7) {
            System.out.println("Você escolheu o Sábado");
        }

        switch (day) {
            case 1: System.out.println("Você escolheu o Domingo"); break;
            case 2: System.out.println("Você escolheu a Segunda"); break;
            case 3: System.out.println("Você escolheu a Terça"); break;
            case 4: System.out.println("Você escolheu a Quarta"); break;
            case 5: System.out.println("Você escolheu a Quinta"); break;
            case 6: System.out.println("Você escolheu a Sexta, bom fim de semana"); break;
            case 7: System.out.println("Você escolheu o Sábado"); break;
            default: System.out.println("Você não digitou um número válido");
        }
    }
}
