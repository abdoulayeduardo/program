import java.util.Scanner;
public class Acumulador {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int soma=0,num;

        System.out.println("\n");
        for (int cont=1; cont<=5; cont++){
            System.out.print("Digite o "+cont+"º número: ");
            num=input.nextInt();

            soma+=num;
        }
        System.out.println("\nSoma = "+soma);

        input.close();
    }
}