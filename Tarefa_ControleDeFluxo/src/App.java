import java.util.Scanner;

public class App {

    public static void main(String Args[]){


        Scanner s = new Scanner(System.in);
        System.out.println("Digite a Nota 1: ");
        double nota1 = s.nextDouble();
        System.out.println("Digite a Nota 2: ");
        double nota2 = s.nextDouble();
        System.out.println("Digite a Nota 3: ");
        double nota3 = s.nextDouble();
        System.out.println("Digite a Nota 4: ");
        double nota4 = s.nextDouble();

        System.out.println("=====================");
        System.out.println("As notas do Aluno são: ");
        System.out.println(">> Nota 1: " + nota1);
        System.out.println(">> Nota 2: " + nota2);
        System.out.println(">> Nota 3: " + nota3);
        System.out.println(">> Nota 4: " + nota4);
        System.out.println("=====================");
        System.out.println("");

        double media = (nota1+nota2+nota3+nota4)/4;

            if (media < 5){
                System.out.println("Aluno Reprovado (Média Final: " + media + ")");

        }else if (media <=5 && media <7){
                System.out.println("Aluno em Recuperação (Média Final: " + media + ")");
        }else{
                System.out.println("Aluno Aprovado (Média Final: " + media + ")");
            }

    }
}
