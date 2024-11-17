import java.util.Scanner;

public class ProvincyCopy {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Contadores e Controladores
        int contCar = 0, option;

        //Armazenadores
        int indMax = 0, indMin, number_car = 0;
        int aciNumber = 0, carNumber = 0;
        String pMax = "", pMin = "", idMin="",idMax="";

        //Vetores
        String[] provincy = {"Benguela", "Bengo", "Cabinda", "Luanda", "Muxico"},id=new String[provincy.length];
        int[] number_aci = new int[provincy.length];
        int n=provincy.length;
        for (int loop = 0; loop < provincy.length; loop++) {

            System.out.println("\n" + provincy[loop]);

            System.out.print("Informe o código da província: ");
            id[loop] = read.next();
            System.out.print("Informe o número de veículos de passeio: ");
            number_car = read.nextInt();
            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
            number_aci[loop] = read.nextInt();

            System.out.println("\n1) Verificar Dados");
            System.out.println("2) Guardar Dados");
            System.out.print("Escolha a sua opção: ");
            option = read.nextInt();

            while (option == 1) {
                System.out.println("Números de veículos de paseio: " + number_car);
                System.out.println("Número de acidentes de transito: " + number_aci[loop]);
                System.out.println("\n1 - Alterar Dados");
                System.out.println("2 - Guardar Dados");
                System.out.print("Escolha a sua opção: ");
                int dados = read.nextInt();

                if (dados == 1) {
                    System.out.print("Informe o número de veículos de passeio: ");
                    number_car = read.nextInt();
                    System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                    number_aci[loop] = read.nextInt();

                    System.out.println("\n1) Verificar Dados");
                    System.out.println("2) Guardar Dados");
                    System.out.print("Escolha a sua opção: ");
                    option = read.nextInt();
                }else {
                    option=2;
                }
            }
                //contadores e tudo...

                if (number_car < 2000) {
                    aciNumber += number_aci[loop];
                    contCar++;
                }

                carNumber += number_car;

                for (int i = 0; i < 25; i++) {
                    System.out.println("");
                }

        }
            //Maior e Menor indece de Tranzito
            indMin = number_aci[0];
            for (int i = 0; i < number_aci.length; i++) {
                if (indMax < number_aci[i]) {
                    indMax = number_aci[i];
                    pMax = provincy[i];
                    idMax=id[i];
                }
                if (indMin > number_aci[i]) {
                    indMin = number_aci[i];
                    pMin = provincy[i];
                    idMin=id[i];
                }
            }

            System.out.println("\n\nRESULTADO DA ESTATISTICA");
            System.out.println("\nA Média de veículos de passeio nas " +n+ " províncias juntas é: " + (carNumber/n));

            System.out.println("A Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é: " + (aciNumber/contCar));

            System.out.println(pMin + " ["+idMin+"] corresponde a " + indMin + " acidentes, é a provincia com o menor índece de acidente");
            System.out.println(pMax + " ["+idMax+"] corresponde a " + indMax + " acidentes, é a provincia com o maior índece de acidente");

    }
}