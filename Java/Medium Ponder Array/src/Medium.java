import java.util.Arrays;
import java.util.Scanner;

public class Medium {
    public static final double percentEx=0.6,percentFi=0.4;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /*
            Faça um programa em java que armazene as notas de uma turma e calcule a média ponderada, além de identificar quantos alunos passaram ou não.

            Requisitos:
            • O programa deve solicitar ao usuário o número de alunos na turma.
            • Para cada aluno, o programa deve pedir: a nota do exame (peso 60%) e a nota da classificação final(peso 40%)
            • O programa deve contar quantos alunos foram aprovados ou reprovados com base a média ponderada.
            • Exiba a média ponderada e o status(aprovado ou reprovado) para cada aluno, além do total aprovados e reprovados na turma.

            • Mostre as notas ordenadas em ordem crescente.
            */

        double pesoEx, pesoFi;
        int numberA, contApr=0, contRep=0;
        String nameT;

        System.out.print("\nDigite o nome da Turma: ");
        nameT=input.next();
        System.out.print("Informe o número de alunos: ");
        numberA=input.nextInt();

        double [] medium=new double[numberA];
        double [] notaEx=new double[numberA];
        double [] notaFi=new double[numberA];
        String [] name=new String[numberA];

        for(int i=0;i<numberA;i++){
            System.out.println("\n\nTurma "+nameT);
            System.out.println("Número "+(i+1)+"\n");

            System.out.print("Informe o nome do aluno: ");
            name[i]=input.next();

            System.out.print("Insira a nota do exame: ");
            notaEx[i]=input.nextDouble();
            System.out.print("Insira a nota da classificação final: ");
            notaFi[i]=input.nextDouble();

                while (notaEx[i] < 0.0 || notaEx[i] > 20.0 || notaFi[i] <0.0 || notaFi[i] >20.0) {
                    System.err.println("\n\n[ERROR] Notas Inválidas");

                    System.out.print("\nInsira a nota do exame: ");
                    notaEx[i] = input.nextDouble();
                    System.out.print("Insira a nota da classificação final: ");
                    notaFi[i]=input.nextDouble();
                }

            pesoEx=notaEx[i]*percentEx;
            pesoFi=notaFi[i]*percentFi;

            medium[i]=pesoEx+pesoFi;

            if (medium[i]>=10){
                contApr++;
            }else if(medium[i]<10){
                contRep++;
            }

        }

        System.out.println("\nNota Do Exame:");
        Arrays.sort(notaEx);
        System.out.println(Arrays.toString(notaEx));

        System.out.println("\nNota Da Classificação Final:");
        Arrays.sort(notaFi);
        System.out.println(Arrays.toString(notaFi));


        System.out.println("");
        for (int i = 0; i <numberA ; i++) {
            if (medium[i]>=10){
                System.out.println(name[i]+"; Com uma média de "+medium[i]+" Valores; [Aprovado]");
            }else if(medium[i]<10){
                System.out.println(name[i]+"; Com uma média de "+medium[i]+" Valores; [Reprovado]");
            }
        }

        System.out.println("\nTotal de Aprovado na Turma "+nameT+" : "+contApr);
        System.out.println("Total de Reprovado na Turma "+nameT+" : "+contRep);

        input.close();
    }
}