import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Insira a quantidade de números: ");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("Insira o numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

            quantNumeros--;
        }while(quantNumeros > 0);

        System.out.println("Quantidade de números pares = " + quantPares);
        System.out.println("Quantidade de números ímpares = " + quantImpares);

    }
    
}
