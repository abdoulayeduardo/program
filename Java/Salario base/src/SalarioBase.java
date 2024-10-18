import java.util.Scanner;
public class SalarioBase {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double sal_bas, sal_recev;
        String name;

        System.out.print("Informe por favor o seu nome: ");
        name = input.next();

        System.out.print("Digite o valor do deposito: ");
        sal_bas = input.nextDouble();

        sal_recev=sal_bas-(sal_bas*0.02);

        System.out.print("\nOlá senhor(a) "+name+", informar que o salário a receber é de "+sal_recev+"0 Kz\n\n");
    }
}