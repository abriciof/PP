import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[7];

        int aux = scan.nextInt();
        while(aux!=-1){
            vetor[0]+=aux;
            for(int i=1; i<7;i++) vetor[i]+=scan.nextInt();
            aux = scan.nextInt();
        }

        maior(vetor);
        scan.close();
    }

    public static void maior(int vetor[]){
        int maior=vetor[0], id=0;
        for(int i=0;i<7;i++)
            if(vetor[i]>maior){
                maior=vetor[i]; id=i;
            }

        for(int i=0;i<7;i++) if(vetor[i]==maior) System.out.println(i+1);      
    }
}