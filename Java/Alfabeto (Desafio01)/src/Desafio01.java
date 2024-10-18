import java.util.Arrays;
import java.util.Scanner;
public class Desafio01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num;
        char[] numAlf = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        System.out.print("\nDigite um número no intervalo de 1 à 26: ");
        num = read.nextInt();

        if(num>=1 && num<=26){
        System.out.print("\n");
        for (int i = 0; i < num; i++) {
            System.out.print(numAlf[i] + "  ");
        }
        System.out.println("\n\n");
    }else{
        System.out.println("\n[Error] O número "+numAlf+" não corresponde a nehuma letra do alfabeto.\n");
    }
    }
}