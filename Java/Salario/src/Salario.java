import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double sal, new_sal;
        String name;

        System.out.print("\nInforme por favor o seu nome: ");
        name = input.next();

        System.out.print("Informe por favor o seu salário: ");
        sal = input.nextDouble();

        new_sal=(0.25*sal)+sal;

        System.out.println("\nResultados Obtidos:");
        System.out.println("Nome: "+name);
        System.out.println("Novo Salário: "+new_sal+"0 Kz\n\n");
    }
}