import java.util.Scanner;
import java.util.ArrayList;

class PorcentagemAcerto{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> vetor1 = new ArrayList<>();
        ArrayList<Integer> vetor2 = new ArrayList<>();
        double cnt=0;

        int aux = scan.nextInt();
        while(aux!=-1){
            vetor1.add(aux); aux = scan.nextInt();
        }

        aux = scan.nextInt();
        while(aux!=-1){
            vetor2.add(aux); aux = scan.nextInt();
        }

        for(int i=0; i<vetor1.size(); i++)
            if(vetor1.get(i) == vetor2.get(i))
                cnt++;
        
        cnt = cnt/((double) vetor1.size());
        System.out.printf("%.2f", cnt*100 );
        scan.close();
    }
}