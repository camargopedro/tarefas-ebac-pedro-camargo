import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String Args[]){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nomes e sexos (-m ou -f) separados por vírgula: ");
        String todosOsNomes = entrada.nextLine();

        String[] arraytodosOsNomes = todosOsNomes.split(",");
        System.out.println("Array com todos os nomes digitados: ");
        System.out.println(Arrays.toString(arraytodosOsNomes));

        List<String> arrayMasculino = new ArrayList<>();
        List<String> arrayFeminino = new ArrayList<>();

        for (String s : arraytodosOsNomes) {
            String nome = s.trim();
            if (nome.endsWith("-m")) {
                arrayFeminino.toString().trim();
                arrayMasculino.add(nome.substring(0, nome.length() -2));

            } else if (nome.endsWith("-f")) {
                arrayMasculino.toString().trim();
                arrayFeminino.add(nome.substring(0, nome.length() -2));

            } else {
                System.out.println("Nome: " + nome + ", Sexo: Indefinido");
            }

        }

        System.out.println("Grupo Masculino: " + arrayMasculino);
        System.out.println("Grupo Feminino: " + arrayFeminino);
        System.out.println("== Fim ==");
    }
}
