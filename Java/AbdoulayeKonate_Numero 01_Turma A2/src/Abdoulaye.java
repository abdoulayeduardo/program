import java.util.Scanner;
public class Abdoulaye {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);


        int id,number, option =0;

        do {
            System.out.println("\nMENU DE PROGRAMAÇÃO");
            System.out.println("ID | Nome do Programa");
            System.out.println("1  | Índice de Massa Corporal(IMC)");
            System.out.println("2  | Conversão de Unidades");
            System.out.println("3  | Intervalo de 10 e 50");
            System.out.println("4  | Dias de Semana");
            System.out.println("5  | Senha do Usuário");
            System.out.println("6  | Números Inteiros");
            System.out.println("0  | FECHAR APP");
            System.out.print("\nInsira o código do programa correspondente: ");
            id= read.nextInt();

            switch(id){
                case 0:
                    System.out.println("Espero que tenhas gostado da esperiência\nFique bem e até breve!");
                    break;
                case 1:
                    System.out.println("\nÍndice de Massa Corporal (IMC)");

                    String name;
                    double weight, height,imc;

                    System.out.print("\nPor favor informe o seu nome: ");
                    name=read.next();

                    System.out.print("Agora, por favor informe o seu peso: ");
                    weight =read.nextDouble();
                    while (weight <0){
                        System.out.print("Agora, por favor informe o seu peso: ");
                        weight =read.nextDouble();
                    }

                    System.out.print("Por ultimo, informe a sua altura: ");
                    height =read.nextDouble();
                    while (height <0){
                        System.out.print("Por ultimo, informe a sua altura: ");
                        height =read.nextDouble();
                    }

                    imc= weight /(height * height);
                    System.out.println("\nOlá senhor(a) "+name+"! informar que o seu IMC (Índice de Massa Corporal) é igual a "+imc);

                    System.out.println("\n1)M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    break;

                case 2:
                    System.out.println("\nConversão de Unidades");

                    double speed,result,umKm=0.27778;

                    System.out.print("Digite a velocidade do carro em [Km/h]: ");
                    speed=read.nextDouble();
                    while (speed<0){
                        System.out.print("Digite a velocidade do carro em [Km/h]: ");
                        speed=read.nextDouble();
                    }
                    result=umKm*speed;
                    System.out.println("A velocidade do carro em [m/s] é "+result);
                    System.out.println("\n1)M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    break;

                case 3:
                    System.out.println("\nIntervalo de 10 e 50");

                    System.out.print("Insira um número: ");
                    number =read.nextInt();

                    if (number >=10 && number<=50) {
                        System.out.println("O número "+number+" faz parte do intervalo de 10 a 50");
                    }else {
                        System.out.println("O número "+number+" não faz parte do intervalo de 10 a 50");
                    }

                    System.out.println("\n1)M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    break;

                case 4:
                    System.out.println("\nDias de Semana");

                    System.out.println("Digite um número correspondente a um dia de semana");
                    number=read.nextInt();

                    switch(number){
                        case 1:
                            System.out.print("\nDomingo\n");
                            break;

                        case 2:
                            System.out.print("\nSegunda-feira\n");
                            break;
                        case 3:
                            System.out.print("\nTerça-feira\n");
                            break;
                        case 4:
                            System.out.print("\nQuarta-feira\n");
                            break;

                        case 5:
                            System.out.print("\nQuinta-feira\n");
                            break;

                        case 6:
                            System.out.print("\nSexta-feira\n");
                            break;

                        case 7:
                            System.out.print("\nSábado-feira\n");
                            break;

                        default:
                            System.out.print("\nErro! o número digitado não corresponde a um dia de semana\n");
                            break;
                    }
                    System.out.println("\n1)M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    break;
                case 5:
                    System.out.println("\nSenha do Usuário");

                    String pass,pass_true="12345";

                    System.out.print("Insira a sua senha: ");
                    pass= read.next();

                    while(pass != pass_true){
                        System.out.print("Insira a senha correta: ");
                        pass= read.next();
                    }
                    System.out.println("Login com sucesso");

                    System.out.println("\n1)M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    break;
                case 6:
                    System.out.println("\nNúmeros Inteiros");
                    int sum=0;
                    do {
                        System.out.println("Insira um número: ");
                        number=read.nextInt();
                        sum+=number;
                    } while (number>0);
                    System.out.println("\n"+sum+" é soma de todos os números digitados.");

                    System.out.println("\n1)M E N U");
                    System.out.println("0) S A I R");
                    System.out.print("Escolha a sua opção: ");
                    option =read.nextInt();
                    break;
                default:
                    System.out.println("\n[ERROR!] Opção inválida!");
                    System.out.println("\n1)M E N U");
                    System.out.println("0) S A I R");
                    System.out.println("Escolha a sua opção: ");
                    option =read.nextInt();
                    break;
            }

            for (int i = 0; i <21 ; i++) {
                System.out.println("      ");
            }
        }while(option ==1);
        System.out.println("Espero que tenhas gostado da esperiência\nFique bem e até breve!");
        read.close();
    }
}