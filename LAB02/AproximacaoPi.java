import java.util.Scanner;

class AproximacaoPi{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); 
        double aprox = 3;
        double a=2, b=3, c=4;

       for(int i=0; i<num; i++){
        
            if(i%2==0 && i!=0){
                aprox = aprox - (4.0/(a*b*c));
                a+=2; b+=2; c+=2;
            }else if(i%2==1){
                aprox = aprox + (4.0/(a*b*c));
                a+=2; b+=2; c+=2;
            }
            System.out.printf("%.6f\n", aprox);
        }
        
       
        



        scan.close();
    }
}