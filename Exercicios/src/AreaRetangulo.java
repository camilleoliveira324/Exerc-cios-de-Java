import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int b, h, area;

        //Entrada
        System.out.println("Vamos calcular a área do retângulo");
        System.out.println("Primeiro, informe qual é a medida da base do triângulo");
        b = in.nextInt();
        System.out.println("Agora informe a altura do triângulo");
        h = in.nextInt();


        //Processamento
        area = (b * h) / 2 ;
        //Saída
        if(b == h) {
            System.out.println("Seu quadrilárero é um quadrado, com área de " + area);
        } else {
            System.out.println("Seu quadrilárero é um retângulo, com área de" + area);
        }
    }
}

