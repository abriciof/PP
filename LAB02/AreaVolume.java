import java.util.Scanner;

class AreaVolume{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();

        double area = Math.PI*(r*r);
        double volume = (4.0/3.0)*(r*area);


        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.",r, area);
        System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", r, volume);
        scan.close();
    }
}