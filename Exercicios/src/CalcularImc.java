import java.util.Scanner;

public class CalcularImc {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        double imc, p;
        double a, s, m, f;

        //Entrada de dados
        System.out.println("Vou calcular seu IMC");
        System.out.println("Para isso primeiro preciso saber sua altura");
        a = in.nextDouble();
        System.out.println("Por fim, me informe seu peso atual");
        p = in.nextDouble();
        System.out.println("Digite 1 se você for do sexo feminino e 2 se for do sexo masculino");
        s = in.nextDouble();

        //Processamento de dados
        imc = p / (a * a);
        m = (72.7 * a) - 58;
        f = (62.1 * a) - 44.7;

        //Saída
        if (s == 1) {
            System.out.println("Seu peso ideial é de " + f);
        } else {
            System.out.println("Seu peso ideial é de " + m);
        }
        if (imc < 18.5) {
            System.out.println("Você está abaixo do seu peso ideal");
        } else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Você está dentro do peso ideal");
        } else if (imc >= 25 && imc <= 29.9){
            System.out.println("Você está com peso em excesso");
        } else if (imc >= 30 && imc <= 34.9){
            System.out.println("Você está com obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9){
            System.out.println("Você está com obesidade gra II");
        } else {
            System.out.println("Você está com obesidae grau III");
        }
        System.out.println("Seu IMC é de " + imc);
    }
}

