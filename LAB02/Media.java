import java.util.Scanner;

class Media{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num;
        float media=0;
        
        for(int i = 0; i<3; i++){
            num = scan.nextFloat();
            media += num;
        }
        System.out.printf("%.2f", media/3);
        scan.close();
    }
}