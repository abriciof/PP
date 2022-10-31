import java.util.Scanner;

class SomaDigitos{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int resto, soma=0;
        
        while(num>0){
            resto = num % 10;
            num = num/10;
            soma += resto;
        }
        System.out.printf("%d", soma);
        scan.close();
    }
}