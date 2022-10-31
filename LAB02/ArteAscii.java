import java.util.Scanner;

class ArteAscii{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtde = scan.nextInt();
        
        for(int i = 0; i<qtde; i++){
            for(int j=qtde-i; j>0;j--){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i = 0; i<qtde; i++){
            for(int j=0; j<i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        scan.close();
    }
}