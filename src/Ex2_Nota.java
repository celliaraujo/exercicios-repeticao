import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota;

        while (true){
            System.out.println("Insira uma nota entre 0 e 10: ");
            nota = scanner.nextInt();

            if(nota >= 0 && nota <= 10) break;
            else{
                System.out.println("Nota inválida!");
            }
        }

        System.out.println("Nota do aluno = " + nota);
    }
    
}
