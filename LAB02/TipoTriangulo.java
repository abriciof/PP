import java.util.Scanner;

class TipoTriangulo{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(((a+b) <= c) || ((b+c) <= a) || ((a+c) <= b)){
            System.out.printf("invalido\n");
        }else if((a==b) && (b==c)){
            System.out.printf("equilatero\n");
        }else if((a==b)||(b==c)||(c==a)){
            System.out.printf("isosceles\n");
        }else{
            System.out.printf("escaleno\n");
        }
        
      
        scan.close();
    }
}