import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args) {
        //Declaração de variaveis
        Scanner in = new Scanner(System.in);
        int ml350, ml600, litro2, total;
        int L350, L600, L2;

        //Entrada de dados
        System.out.println("Vou calcular quantos litros de refrigerante você está comprando");
        System.out.println("Primeiro, me diga quantos garrafas de 350ml você pegou");
        ml350 = in.nextInt();
        System.out.println("Me diga quantos garrafas de 600ml você pegou");
        ml600 = in.nextInt();
        System.out.println("Por fim, me diga quantos garrafas de 2 litros você pegou");
        litro2 = in.nextInt();

        //Processamento de dados
        L350 = (int) (ml350 * 0.35);
        L600 = (int) (ml600 * 0.6);
        L2 = litro2 * 2;
        total = L350 + L600 + L2;

        //Saída de dados
        System.out.println("Você está levando, em litros " + total);
    }
}
