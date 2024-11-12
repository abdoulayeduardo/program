import java.util.Scanner;
public class Provincy {
    public static void main(String[] args) {
        Scanner read = new  Scanner(System.in);

        /*Foi feita uma estatística em cinco províncias de Angola para colectar dados sobre acidentes de trânsito.

        Foram obtidos os seguintes dados:
        a) código da província;
        b) número de veículos de passeio;
        c) número de acidentes de trânsito com vítimas.

        Deseja-se saber:
        a) qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;
        b) qual é a média de veículos nas cinco províncias juntas;
        c) qual é a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.*/

        //Contadores e Controladores
        int loop=0, contCar=0, option, id;

        //
        int indMax=0, indMin, number_car=0;
        int aciNumber=0, carNumber=0;
        String pMax="",pMin="";

        //Vetores
        String [] provincy={"Benguela", "Bengo", "Cabinda", "Luanda", "Muxico"};
        int [] number_aci=new int[provincy.length];


        do {
            System.out.println("\nPROVINCIAS DE ANGOLA");
            System.out.println("ID | Nome da provincia");   
            System.out.println("1  | Benguela");
            System.out.println("2  | Bengo");
            System.out.println("3  | Cabinda");
            System.out.println("4  | Luanda");
            System.out.println("5  | Muxico");
            System.out.print("\nInsira o código da província: ");
            id = read.nextInt();

            /*Falatra revisão
            for (n=0; n<id.length;n++){
                if (idProvincy == id[n]) {
                    teste=1;
                }else {
                    teste=2;
                }
            }

                while (teste==1) {
                System.err.println("\n\n[ERROR] ID JÁ EXISTENTE");
                System.out.println("ID | Nome da provincia");
                System.out.println("1  | Benguela");
                System.out.println("2  | Bengo");
                System.out.println("3  | Cabinda");
                System.out.println("4  | Luanda");
                System.out.println("5  | Muxico");
                System.out.print("\nInsira o código da província: ");
                idProvincy = read.nextInt();
                id[n] = idProvincy;
            }
            revisão*/

            switch(id){
                case 1:
                    System.out.println("\nBenguela");

                    System.out.print("Informe o número de veículos de passeio: ");
                    number_car=read.nextInt();
                    System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                    number_aci[loop] =read.nextInt();

                    System.out.println("\n2) Verificar Dados");
                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    while(option ==2){
                        System.out.println("Números de veículos de paseio: "+number_car);
                        System.out.println("Número de acidentes de transito: "+number_aci[loop]);
                        System.out.println("\n1 - Alterar dados");
                        System.out.println("2 - Guardar dados");
                        System.out.print("Escolha a sua opção: ");
                        int dados=read.nextInt();
                        if (dados==1){
                            System.out.print("Informe o número de veículos de passeio: ");
                            number_car=read.nextInt();
                            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                            number_aci[loop] =read.nextInt();

                            System.out.println("\n2) Verificar Dados");
                            System.out.println("1) M E N U");
                            System.out.println("0) S A I R");
                            System.out.print("Escolha a sua opção: ");
                            option =read.nextInt();
                        }else{
                            option =1;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nBengo");

                    System.out.print("Informe o número de veículos de passeio: ");
                    number_car=read.nextInt();
                    System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                    number_aci[loop] =read.nextInt();

                    System.out.println("\n2) Verificar Dados");
                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    while(option ==2){
                        System.out.println("Números de veículos de paseio: "+number_car);
                        System.out.println("Número de acidentes de transito: "+number_aci[loop]);
                        System.out.println("\n1 - Alterar dados");
                        System.out.println("2 - Guardar dados");
                        System.out.print("Escolha a sua opção: ");
                        int dados=read.nextInt();
                        if (dados==1){
                            System.out.print("Informe o número de veículos de passeio: ");
                            number_car=read.nextInt();
                            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                            number_aci[loop] =read.nextInt();

                            System.out.println("\n2) Verificar Dados");
                            System.out.println("1) M E N U");
                            System.out.println("0) S A I R");
                            System.out.print("Escolha a sua opção: ");
                            option =read.nextInt();
                        }else{
                            option =1;
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nCabinda");

                    System.out.print("Informe o número de veículos de passeio: ");
                    number_car=read.nextInt();
                    System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                    number_aci[loop] =read.nextInt();

                    System.out.println("\n2) Verificar Dados");
                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    while(option ==2){
                        System.out.println("Números de veículos de paseio: "+number_car);
                        System.out.println("Número de acidentes de transito: "+number_aci[loop]);
                        System.out.println("\n1 - Alterar dados");
                        System.out.println("2 - Guardar dados");
                        System.out.print("Escolha a sua opção: ");
                        int dados=read.nextInt();
                        if (dados==1){
                            System.out.print("Informe o número de veículos de passeio: ");
                            number_car=read.nextInt();
                            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                            number_aci[loop] =read.nextInt();

                            System.out.println("\n2) Verificar Dados");
                            System.out.println("1) M E N U");
                            System.out.println("0) S A I R");
                            System.out.print("Escolha a sua opção: ");
                            option =read.nextInt();
                        }else{
                            option =1;
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nLuanda");

                    System.out.print("Informe o número de veículos de passeio: ");
                    number_car=read.nextInt();
                    System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                    number_aci[loop] =read.nextInt();

                    System.out.println("\n2) Verificar Dados");
                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    while(option ==2){
                        System.out.println("Números de veículos de paseio: "+number_car);
                        System.out.println("Número de acidentes de transito: "+number_aci[loop]);
                        System.out.println("\n1 - Alterar dados");
                        System.out.println("2 - Guardar dados");
                        System.out.print("Escolha a sua opção: ");
                        int dados=read.nextInt();
                        if (dados==1){
                            System.out.print("Informe o número de veículos de passeio: ");
                            number_car=read.nextInt();
                            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                            number_aci[loop] =read.nextInt();

                            System.out.println("\n2) Verificar Dados");
                            System.out.println("1) M E N U");
                            System.out.println("0) S A I R");
                            System.out.print("Escolha a sua opção: ");
                            option =read.nextInt();
                        }else{
                            option =1;
                        }
                    }
                    break;
                case 5:
                    System.out.println("\nMuxico");

                    System.out.print("Informe o número de veículos de passeio: ");
                    number_car=read.nextInt();
                    System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                    number_aci[loop] =read.nextInt();

                    System.out.println("\n2) Verificar Dados");
                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    while(option ==2){
                        System.out.println("Números de veículos de paseio: "+number_car);
                        System.out.println("Número de acidentes de transito: "+number_aci[loop]);
                        System.out.println("\n1 - Alterar dados");
                        System.out.println("2 - Guardar dados");
                        System.out.print("Escolha a sua opção: ");
                        int dados=read.nextInt();
                        if (dados==1){
                            System.out.print("Informe o número de veículos de passeio: ");
                            number_car=read.nextInt();
                            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                            number_aci[loop] =read.nextInt();

                            System.out.println("\n2) Verificar Dados");
                            System.out.println("1) M E N U");
                            System.out.println("0) S A I R");
                            System.out.print("Escolha a sua opção: ");
                            option =read.nextInt();
                        }else{
                            option =1;
                        }
                    }
                    break;
                default:
                    System.err.println("\n[ERROR!] Opção inválida!");

                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    break;
            }

            //contadores e tudo...

            if (number_car<2000) {
                aciNumber+= number_aci[loop];
                contCar++;
            }

            carNumber+=number_car;

            loop++;
            if (loop>4){
                break;
            }

            for (int i = 0; i <25 ; i++) {
                System.out.println("");
            }

        }while(option==1);

        //Maior e Menor indece de Tranzito
        indMin=number_aci[0];
        for(int i=0;i<number_aci.length;i++){
            if (indMax<number_aci[i]){
                indMax= number_aci[i];
                pMax=provincy[i];
            }if(indMin>number_aci[i]){
                indMin= number_aci[i];
                pMin=provincy[i];
            }
        }

        System.out.println("\n\nRESULTADO DA ESTATISTICA");
        System.out.println("\nA Média de veículos de passeio nas "+loop+" províncias juntas é: "+(carNumber/loop));
        System.out.println("A Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é: "+(aciNumber/ contCar));

        System.out.println(pMin+" corresponde a "+indMin+" acidentes, é a provincia com o menor índece de acidente");
        System.out.println(pMax+" corresponde a "+indMax+" acidentes, é a provincia com o maior índece de acidente");
        
        read.close();
    }
}