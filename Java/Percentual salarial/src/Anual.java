public class Anual {
    public static void main(String[] args) {

        double salary_inici =1000, percentage =0.015, salary_year;
        double dobro,cont=0;
        int year_inici =2005, year_act =2024;

        System.out.println("\nOlá senhor (a), abaixo está o relatórío do seu salário e dos aumentos de todos os anos que trabalhou na empesa.");



        for (int i = year_inici; i <= year_act; i++) {

            if(i==2005){
                System.out.println("\nAno de "+i+":");
                System.out.println("Salario: "+ salary_inici +"0 R$");
                System.out.print("Aumento: 0%");
                System.out.println("\n");
            }else if(i==2006){
                System.out.println("\nAno de "+i+":");
                System.out.println("Salario: "+ salary_inici +"0 R$");
                System.out.print("Aumento: "+ (percentage *salary_inici)+salary_inici+"0%");
                System.out.println("\n");
            }else {
                cont += 1;
                dobro = percentage * (Math.pow(2, cont));

                salary_year = (dobro * salary_inici) + salary_inici;
                System.out.println("\nAno de " + i + ": ");
                System.out.println("Salario: " + salary_year + "0 R$");
                System.out.print("Aumento: " + dobro * 100 + "0%");
                System.out.println("\n");
            }
        }
    }
}