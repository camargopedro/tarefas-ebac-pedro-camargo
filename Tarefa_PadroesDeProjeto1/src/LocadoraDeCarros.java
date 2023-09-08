public class LocadoraDeCarros extends FabricaAbstrata{
    @Override
    Carro recebeCarro(String pegarCarro) {
        switch (pegarCarro){
            case "Esportivo":
                return new CarroTipoEsportivo("Ferrari", "Vermelho");
            case "Trabalho":
                return new CarroTipoTrabalho("Honda Civic", "Prata");
            case "Estudante":
                return new CarroTipoEstudante("Renault Clio", "preto");
            default:
                System.out.println("Carro não disponível");
                return null;
        }
    }
}