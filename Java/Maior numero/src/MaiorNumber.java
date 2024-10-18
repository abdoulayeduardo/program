import java.util.Scanner;
public class MaiorNumber {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);

        int num1,num2;

        System.out.print("\nInforme o primeiro número: ");
        num1=read.nextInt();
        System.out.print("Informe o segundo número: ");
        num2=read.nextInt();

        if (num1<num2){
            System.out.println("\nO primeiro número é menor do que o segundo");
            System.out.println(num1+" < "+num2+"\n");
        } else if (num1>num2) {
            System.out.println("\nO primeiro número é maior do que o segundo");
            System.out.println(num1+" > "+num2+"\n");
        }else {
            System.out.println("\nOs números são iguais");
            System.out.println(num1+" = "+num2+"\n");
        }
    }
}