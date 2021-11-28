import java.util.Scanner;

public class Soma {
    public static <b> void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int soma, a, b;

        //Entrada de dados
        System.out.println("Vou calcular sua soma!");
        System.out.println("Informe o primeiro valor");
        a = in.nextInt();
        System.out.println("Agora informe o segundo valor");
        b = in.nextInt();

        //Processamento
        soma = a + b;

        //Saída
        if (a > b) {
            System.out.println(soma + " é o resultado da sua soma e A é o número maior");
        } else {
                System.out.println(soma + " é o resultado da sua soma e B é o número maior");
        }

    }
}
