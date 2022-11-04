import java.util.Scanner;

class SomaColecao{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); 
        int soma = 0;

        while(num!=-1){
            soma+=num;
            num = scan.nextInt();
        }
        System.out.printf("%d", soma);



        scan.close();
    }
}