import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);

        double note1,note2,note3,md;

        System.out.print("Por favor digite a primeira nota do aluno: ");
        note1=read.nextDouble();

        System.out.print("Por favor digite a segunda nota do aluno: ");
        note2=read.nextDouble();

        System.out.print("Por favor digite a terceira nota do aluno: ");
        note3=read.nextDouble();

        md=(note1+note2+note3)/3;

        if (note1<0 || note1>10 || note2<0 || note2>10 || note3<0 || note3>10) {
            System.out.println("[Erro] nota inválida!");
        }
        else {
            if (md<=3) {
                System.out.println("Reprovado!");
            }
            else if(md>3 && md<=7) {
                System.out.println("Exame!");

                if (md>6){
                    double result=12-md;

                    System.out.println("A nota necessária para apovares é: "+result);
                }
            }
            else if (md>7 && md<=10) {
                System.out.println("Aprovado!");
            }
        }
        read.close();
    }
}