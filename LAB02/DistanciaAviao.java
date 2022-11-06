import java.util.Scanner;

public class DistanciaAviao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matriz[][] = {{0,2,11,6,15,11,1},{2,0,7,12,4,2,15},{11,7,0,11,8,3,13},{6,12,11,0,10,2,1},{15,4,8,10,0,5,13},{11,2,3,2,5,0,14},{1,15,13,1,13,14,0}};
        int soma=0;

        int aux = scan.nextInt(), aux2;
        while(aux!=-1){
            
            aux2 = scan.nextInt();
            if(aux2==-1) break;
            
            soma+=matriz[((aux/111)-1)][((aux2/111)-1)];
            aux=aux2;
            
        }

        System.out.printf("%d",soma);
        scan.close();
    }
}