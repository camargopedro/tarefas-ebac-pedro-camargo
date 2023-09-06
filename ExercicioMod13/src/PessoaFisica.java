public class PessoaFisica extends Pessoa{

    private String enderecoPF;

    private Double saldoBancarioPF;

    private String numCelPF;

    public String getEnderecoPF() {
        return enderecoPF;
    }

    public void setEnderecoPF(String enderecoPF) {
        this.enderecoPF = enderecoPF;
    }

    public Double getSaldoBancarioPF() {
        return saldoBancarioPF;
    }

    public void setSaldoBancarioPF(Double saldoBancarioPF) {
        this.saldoBancarioPF = saldoBancarioPF;
    }

    public String getNumCelPF() {
        return numCelPF;
    }

    public void setNumCelPF(String numCelPF) {
        this.numCelPF = numCelPF;
    }


    @Override
    public String toString() {
        return "Endereço: '" + enderecoPF + '\'' +
                ", Saldo Bancario: " + saldoBancarioPF +
                ", Numero Celular: '" + numCelPF + '\'';
    }
}
