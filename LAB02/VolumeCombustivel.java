import java.util.Scanner;

class VolumeCombustivel{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altTanque = scan.nextDouble(); 
        double altComb = scan.nextDouble();
        double r = scan.nextDouble();
        double volumeTotal = 0;


        if(altTanque>0){
            double volumeEsfera = (4.0/3.0)*Math.PI * Math.pow(r, 3)/2;
		    double volumeCilindro = Math.PI*Math.pow(r,2) * (altComb-r);

            if(altTanque>altComb && altComb <= altTanque-r && altComb>=r){
                // System.out.println("entrou1");
                volumeTotal = volumeEsfera + volumeCilindro;
            }else if(altComb<r){
                // System.out.println("entrou2");
                volumeEsfera = (Math.PI/3.0)*Math.pow(altComb, 2)*(3*r-altComb);
                volumeTotal = volumeEsfera;
            }else if(altTanque==altComb){ //certo
                // System.out.println("entrou3");
                volumeEsfera /= 2;
                volumeTotal = volumeEsfera+volumeCilindro+volumeEsfera;

            }
            System.out.printf("%.3f", volumeTotal);
        }else{
            System.out.printf("-1.000");
        }

     
       
        scan.close();
    }
}