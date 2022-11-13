import java.util.Scanner;

public class comparandoNumeros {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro valor:");
        Scanner v = new Scanner(System.in);
        float n1 = v.nextFloat();
        System.out.println("Digite o segundo valor:");
        Scanner m = new Scanner(System.in);
        float n2 = m.nextFloat();
        float menor = n1;
        float maior = n2;
        if (n2 < n1) ;
        {
            menor = n2;
        }
        if (n1 > n2) ;
        {
            maior = n1;
        }
        System.out.printf("O maior valor digitado foi %.2f\ne o menor valor digitado foi %.2f", menor, maior);

    }
    }

