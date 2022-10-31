import java.util.Scanner;

class Xadrez{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
      
        for(int i=0; i<num; i++){
            if(i%2==0){
                for(int j=0; j<num; j++){
                    System.out.print("* ");
                }
            }else{
                for(int j=0; j<num; j++){
                    System.out.print(" *");
                }
            }
            System.out.println();
            
        }
        scan.close();
    }
}