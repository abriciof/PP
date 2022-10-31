import java.util.Scanner;

class PinturaMuro{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int alt = 3;
        int lar = 12;
        int material = 100;
        
        float preco = scan.nextFloat();
        
        float media = preco*(alt*lar) + material;
        
        System.out.printf("%.1f\n", media);
        scan.close();
    }
}
