import java.util.Scanner;

class Fahrenheit{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float tempC = scan.nextFloat();
        float tempF = (tempC*9)/5 + 32;
        
        System.out.printf("%.1f", tempF);
        scan.close();
    }
}