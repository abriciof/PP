import java.util.Scanner;
import java.util.ArrayList;

class TimeFutebol{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> time1 = new ArrayList<>();
        ArrayList<Integer> time2 = new ArrayList<>();

        int aux = scan.nextInt();
        while(aux!=-1){
            time1.add(aux); aux = scan.nextInt();
        }

        aux = scan.nextInt();
        while(aux!=-1){
            time2.add(aux); aux = scan.nextInt();
        }
        
        int estatisticas[] = new int[3];
        for(int i=0; i<time1.size(); i++){
            if(time1.get(i) == time2.get(i)) estatisticas[1]++;
            else if(time1.get(i)>time2.get(i)) estatisticas[0]++;
            else estatisticas[2]++;
        }

        for(int i=0; i<3; i++) System.out.printf("%d ", estatisticas[i]);

        scan.close();
    }
}