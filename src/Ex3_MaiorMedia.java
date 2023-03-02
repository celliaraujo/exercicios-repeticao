import java.util.Scanner;

public class Ex3_MaiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int contador = 0;

        do{
            System.out.println("Insira um número");
            numero = scan.nextInt();
            soma = numero + soma;

            if(maior < numero) maior = numero;

            contador++;
        }while(contador < 5);
        
        System.out.println("Média dos números = " + soma/5);
        System.out.println("Maior número = " + maior);

    }
    
}
