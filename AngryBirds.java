import java.util.Scanner;

class AngryBirds{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v = Math.abs(scan.nextDouble()); 
        double ang= scan.nextDouble();
        double d = scan.nextDouble(); 

        double r = Math.pow((double) v, (double) 2.0);
        r = r*Math.sin(2*(Math.toRadians(ang)));
        r = r/9.8;

        if(Math.abs(r-d)<0.1){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        
       
        scan.close();
    }
}