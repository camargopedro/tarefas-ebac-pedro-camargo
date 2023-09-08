import java.util.Locale;

public abstract class Carro {

    private String modelo;
    private String cor;

    public Carro(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }

    public void limpar(){
        System.out.println("O carro " + modelo + " " + cor.toLowerCase(Locale.ROOT) + " está limpo");

    }
    public void emOrdem(){
        System.out.println("O " + modelo + " passou em todos os testes, está pronto para venda.");
    }
}
