import java.util.Scanner;
import java.util.ArrayList;

class DataExtenso{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String meses[] = {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        String entrada = scan.nextLine();
        String dia = entrada.substring(0,2);
        String mes = entrada.substring(2,4);
        String ano = entrada.substring(4,8);

        
        System.out.println(dia+" de "+meses[Integer.parseInt(mes)-1]+" de "+ano);
        scan.close();
    }
}