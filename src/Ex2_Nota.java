import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Insira uma nota entre 0 e 10: ");
        nota = scanner.nextInt();

        while (nota < 0 | nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scanner.nextInt();            
        }

        System.out.println("Nota do aluno = " + nota);
    
    }
    
}
