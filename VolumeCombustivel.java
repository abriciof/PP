import java.util.Scanner;

class VolumeCombustivel{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altTanque = scan.nextDouble(); 
        double altComb = scan.nextDouble();
        double r = scan.nextDouble();
        double volCombus = 0;
        double volumeCilin = 0;
        double volumeTotal = 0;
        double calota = 0;      
        double altCilin = altTanque-(2.0*r);

        if(altTanque>0 && altComb>=0 && r>0 && altComb<=altTanque){
            if(altComb < r){
                System.out.println("entrou1");
                double x = r-altComb;
                calota = Math.PI/3.0;
                calota = calota*(r*r);
                calota = calota*(3.0*r - r);

                double inv_calota = Math.PI/3.0;
                inv_calota = inv_calota*(r*r);
                inv_calota = inv_calota*(3.0*r - x);
                System.out.printf("%f %f %f %f", r, x, calota, inv_calota);
                volumeTotal = calota - inv_calota;
            }else if(altComb<(r+altCilin)){
                System.out.println("entrou2");
                calota = Math.PI/3.0;
                calota = calota*(r*r);
                calota = calota*(3.0*r - r);
                altCilin = altComb-r;
                volumeCilin = Math.PI*((r*r)*altCilin);
                volumeTotal = calota + volumeCilin;

            }else{ //certo
                System.out.println("entrou3");
                calota = Math.PI/3.0;
                calota = calota*(r*r);
                calota = calota*(3.0*r - r);
                altCilin = altTanque-(2.0*r);
                volumeCilin = Math.PI*((r*r)*altCilin);

                double inv_altComb = altTanque-altComb;
                double inv_calota = Math.PI/3.0;
                inv_calota = inv_calota*(r*r);
                inv_calota = inv_calota*(3.0*r - inv_altComb);

                inv_calota = calota-inv_calota;
                volumeTotal = volumeCilin + calota + inv_calota;

            }
            System.out.printf("%.3f", volumeTotal);
        }else{
            System.out.printf("-1.000");
        }

     
       
        scan.close();
    }
}