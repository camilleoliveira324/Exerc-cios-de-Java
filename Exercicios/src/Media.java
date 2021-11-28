import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int media, a, b, c;

        //Entrada de dados
        System.out.println("Vou calcular a média pra você");
        System.out.println("Informe o primeiro valor");
        a = in.nextInt();
        System.out.println("Agora informe o segundo valor");
        b = in.nextInt();
        System.out.println("Por fim informe o terceiro valor");
        c = in.nextInt();

        //Processamento de dados
        media = (a + b + c) / 3;

        //Saída de dados
        if (a + b > c) {
            System.out.println(media + " é sua média e A + B é maior que C");
        } else {
            System.out.println(media + " é sua média e A + B não é maior que C");
        }


    }

}
