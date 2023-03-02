import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o numero entre 1 e 10 para ver sua tabuada:");
        
        int numero = scan.nextInt();

        System.out.println("Tabuada de : " + numero);

        for(int x = 1; x <= 10; x++){
            System.out.println(numero + " X " + x + " = " + numero * x);
        }
        
    }
    
}
