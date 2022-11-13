import java.util.Scanner;

public class GerenciadorPagamentos {
    public static void main(String[] args) {
        System.out.println("Qual e o preço das compras R$?");
        Scanner l=new Scanner(System.in);
        float compra= l.nextFloat();
        System.out.println("FORMAS DE PAGAMENTO\n" +
                "[1] Á VISTA DINHERO/CHEQUE\n" +
                "[2] Á VISTA CARTÃO\n" +
                "[3] 2X NO CARTÃO\n" +
                "[4] 3X OU MAIS NO CARTÃO\n");
        Scanner n=new Scanner(System.in);
        float escolha= n.nextFloat();
        float a=compra-(compra*10/100);
        float ac=compra-(compra*5/100);
        float total=compra;
        float parcela=total/2;
        if(escolha==1){
            System.out.printf("Sua compra com desconto a vista ficara no valor de R$ %.2f",a);}
        if(escolha==2){
            System.out.printf("Sua compra a vista no cartão com desconto terá o valor de %.2f ",ac);}
        if(escolha==3){
            System.out.printf("Sua compra parcelada em 2X vezes terá o valor de %.2f",parcela);}
        if(escolha==4){
            total=compra-(compra*20/100);
            System.out.println("Em quantas parcelas deseja dividir?");
            Scanner i=new Scanner(System.in);
            float p= i.nextFloat();
            float pa=total/p;
            System.out.printf("Sua compra será parcelada em %.2fX vezes de R$%.2f\n",p,pa);}


        }


    }

