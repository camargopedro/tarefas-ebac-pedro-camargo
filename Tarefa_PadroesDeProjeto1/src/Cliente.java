public class Cliente {


    private String pegarCarro;

    private boolean hasComprarCarro; //vai comprar? True compra, False aluga

    public Cliente(String pegarCarro, boolean hasComprarCarro){
        this.pegarCarro = pegarCarro;
        this.hasComprarCarro = hasComprarCarro;
    }

    public boolean HasComprarCarro(){
        return hasComprarCarro;
    }

    public String getPegarCarro() {
        return pegarCarro;
    }
}
