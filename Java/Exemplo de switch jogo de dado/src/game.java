import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number;

        System.out.println("Após digitar o dado, quanto saiu?");
        //System.out.print("Insira um número: ");
        number=input.nextInt();

        switch(number){
            case 1:
                System.out.print("\nSaiu pilo\n");
                break;

            case 2:
                System.out.print("\nSaiu duk\n");
                break;

            case 3:
                System.out.print("\nSaiu terno\n");
                break;

            case 4:
                System.out.print("\nSaiu quadra\n");
                break;

            case 5:
                System.out.print("\nSaiu quina\n");
                break;

            case 6:
                System.out.print("\nSaiu cena\n");
                break;

            default:
                System.out.print("\nErro! o numero não faz parte do jogo\n");
                break;
        }
        input.close();
    }
}