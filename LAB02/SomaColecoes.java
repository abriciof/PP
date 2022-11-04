import java.util.Scanner;

class SomaColecoes{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); 
        int soma = 0;

        while(num!=-1){
            while(num!=-1){
                soma+=num;
                num = scan.nextInt();
            }
            System.out.printf("%d", soma);
            soma = 0;
            num = scan.nextInt();
        }
        



        scan.close();
    }
}