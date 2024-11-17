import  java.util.Scanner;
public class Fees {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double deposit, fees, value_rend, value_total;
        String name;

        System.out.print("\nInforme por favor o seu nome: ");
        name = input.next();

        System.out.print("Digite o valor do deposito: ");
        deposit = input.nextDouble();

        System.out.print("Insire o valor da taxa de juro: ");
        fees = input.nextDouble();

        value_rend=(0);
        value_total=deposit*value_rend;

        System.out.println("\nResultados Obtidos:");
        System.out.println("Nome: "+name);
        System.out.println("Valor Rendido: "+value_rend+"0 Kz");
        System.out.println("Valor Total: "+value_total+"0 Kz\n\n");
    }
}