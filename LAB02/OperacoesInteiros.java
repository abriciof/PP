import java.util.Scanner;

class OperacoesInteiros{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int aux = scan.nextInt();
        int maior=aux, menor=aux;
        int qtde=0, pares=0, impares=0;
        int soma=0;
        while(aux!=-1){
            while(aux!=-1){
                qtde++;
                soma+=aux;

                if(aux%2==0) pares++;
                else impares++;

                if(aux>maior) maior=aux;
                else if(aux<menor) menor=aux;
                
                aux = scan.nextInt();
            }
            System.out.printf("%d\n%d\n%d\n%d\n%.2f\n%d\n%d\n", qtde,pares,impares,soma, (double)soma/(double)qtde, maior, menor);
            soma=0;pares=0;impares=0;qtde=0;
            aux = scan.nextInt();
            maior=aux; menor=aux;
        }
        scan.close();
    }
}