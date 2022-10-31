import java.util.Scanner;

class AsciiArt{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtde = scan.nextInt();
        
        for(int i = 0; i<qtde; i++){
            for(int j=qtde-i; j>0;j--){
                System.out.print('*');
            }
            for(int f=i*2; f>0; f--){
                System.out.print(' ');
            }
            for(int k=qtde-i; k>0; k--){
                System.out.print('*');
            }
            System.out.println();
        }
        scan.close();
    }
}
