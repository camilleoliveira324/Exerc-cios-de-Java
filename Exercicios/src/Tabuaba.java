import java.util.Scanner;

public class Tabuaba {
    public static void main(String[] args) {
        //Declaração de variaveis
        Scanner in = new Scanner(System.in);
        int n, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;

        //Entrada de dados
        System.out.println("Digite um número de 1 a 10");
        n = in.nextInt();

        //Processamento de dados
        t1 = n * 1;
        t2 = n * 2;
        t3 = n * 3;
        t4 = n * 4;
        t5 = n * 5;
        t6 = n * 6;
        t7 = n * 7;
        t8 = n * 8;
        t9 = n * 9;
        t10 = n * 10;

        //Saída de dados
        System.out.println(n + " vezes 1 é igual a " + t1 );
        System.out.println(n + " vezes 2 é igual a " + t2 );
        System.out.println(n + " vezes 3 é igual a " + t3 );
        System.out.println(n + " vezes 4 é igual a " + t4 );
        System.out.println(n + " vezes 5 é igual a " + t5 );
        System.out.println(n + " vezes 6 é igual a " + t6 );
        System.out.println(n + " vezes 7 é igual a " + t7 );
        System.out.println(n + " vezes 8 é igual a " + t8 );
        System.out.println(n + " vezes 9 é igual a " + t9 );
        System.out.println(n + " vezes 10 é igual a " + t10 );
    }
}
