import java.util.Scanner;

public class HorasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aux = scan.nextInt();
        int soma;
        while(aux!=-1){
            soma = aux;
            for(int i=0; i<6; i++) soma += scan.nextInt();
            System.out.println(soma);
            aux = scan.nextInt();
        }
        
        scan.close();
    }
}