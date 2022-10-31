import java.util.Scanner;

class IdadeUfam{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ano = scan.nextInt();
        
        System.out.printf("A UFAM tem %d anos de fundacao", ano-1909);
        scan.close();
    }
}