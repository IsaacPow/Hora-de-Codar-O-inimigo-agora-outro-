import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        String nome = "nome";
        int idade = 0;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Qual é o seu nome?");
        nome = entrada.nextLine();
        //NullPullException
        System.out.println("Seu nome é " + nome);
        System.out.println("Qual é a sua idade?");
        idade = entrada.nextInt();
        System.out.println("Sua idade é " + idade);
    }
}