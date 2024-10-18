import java.util.Scanner;
public class Ordem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num1,num2,num3,help;

        System.out.print("\nDigite o primeiro número: ");
        num1=input.nextInt();
        System.out.print("Digite o segundo número: ");
        num2=input.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = input.nextInt();

        if (num1==num2 || num1==num3 || num2==num3){
            System.out.println("\n[Error]! Deves digitar números diferentes!");
        }else{
            if (num1>num2){
                help=num1;
                num1=num2;
                num2=help;
            } if (num1>num3){
                help=num1;
                num1=num3;
                num3=help;
            }if (num2>num3){
                help=num2;
                num2=num3;
                num3=help;
            }

            System.out.println("\nSeguindo a ordem crescente dos números, os números digitados são:");
            System.out.println(+num1+" - "+num2+" - "+num3);
        }
        input.close();
    }
}