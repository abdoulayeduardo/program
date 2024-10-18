public class Anual {
    public static void main(String[] args) {

        double sal_inicial=1000,percent=0.015,salAno;
        double dobro,cont=0;
        int ano_inicial=2006

        System.out.println("\nOlá senhor (a), abaixo está o relatórío do seu salário e dos aumentos de todos os anos que trabalhou na empesa.");

        System.out.println("\nAno de "+ano_inicial+":");
        System.out.println("Salario: "+sal_inicial+"0 R$");
        System.out.print("Aumento: "+percent*100+"0%");
        System.out.println("\n");

        for (int i = 2007; i <=2024 ; i++) {
                cont+=1;
                dobro=percent*(Math.pow(2,cont));

                salAno=(dobro*sal_inicial)+sal_inicial;
                System.out.println("\nAno de "+i+": ");
                System.out.println("Salario: "+salAno+"0 R$");
                System.out.print("Aumento: "+dobro*100+"0%");
                System.out.println("\n");

        }
    }
}