import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number1,number2,number3,media;

        System.out.print("Por favor, informe o primeiro número: ");
        number1=input.nextInt();

        System.out.print("Por favor, informe o segundo número: ");
        number2=input.nextInt();

        System.out.print("Por favor, informe o terceiro número: ");
        number3=input.nextInt();

        media=(number1+number2+number3)/3;

        System.out.print("A média dos três números digitados é: "+media);
    }
}