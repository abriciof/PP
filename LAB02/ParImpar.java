import java.util.Scanner;

class ParImpar{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        // float raiz=0;
        while(num!=-1){
            if (num%2==0){
                System.out.println("PAR");
            }else{
                System.out.println("IMPAR");
            }
            num = scan.nextInt();
        }
            
        scan.close();
    }
}