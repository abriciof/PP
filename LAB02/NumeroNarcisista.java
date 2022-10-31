import java.util.Scanner;

class NumeroNarcisista{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int resto, qtde=0, soma=0;
        int aux = num;
        int aux2 = num;
    
        if(num!=0){
            while(aux>0){   
                resto = aux%10;
                aux/=10;
                qtde++;
            }  
            while(num>0){
                resto = num%10;
                num/=10;
                soma+=Math.pow((double) resto, (double) qtde);
            }
            if(soma==aux2)
                System.out.printf("SIM\n");
            else
                System.out.printf("NAO\n");
            
        }else
              System.out.printf("NAO\n");
        
        
       
        scan.close();
    }
}