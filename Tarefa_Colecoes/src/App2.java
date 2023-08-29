import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App2 {

    public static void main(String Args[]){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nomes e sexos (-m ou -f) separados por vírgula: ");
        String frase = entrada.nextLine();
        List lista = new ArrayList<String>(List.of(frase.split(", ")));

        System.out.println("Nomes digitados: "+ lista);
        Collections.sort(lista);
        System.out.println("Nomes digitados em ordem alfabética: " +lista);

        /**
         * não consegui pensar em nenhuma solução para esse exercício, travei.
         * agora precisaria dividir a arrayList em 2 por (-m) e (-f) usando o split?
         * não sei fazer
         *
         */





    }

}


