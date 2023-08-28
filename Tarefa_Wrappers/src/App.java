import java.util.Scanner;

public class App {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 100: ");
        int numPrimitivo = s.nextInt();
        System.out.println("numero digitado: " + numPrimitivo);

        Integer numWrapper = numPrimitivo;
        System.out.println("valor primitivo convertido em Integer: " + numWrapper);

    }
}
