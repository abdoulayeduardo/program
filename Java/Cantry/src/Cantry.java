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

        int number_car=0, number_aci=0,opction=0;
        int cont=1,indMax=0,indMin=0,carNumber=0;
        int aciNumber=0,numberProvincy=5;
        int [] id=new int[numberProvincy];
        int idProvincy;
        String provincy;

        do {
            System.out.println("\nPROVINCIAS DE ANGOLA");
            System.out.println("ID | Nome da provincia");
            System.out.println("1  | Benguela");
            System.out.println("2  | Bengo");
            System.out.println("3  | Cabinda");
            System.out.println("4  | Luanda");
            System.out.println("5  | Muxico");
            System.out.print("\nInsira o código da província: ");
            idProvincy= read.nextInt();

            switch(idProvincy){
                case 1:
                    System.out.println("\nBenguela");

                    System.out.print("Informe o número de veículos de passeio: ");
                    number_car=read.nextInt();
                    System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                    number_aci =read.nextInt();

                    System.out.println("\n2) Verificar Dados");
                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    while(opcao==2){
                        System.out.println("Números de veículos de paseio: "+number_car);
                        System.out.println("Número de acidentes de transito: "+number_aci);
                        System.out.println("\n1 - Alterar dados");
                        System.out.println("2 - Guardar dados");
                        System.out.println("Escolha a sua opção: ");
                        int dados=read.nextInt();
                        if (dados==1){
                            System.out.print("Informe o número de veículos de passeio: ");
                            number_car=read.nextInt();
                            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                            number_aci =read.nextInt();

                            System.out.println("\n2) Verificar Dados");
                            System.out.println("1) M E N U");
                            System.out.println("0) S A I R");
                            System.out.println("Escolha a sua opção: ");
                            opcao=read.nextInt();
                        }else{
                            opcao=1;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nBengo");

                    System.out.print("Informe o número de veículos de passeio: ");
                    number_car=read.nextInt();
                    System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                    number_aci =read.nextInt();

                    System.out.println("\n2) Verificar Dados");
                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    while(opcao==2){
                        System.out.println("Números de veículos de paseio: "+number_car);
                        System.out.println("Número de acidentes de transito: "+number_aci);
                        System.out.println("\n1 - Alterar dados");
                        System.out.println("2 - Guardar dados");
                        System.out.println("Escolha a sua opção: ");
                        int dados=read.nextInt();
                        if (dados==1){
                            System.out.print("Informe o número de veículos de passeio: ");
                            number_car=read.nextInt();
                            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                            number_aci =read.nextInt();

                            System.out.println("\n2) Verificar Dados");
                            System.out.println("1) M E N U");
                            System.out.println("0) S A I R");
                            System.out.println("Escolha a sua opção: ");
                            opcao=read.nextInt();
                        }else{
                            opcao=1;
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nCabinda");

                    System.out.print("Informe o número de veículos de passeio: ");
                    number_car=read.nextInt();
                    System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                    number_aci =read.nextInt();

                    System.out.println("\n2) Verificar Dados");
                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    while(opcao==2){
                        System.out.println("Números de veículos de paseio: "+number_car);
                        System.out.println("Número de acidentes de transito: "+number_aci);
                        System.out.println("\n1 - Alterar dados");
                        System.out.println("2 - Guardar dados");
                        System.out.println("Escolha a sua opção: ");
                        int dados=read.nextInt();
                        if (dados==1){
                            System.out.print("Informe o número de veículos de passeio: ");
                            number_car=read.nextInt();
                            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                            number_aci =read.nextInt();

                            System.out.println("\n2) Verificar Dados");
                            System.out.println("1) M E N U");
                            System.out.println("0) S A I R");
                            System.out.println("Escolha a sua opção: ");
                            opcao=read.nextInt();
                        }else{
                            opcao=1;
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nLuanda");

                    System.out.print("Informe o número de veículos de passeio: ");
                    number_car=read.nextInt();
                    System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                    number_aci =read.nextInt();

                    System.out.println("\n2) Verificar Dados");
                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    while(opcao==2){
                        System.out.println("Números de veículos de paseio: "+number_car);
                        System.out.println("Número de acidentes de transito: "+number_aci);
                        System.out.println("\n1 - Alterar dados");
                        System.out.println("2 - Guardar dados");
                        System.out.println("Escolha a sua opção: ");
                        int dados=read.nextInt();
                        if (dados==1){
                            System.out.print("Informe o número de veículos de passeio: ");
                            number_car=read.nextInt();
                            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                            number_aci =read.nextInt();

                            System.out.println("\n2) Verificar Dados");
                            System.out.println("1) M E N U");
                            System.out.println("0) S A I R");
                            System.out.println("Escolha a sua opção: ");
                            opcao=read.nextInt();
                        }else{
                            opcao=1;
                        }
                    }
                    break;
                case 5:
                    System.out.println("\nMuxico");

                    System.out.print("Informe o número de veículos de passeio: ");
                    number_car=read.nextInt();
                    System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                    number_aci =read.nextInt();

                    System.out.println("\n2) Verificar Dados");
                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    while(opcao==2){
                        System.out.println("Números de veículos de paseio: "+number_car);
                        System.out.println("Número de acidentes de transito: "+number_aci);
                        System.out.println("\n1 - Alterar dados");
                        System.out.println("2 - Guardar dados");
                        System.out.println("Escolha a sua opção: ");
                        int dados=read.nextInt();
                        if (dados==1){
                            System.out.print("Informe o número de veículos de passeio: ");
                            number_car=read.nextInt();
                            System.out.print("Informe o número de acidentes de trânsito com vítimas: ");
                            number_aci =read.nextInt();

                            System.out.println("\n2) Verificar Dados");
                            System.out.println("1) M E N U");
                            System.out.println("0) S A I R");
                            System.out.println("Escolha a sua opção: ");
                            opcao=read.nextInt();
                        }else{
                            opcao=1;
                        }
                    }
                    break;
                default:
                    System.out.println("\n[ERROR!] Opção inválida!");

                    System.out.println("1) M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    break;
            }
            //contadores e tudo...

            if (number_car<2000) {
                aciNumber+= number_aci;
            }
            carNumber+=number_car;
            if (indMax<number_aci){
                indMax= number_aci;
            }if(indMin>number_aci){
                indMin= number_aci;
            }
            cont++;
            if (cont>5){
                break;
            }
        }while(opcao==1);

        System.out.println("A Média de veículos de passeio nas cinco províncias juntas é: "+(carNumber/numberProvincy));
        System.out.println("A Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é: "+(aciNumber/numberProvincy));
        System.out.println(provincy+" corresponde a "+indMin+" acidentes, é a provincia com o menor índece de acidente");
        System.out.println(provincy+" corresponde a "+indMax+" acidentes, é a provincia com o maior índece de acidente");
        
        read.close();
    }
}