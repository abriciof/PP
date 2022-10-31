import java.util.Scanner;

class Desconto{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble(); 
        if(valor>=200){
            valor = valor*0.95;
        }
        

        System.out.printf("%.2f", valor);
        scan.close();
    }
}