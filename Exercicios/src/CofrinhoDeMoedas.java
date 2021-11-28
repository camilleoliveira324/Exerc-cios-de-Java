import java.util.Scanner;

public class CofrinhoDeMoedas {
    public static void main(String[] args) {
        //Declaração de variaveis
        Scanner in = new Scanner(System.in);
        int umcent, cinco, dez, vintecinco, cinquenta, umreal;
        int cent1, cent5, cent10, cent25, cent50, real1, total;

        //Entrada de dados
        System.out.println("Vou contar quanto de dinheiro você tem");
        System.out.println("Me diga quantas moedas de 1 centavo você tem");
        umcent = in.nextInt();
        System.out.println("Me diga quantas moedas de 5 centavos você tem");
        cinco = in.nextInt();
        System.out.println("Me diga quantas moedas de 10 centavos você tem");
        dez = in.nextInt();
        System.out.println("Me diga quantas moedas de 25 centavos você tem");
        vintecinco = in.nextInt();
        System.out.println("Me diga quantas moedas de 50 centavos você tem");
        cinquenta = in.nextInt();
        System.out.println("Por fim, me diga quantas moedas de 1 real você tem");
        umreal = in.nextInt();


        //Processamento de dados
        cent1 = (int) (umcent * 0.01);
        cent5 = (int) (cinco * 0.05);
        cent10 = (int) (dez * 0.1) ;
        cent25 = (int) (vintecinco * 0.25);
        cent50 = (int) (cinquenta * 0.5);
        real1 = umreal;
        total = cent1 + cent5 + cent10 + cent25 + cent50 + real1;

        //Saída de dados
        System.out.println("Você tem em seu cofrinho R$" + total);
    }
}
