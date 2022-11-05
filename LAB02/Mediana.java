import java.util.Scanner;
import java.util.ArrayList;

class Mediana{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<>();

        int aux = scan.nextInt();
        while(aux!=-1){
            vetor.add(aux); aux = scan.nextInt();
        }
        vetor.sort(null);
        
        if(vetor.size()%2==0)
            System.out.printf("%.1f",(double) (vetor.get(vetor.size()/2-1) + vetor.get(vetor.size()/2)) /2.0);
        else
            System.out.printf("%.1f", (double)(vetor.get(vetor.size()/2)));
        
        scan.close();
    }
    
}