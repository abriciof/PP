import java.util.Scanner;

class TanqueCombustivel{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble(); 
        double x = scan.nextDouble();
        int op = scan.nextInt(); 
        double volume = (4.0/3.0) * (Math.PI*( Math.pow(r, (double) 3.0 ) ) );
        double calota = Math.PI/3.0;
        calota = calota*(x*x);
        calota = calota*(3.0*r - x);
        double vop = 0;
        if (op==1){
            vop = calota;
        }else if(op==2){
            vop = volume-calota;
        }
        System.out.printf("%.4f", vop);
       
        scan.close();
    }
}