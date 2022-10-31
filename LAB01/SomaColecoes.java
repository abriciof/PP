import java.util.Scanner;

class SomaColecoes{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int col = scan.nextInt();
        int soma;
        while(col!=-1){
            soma=0;
            while(col!=-1){
                soma+=col;
                col = scan.nextInt();
            }
            System.out.printf("%d\n", soma);
            col = scan.nextInt();
        }
        
        scan.close();
    }
}
