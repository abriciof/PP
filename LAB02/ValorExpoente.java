import java.util.Scanner;

class ValorExpoente{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble(); 
        double soma = 0;
        int exp=1, flag=1;
        while(flag==1){
            soma += Math.pow(2.0,exp);
            if(soma>num){
                System.out.printf("%d", exp);
                flag=0;
            }
            exp += 1;
            
        }
        scan.close();
    }
}