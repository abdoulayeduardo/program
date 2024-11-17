import java.util.Scanner;

public class Campeo {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);

        String name;
        int old,quantOld=0,quantJog=3,quantEq=2;
        int [] mediOld=new int[10];
        int [] year=new int[10];
        double pes,altura,mediAltura=0,mediPes=0;

        for (int equi = 1; equi <=quantEq ; equi++) {

            System.out.println("\n"+equi+"º TIME");

            for (int jog = 1; jog <=quantJog ; jog++) {

                System.out.println("\nInforme o nome do "+jog+"º jogador: ");
                name =read.next();

                System.out.print("Informe a idade do "+jog+"º jogador: ");
                old=read.nextInt();

                System.out.print("Informe a altura do "+jog+"º jogador: ");
                altura=read.nextDouble();

                System.out.print("Informe o peso [Kg] do "+jog+"º jogador: ");
                pes=read.nextDouble();

                if(old>=1 && old<=17){
                    quantOld++;
                }
                mediAltura+=altura;

                if (pes>80) {
                    mediPes+=pes;
                }

                year[jog]+=old;
                mediOld[equi]=year[equi]/quantJog;
            }

        }
        System.out.println("\n");
        System.out.println("Quantidade de jogadores com as idades inferiores a 18: "+quantOld);
        System.out.println("Média das alturas dos jogadores: "+mediAltura/(quantEq*quantJog));

        for (int i = 0; i <quantEq ; i++) {
            System.out.println("Média das idades do "+i+1+"º TIME: "+mediOld[i]);
        }

        System.out.println((mediPes/(quantEq*quantJog))*100+"% dos jogadores estão acima dos 80Kg");
        System.out.println("\n");

        read.close();
    }
}