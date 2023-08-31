import java.lang.reflect.Array;
import java.util.*;

public class App2 {

    public static void main(String Args[]) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nomes e sexos (-m ou -f) separados por vírgula: ");
        String todosOsNomes = entrada.nextLine();
        System.out.println("String: " + todosOsNomes);

        String[] ArraytodosOsNomes = todosOsNomes.split(",");
        System.out.println("Array com todos os nomes:");
        System.out.println(Arrays.toString(ArraytodosOsNomes));

        for (String s : ArraytodosOsNomes) {
            String nome = s.trim(); // Remove espaços em branco no início e no fim
            if (nome.endsWith("-m")) {
                System.out.println("Nome: " + nome.substring(0, nome.length() - 2) + ", Sexo: Masculino");
            } else if (nome.endsWith("-f")) {
                System.out.println("Nome: " + nome.substring(0, nome.length() - 2) + ", Sexo: Feminino");
            } else {
                System.out.println("Nome: " + nome + ", Sexo: Indefinido");
            }
        }
    }
}