import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        String name, email, rg, cpf;

        //Entrada de dados
        System.out.println("Por favor preencha seus dados para confirmar sua identidade");
        System.out.println("Primeiro digite seu nome");
        name = in.next();
        System.out.println("Digite seu email");
        email = in.next();
        System.out.println("Digite seu RG (somente números");
        rg = in.next();
        System.out.println("Por fim digite seu CPF (somente números");
        cpf = in.next();

        //Processamento de dados


        //Saída
        if (name == null ) {
            System.out.println("Seu nome foi preenchido incorretamente");
        } else if (email == null) {
            System.out.println("Seu e-mail foi preenchido incorretamente");
        } else if (rg == null) {
            System.out.println("Seu RG foi preenchido incorretamente");
        } else if (cpf == null) {
            System.out.println("Seu CPF foi preenchido incorretamente");
        }
    }
}
