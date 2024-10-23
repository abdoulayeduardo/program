import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int rad,opcao,soma,num1,num2,opc=0;
        double raiz;

        do {
            System.out.println("\nMenu de opções: ");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Raiz quadrada");
            System.out.println("0 - Fechar App");
            System.out.print("\nEscolha a sua opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("\nSomar Dois Números");
                System.out.print("\nDigite o primeiro número: ");
                num1 = input.nextInt();

                System.out.print("Digite o segundo número: ");
                num2 = input.nextInt();

                soma = num1 + num2;

                System.out.println("\nA soma dos números é igual a " + soma);
                System.out.println(num1 + " + " + num2 + " = " + soma);

                System.out.println("\n1 - Menu");
                System.out.println("0 - S A I R");
                System.out.print("\nEscolha a sua opção: ");
                opc = input.nextInt();

            } else if (opcao == 2) {
                System.out.println("\nRaiz Quadrada de Um Número");
                System.out.print("\nDigite o radical da raiz: ");
                rad = input.nextInt();

                raiz = Math.sqrt(rad);

                System.out.println("\nA raiz quadrada de " + rad + " é igual a " + raiz);
                System.out.println("√" + rad + " = " + raiz);

                System.out.println("\n1 - Menu");
                System.out.println("0 - S A I R");
                System.out.print("\nEscolha a sua opção: ");
                opc = input.nextInt();
            } else if (opcao == 0) {
                System.out.print("\nApp fechada!");
                break;
            } else {
                System.out.println("\n[Error!] Opção inv+alida");

                System.out.println("\n1 - Menu");
                System.out.println("0 - S A I R");
                System.out.print("\nEscolha a sua opção: ");
                opc = input.nextInt();
            }
            for (int i = 0; i <11 ; i++) {
                System.out.println();
            }
        }while (opc==1);
        input.close();
    }
}