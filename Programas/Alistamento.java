import java.util.Scanner;
import  java.util.Date;
public class Alistamento {
    public static void main(String[] args) {
        System.out.println("Em que ano você nasceu?");
        Scanner n=new Scanner(System.in);
        int idade= n.nextInt();
        int c=2022-idade;
        System.out.printf("Quem nasceu em %d tem %d anos em 2022\n",idade,c);
        int f=c-18;
        int d=18-c;
        if(c>18){
            System.out.printf("Você ja deveria ter se alistado a %d ano\n",f);}
        if(c==18){
            System.out.println("Você deve se alistar imediatamente\n");}
        if(c<18){
        System.out.printf("Ainda faltam %d anos para se alistar\n",d);}
    }
}

