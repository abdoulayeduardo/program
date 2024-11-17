import java.util.ArrayList;
import java.util.Scanner;

public class MediumLista {
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
            • Mostre as notas ordenadas em ordem crescente, usando listas.
            */

        double pesoEx, pesoFi;
        int numberA, contApr=0, contRep=0;
        String nameT;

        ArrayList <Double> medium=new ArrayList<>();
        ArrayList <Double> notaEx=new ArrayList<>();
        ArrayList <Double> notaFi=new ArrayList<>();
        ArrayList <String> name=new ArrayList <>();

        System.out.print("\nDigite o nome da Turma: ");
        nameT=input.next();
        System.out.print("Informe o número de alunos: ");
        numberA=input.nextInt();


        for(int i=0;i<numberA;i++){
            System.out.println("\n\nTurma "+nameT);
            System.out.println("Número "+(i+1)+"\n");

            System.out.print("Informe o nome do aluno: ");
            name.add(i)=input.next();

            System.out.print("Insira a nota do exame: ");
            notaEx.add(i)=input.nextDouble();
            System.out.print("Insira a nota da classificação final: ");
            notaFi.add(i)=input.nextDouble();

            while (notaEx.get(i) < 0.0 || notaEx.get(i) > 20.0 || notaFi.get(i) <0.0 || notaFi.get(i) >20.0) {
                System.err.println("\n\n[ERROR] Notas Inválidas");

                System.out.print("\nInsira a nota do exame: ");
                notaEx.add(i) = input.nextDouble();
                System.out.print("Insira a nota da classificação final: ");
                notaFi.add(i)=input.nextDouble();
            }

            pesoEx=notaEx.get(i)*percentEx;
            pesoFi=notaFi.get(i)*percentFi;

            medium.add(i)=pesoEx+pesoFi;

            if (medium.get(i)>=10){
                contApr++;
            }else if(medium.get(i)<10){
                contRep++;
            }

        }

        System.out.println("\nNota Do Exame:");
        for (double note: notaEx) {
            System.out.println(note);
        }

        System.out.println("\nNota Da Classificação Final:");
        for (double note: notaFi) {
            System.out.println(note);
        }

        System.out.println("");
        for (int i = 0; i <medium.size() ; i++) {
            if (medium.get(i)>=10){
                System.out.println(name.get(i)+"; Com uma média de "+medium.get(i)+" Valores; [Aprovado]");
            }else if(medium.get(i)<10){
                System.out.println(name.get(i)+"; Com uma média de "+medium.get(i)+" Valores; [Reprovado]");
            }
        }

        System.out.println("\nTotal de Aprovado na Turma "+nameT+" : "+contApr);
        System.out.println("Total de Reprovado na Turma "+nameT+" : "+contRep);

        input.close();
    }
}