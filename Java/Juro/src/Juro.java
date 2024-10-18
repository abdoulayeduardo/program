import  java.util.Scanner;
public class Juro {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double deposito, juro, value_rend, value_total;
        String name;

        System.out.print("Informe por favor o seu nome: ");
        name = input.next();

        System.out.print("Digite o valor do deposito: ");
        deposito = input.nextDouble();

        System.out.print("Insire o número da taxa de juro: ");
        juro = input.nextDouble();

        value_rend=(deposito+juro)-deposito;
        value_total=deposito+juro;

        System.out.println("\nResultados Obtidos:");
        System.out.println("Nome: "+name);
        System.out.println("Valor Rendido: "+value_rend+"0 Kz");
        System.out.println("Valor Total: "+value_total+"0 Kz\n\n");
    }
}