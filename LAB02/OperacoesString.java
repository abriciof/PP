import java.util.Scanner;

class OperacoesString{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine(); int vogal=0;

        System.out.println(entrada.length());
        System.out.println(entrada.charAt(0));
        System.out.println(entrada.charAt(entrada.length()-1));
        System.out.println(entrada.toUpperCase());
        System.out.println(entrada.toLowerCase());
        System.out.println(entrada.replace('a','e'));
        for(int i=0; i<entrada.length(); i++) if(i%2==0) System.out.printf("%c", entrada.charAt(i));
        for(int i=0; i<entrada.length(); i++) if(isVogal(entrada.charAt(i))) vogal++;
        System.out.print("\n"+vogal);



        scan.close();
    }
    public static boolean isVogal(char c){
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||  c=='u' || c=='U'){    
            return true;
        }    
        else{
            return false;
        }    
    }  
}