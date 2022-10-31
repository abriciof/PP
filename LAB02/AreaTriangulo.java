import java.util.Scanner;

class AreaTriangulo{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        float area, s;

        if(((a+b) <= c) || ((b+c) <= a) || ((a+c) <= b)){
            System.out.printf("Triangulo invalido\n");
        }else{
            s = (a+b+c)/2;
            area = s*(s-a)*(s-b)*(s-c);
            // area = Math.sqrt();
            System.out.printf("%.2f", Math.sqrt((double) area));
        }
        
       
        scan.close();
    }
}