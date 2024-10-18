import java.util.Scanner;
public class MaiorIdade {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);

        String name;
        int old;

        System.out.print("\nInforme por favor o seu nome: ");
        name= read.next();

        System.out.print("Agora digite a sua idade: ");
        old= read.nextInt();

        if(old<0 || old>120) {
            System.out.print("\nErro, verifique o dado inserido!");
        }else {
            if (old < 18) {
                System.out.print("\nOlá senhor(a)" + name + ", informar que és menor de idade\n\n");
            } else {
                System.out.print("\nOlá senhor(a)" + name + ", informar que és maior de idade\n\n");
            }
        }
        read.close();
    }
}