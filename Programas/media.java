import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        System.out.println("Digite sua primeira nota:");
        Scanner m=new Scanner(System.in);
        float n1= m.nextFloat();
        System.out.println("Digite sua segunda nota:");
        Scanner l=new Scanner(System.in);
        float n2= l.nextFloat();
        float media=(n1+n2)/2;
        if(media>=6){
            System.out.printf("Aluno aprovado com media %.2f",media);}
        else{
            System.out.printf("Aluno com media %.2f reprovado",media);}


    }
}
