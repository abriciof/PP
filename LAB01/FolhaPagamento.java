import java.util.Scanner;

class FolhaPagamento{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorHora = scan.nextDouble();
        int qtdeHoras = scan.nextInt();
        
        double salario = valorHora*qtdeHoras;
        double ir = salario*(0.11);
        double inss = salario*(0.08);
        double descontos = ir+inss;
        double liquido = salario-descontos;
        
        System.out.printf("Salario bruto: R$%.2f\n", salario);
        System.out.printf("IR: R$%.2f\n", ir);
        System.out.printf("INSS: R$%.2f\n", inss);
        System.out.printf("Total de descontos: R$%.2f\n", descontos);
        System.out.printf("Salario liquido: R$%.2f\n", liquido);
    
        scan.close();
    }
}
