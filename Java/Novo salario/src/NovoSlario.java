import java.util.Scanner;
public class NovoSlario {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double percent, sal, new_sal, value_aument;
        String name;

        System.out.print("Informe por favor o seu nome: ");
        name = input.next();

        System.out.print("Informe por favor o seu salário: ");
        sal = input.nextDouble();

        System.out.print("Agora, informe por favor o percentual de aumento (%): ");
        percent = input.nextDouble();

        value_aument=(percent/100)*sal;
        new_sal=(value_aument+sal);

        System.out.println("\n\nResultados Obtidos:");
        System.out.println("Nome: "+name);
        System.out.println("Valor de Aumento: "+value_aument+"0 Kz");
        System.out.println("Novo Salário: "+new_sal+"0 Kz\n\n");
    }
}