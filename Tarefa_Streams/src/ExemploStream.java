import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ExemploStream {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nomes e sexos (-m ou -f) separados por vírgula: ");
        String listaDeNomes = entrada.nextLine();

        List<String> pessoas = List.of(listaDeNomes.split(", "));
        for (String s: pessoas) {
            System.out.println(s);

        }
        System.out.println("=======");
        System.out.println("lista de mulheres: ");
        pessoas.stream()
                .filter(s -> s.endsWith("-f"))
                .forEach(s -> System.out.println(s));



       // pessoas.stream().forEach(p -> System.out.println(p));


       // stream.forEach(i -> System.out.println(i));



        /*for (String s : lista) {
            String nome = s.trim(); // Remove espaços em branco no início e no fim
            if (nome.endsWith("-m")) {
                List<String> mas = List.of(nome);
                Stream<String> stream = mas.stream();
                //stream.forEach(s1 -> System.out.println("Nome: " + nome.substring(0, nome.length() - 2) + ", Sexo: Masculino"));

            } else if (nome.endsWith("-f")) {
                List<String> fem = List.of(nome);
                Stream<String> stream = fem.stream();
                stream.forEach(s1 -> System.out.println("Nome: " + nome.substring(0, nome.length() - 2) + ", Sexo: Feminino"));

            } else {
                System.out.println("Nome: " + nome + ", Sexo: Indefinido");
            }

        }

         */
    }
}