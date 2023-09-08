public abstract class FabricaAbstrata {

    public Carro criar(String pegarCarro){
        Carro carro = recebeCarro(pegarCarro);
        carro = prepararCarro(carro);
        return carro;
    }
    private Carro prepararCarro(Carro carro){
        carro.limpar();
        carro.emOrdem();
        return carro;
    }
    abstract Carro recebeCarro(String pegarCarro);

}