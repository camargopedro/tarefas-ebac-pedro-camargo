public class App {

    public static void main(String[] Args){

        Cliente pedro = new Cliente("Esportivo", true);
        FabricaAbstrata fabricaAbstrata = getFabricaAbstrata(pedro);
        Carro carro = fabricaAbstrata.criar(pedro.getPegarCarro());

        Cliente ana = new Cliente("Trabalho", false);
        FabricaAbstrata fabricaAbstrata1 = getFabricaAbstrata(ana);
        Carro carro1 = fabricaAbstrata1.criar(ana.getPegarCarro());

    }

    private static FabricaAbstrata getFabricaAbstrata(Cliente cliente){
        if (cliente.HasComprarCarro()){
            return new FabricaDeCarros();
        }else {
            return new LocadoraDeCarros();
        }
    }


}
