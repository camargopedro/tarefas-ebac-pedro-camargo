public class PessoaJuridica extends Pessoa{

    private String enderecoPJ;

    private Double saldoBancarioPJ;

    private String numCelPJ;

    public String getEnderecoPJ() {
        return enderecoPJ;
    }

    public void setEnderecoPJ(String enderecoPJ) {
        this.enderecoPJ = enderecoPJ;
    }

    public Double getSaldoBancarioPJ() {
        return saldoBancarioPJ;
    }

    public void setSaldoBancarioPJ(Double saldoBancarioPJ) {
        this.saldoBancarioPJ = saldoBancarioPJ;
    }

    public String getNumCelPJ() {
        return numCelPJ;
    }

    public void setNumCelPJ(String numCelPJ) {
        this.numCelPJ = numCelPJ;
    }


    @Override
    public String toString() {
        return "Endereço: '" + enderecoPJ + '\'' +
                ", Saldo Bancário: " + saldoBancarioPJ +
                ", Número Celular: '" + numCelPJ + '\'';
    }
}
