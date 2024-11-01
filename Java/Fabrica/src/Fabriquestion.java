import java.util.Scanner;

public class Fabriquestion {
    public static final double salaryMin=5;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /*
        2- Em uma fábrica trabalham homens e mulheres divididos em três classes:
        ■ trabalhadores que fazem até 30 peças por mês — classe 1;
        ■ trabalhadores que fazem de 31 a 50 peças por mês — classe 2;
        ■ trabalhadores que fazem mais de 50 peças por mês — classe 3.

        A classe 1 recebe salário mínimo. A classe 2 recebe salário mínimo mais
        3% deste salário por peça, acima das 30 peças iniciais. A classe 3 recebe
        salário mínimo mais 5% desse salário por peça, acima das 30 peças iniciais.
        */
        /*
        Faça um programa que receba o número do operário, o número de peças fabricadas no mês, o sexo do operário, e que também calcule e mostre:

        ■ o número do operário e seu salário;
        ■ o total da folha de pagamento da fábrica;
        ■ o número total de peças fabricadas no mês;
        ■ a média de peças fabricadas pelos homens;
        ■ a média de peças fabricadas pelas mulheres; e
        ■ o número do operário ou operária de maior salário.
        A fábrica possui 15 operários.
        */

        int quantOp=3;
        int [] idOpe=new int[quantOp],pecasFab=new int[quantOp];
        double [] salary=new double[quantOp];
        double salaryTotal=0.0,mediaH=0,mediaM=0;
        int pecasTotal=0,numOpeMAxSalary=0;
        String [] sexo=new String[quantOp];

        System.out.println();
        for (int i = 1; i <=quantOp ; i++) {
            System.out.print("Insira o número do operário: ");
            idOpe[i]=input.nextInt();
            System.out.print("Informe o número de peças fabricadas: ");
            pecasFab[i]=input.nextInt();
            System.out.print("Agora informe o seu sexo: ");
            sexo[i]=input.next();

            if (pecasFab[i]==30){
                //Classe 1
                //número de peças x (salario minimo)
            }else if (pecasFab[i]>=31 && pecasFab[i]<=50) {
                //Classe 2
                //número de peças x (salario minimo+3%)
            } else if (pecasFab[i]>50) {
                //Classe 3
                //número de peças x (salario minimo+5%)
            }
             salaryTotal+=salary[i];
        }

        for (int i = 1; i <=quantOp ; i++) {
            System.out.println("Operário Nº "+i+", Salario: "+salary[i]);
        }
        System.out.println("Total da folha de pagamento da fábrica: "+salaryTotal);
        System.out.println("Número total de peças fabricadas no mês: "+pecasTotal);
        System.out.println("Média de peças fabricadas pelos homens: "+mediaH);
        System.out.println("Média de peças fabricadas pelas mulheres: "+mediaM);
        System.out.println("Número do operário ou operária de maior salário: "+numOpeMAxSalary);

        input.close();
    }
}