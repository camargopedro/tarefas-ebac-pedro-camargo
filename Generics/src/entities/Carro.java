package entities;

public abstract class Carro {
    public String modelo;
    public String cor;
    public String ano;


    public Carro(String modelo, String cor, String ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro " +
                "modelo '" + modelo + '\'' +
                ", cor '" + cor + '\'' +
                ", ano '" + ano + '\'' +
                '}';
    }
}



