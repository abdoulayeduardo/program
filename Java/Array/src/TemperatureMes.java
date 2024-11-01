import java.util.Scanner;

public class TemperatureMes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String []mes={"Janeiro","Fevereiro","Março","Abril",
                "Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        double[]tempe=new double[mes.length];
        double temperature=0;

        System.out.println("");
        for (int i = 0; i <tempe.length ; i++) {
            System.out.println("\n\n"+mes[i]);
            System.out.print("Insira a temperatura em graus celsos do mês correspondente: ");
            tempe[i]= input.nextDouble();

            while (tempe[i]<14 || tempe[i]>42){
                System.out.println("Dado inválido");
                System.out.print("Insira a temperatura em graus celsos do mês correspondente: ");
                tempe[i]= input.nextDouble();
            }
            temperature+=tempe[i];
        }
        for (int i=0; i<tempe.length; i++){
            System.out.println(mes[i]+": "+tempe[i]+"0");
        }
        System.out.println("A média das temperaturas é: "+temperature/mes.length+"0");
    }
}