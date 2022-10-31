import java.util.Scanner;

class RotaOrtodromica{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double t1= scan.nextDouble(); double g1= scan.nextDouble();
        double t2= scan.nextDouble(); double g2= scan.nextDouble();
        double d = 6371 * Math.acos(Math.sin(Math.toRadians(t1)) * Math.sin(Math.toRadians(t2)) + 
                Math.cos(Math.toRadians(t1)) * Math.cos(Math.toRadians(t2)) * Math.cos(Math.toRadians(g1) - Math.toRadians(g2)));

        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km", t1, g1, t2, g2, d);
        scan.close();
    }
}