import java.util.Scanner;
public class Conta {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);

        int cont=0,cont1=0,cont2=0,num;
        System.out.println("\n");
        for (int i = 1; i <=5 ; i++) {
            System.out.print("Digite o "+i+"º número: ");
            num=read.nextInt();
            if (num>5){
                cont++;
            }
            else if (num<5){
                cont1++;
            } else if (num==5) {
             cont2++;
            }
        }
        System.out.print("\nA quantidade de números maiores que cinco (5) é "+cont+"\n\n");
        System.out.print("\nA quantidade de números menores que cinco (5) é "+cont1+"\n\n");
        System.out.print("\nA quantidade de números iguais que cinco (5) é "+cont2+"\n\n");
    }
}