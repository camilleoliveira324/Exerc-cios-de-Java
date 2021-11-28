import java.util.Scanner;

public class LojaDeUmReal {
    public static void main(String[] args) {
        //Declaração de variaveis
        Scanner in = new Scanner(System.in);
        int itens, vfinal, vdesconto, vtotal;
        int fp, vdesconto10, vfinal10;

        //Entrada de dados
        System.out.println("Vou calcular o seu desconto");
        System.out.println("Para isso me diga quantos produtos você comprou:");
        itens = in.nextInt();
        System.out.println("Se o valor for ser pago a vista digite 1, se for no cartão digite 2");
        fp = in.nextInt();

        //Processamento de dados
        vtotal = (int) (itens * 1.99);
        vdesconto = (int) (vtotal * 0.05);
        vfinal = vtotal - vdesconto;
        vdesconto10 = (int) (vtotal * 0.1);
        vfinal10 = vtotal - vdesconto10;

        //Saída de dados
        if (fp == 1) {
            System.out.println("Pagamento à vista tem desconto de 10%, por isso você vai pagar R$" + vfinal10);
        } else {
            System.out.println("Com o desconto de 5%, você vai pagar R$" + vfinal);
        }
    }
}
