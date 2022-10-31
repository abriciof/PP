import java.util.Scanner;

class RaizQuadrada{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();
        float raiz=0;
        
        System.out.printf("%.4f", Math.sqrt(num));
        scan.close();
    }
}