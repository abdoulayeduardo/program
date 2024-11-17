import java.util.Random;

public class TwoArrys {
    public static void main(String[] args) {

        /*faça um programa que preencha dois vectores de dez elementos numéricos cada um e mostre o vector resultante da intercalação deles.*/

        Random preenche=new Random();

        int [] first=new int[10],second=new int[10];

        for (int i = 0; i <10 ; i++) {
            first[i]=preenche.nextInt(0,100);
            second[i]=preenche.nextInt(0,100);
        }

        System.out.print("\n\nValores do primeiro vetor: ");
        for (int number:first){
            System.out.print(number+" ");
        }
        System.out.print("\n\nValores do segundo vetor: ");
        for (int number :second){
            System.out.print(number +" ");
        }
        System.out.println("\n\n");
    }
}