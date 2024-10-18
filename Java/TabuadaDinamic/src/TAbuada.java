import java.util.Scanner;
public class TAbuada {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);

        int num,cont;

        System.out.print("\nDigite um número para a tabuada: ");
        num=leia.nextInt();
        System.out.print("Digite um número para o fim da tabuada: ");
        cont=leia.nextInt();
        System.out.println("\n");
        for (int i = 1; i <=cont ; i++) {
            int mul=i*num;
            System.out.println(num+" x "+i+" = "+mul);
        }
    }
}