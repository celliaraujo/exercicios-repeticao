import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = scan.nextInt();
        int fatorial = numero;

        for(int x = numero - 1; x >= 1; x--){ 
            fatorial = fatorial * x;

        }

        System.out.println(numero + "! = " + fatorial);


    }
    
}
