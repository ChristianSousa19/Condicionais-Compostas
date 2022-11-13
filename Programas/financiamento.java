import java.util.Scanner;

public class financiamento {
    public static void main(String[] args) {
        System.out.println("Qual o valor da casa?");
        Scanner c=new Scanner(System.in);
        float casa= c.nextFloat();
        System.out.println("Qual é o seu salario? ");
        Scanner s=new Scanner(System.in);
        float sal= c.nextFloat();
        System.out.println("em quantos anos deseja comprar a casa?");
        Scanner t=new Scanner(System.in);
        int tem= c.nextInt();
        float p= casa/(tem*12);
        float min=sal*30/100;
        System.out.printf("Para pagar uma casa de R$%.2f em %d anos\n",casa,tem);
        System.out.printf("Será neccessária uma prestação de %.2f\n",p);
        if (sal<=min){
            System.out.println("Emprestimo negado");}
        else {
            System.out.println("Emprestimo aprovado");}

        }
    }

