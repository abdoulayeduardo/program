import java.util.Scanner;
public class Cantry {
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

        int id,number_car,number_aciVitima,opcao=0;

        do {
            System.out.println("\nPROVINCIAS DE ANGOLA");
            System.out.println("ID | Nome da provincia");
            System.out.println("1  | Benguela");
            System.out.println("2  | Bengo");
            System.out.println("3  | Cabinda");
            System.out.println("4  | Luanda");
            System.out.println("5  | Muxico");
            System.out.print("\nInsira o código da província: ");
            id= read.nextInt();

            switch(id){
                case 1:
                    System.out.println("Benguela");

                    System.out.println("\n1) Escolher outra ");
                    System.out.println("0) S A I R");
                    System.out.println("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    break;

                case 2:
                    System.out.println("Bengo");

                    System.out.println("\n1) Escolher outra ");
                    System.out.println("0) S A I R");
                    System.out.println("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    break;

                case 3:
                    System.out.println("Cabinda");

                    System.out.println("\n1) Escolher outra ");
                    System.out.println("0) S A I R");
                    System.out.println("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    break;

                case 4:
                    System.out.println("Luanda");

                    System.out.println("\n1) Escolher outra ");
                    System.out.println("0) S A I R");
                    System.out.println("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    break;
                case 5:
                    System.out.println("Muxico");

                    System.out.println("\n1) Escolher outra ");
                    System.out.println("0) S A I R");
                    System.out.println("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    break;
                default:
                    System.out.println("[ERROR!] Opção inválida!");
                    System.out.println("\n1) Tentar novamente");
                    System.out.println("0) S A I R");
                    System.out.println("Escolha a sua opção: ");
                    opcao=read.nextInt();
                    break;
            }

        }while(opcao==1);
    }
}