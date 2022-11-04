import java.util.Scanner;

class MediaColecoes{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); 
        double soma = 0, i=0;

        while(num!=-1){
            while(num!=-1){
                i+=1; soma+=num;
                num = scan.nextInt();
            }
            System.out.printf("%.2f", soma/i);
            soma = 0; i =0;
            num = scan.nextInt();
        }
        scan.close();



    
    }
}