import java.util.*;

public class App1 {

    public static void main(String Args[]){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nomes separados por vírgula: ");
        String frase = entrada.nextLine();
        List lista = new ArrayList<String>(List.of(frase.split(", ")));


        System.out.println("Nomes digitados: "+ lista);
        Collections.sort(lista);
        System.out.println("Nomes digitados em ordem alfabética: " +lista);

    }

}
