import java.util.Scanner;

public class Cavalos {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int h, vf, vcd, d;

        //Entrada de dados
        System.out.println("Vamos calcular quanto vão custar as ferraduras para seus cavalos!");
        System.out.println("Primeiro informe o número de cavalos");
        h = in.nextInt();

        //Processamento de dados
        vf = (int) ((h * 4) * 9.9);
        d = (int) (vf * 0.1);
        vcd = vf - d;
        //Saída de dados
        if (vf >= 100) {
            System.out.println(vf + " é seu valor final, mas como você comprou acima de 100 reais, nós te demos um desconto de 10% e você só paga R$" + vcd);
        } else {
            System.out.println("Sua compra deu um total de R$" +vf);
        }
    }
}
