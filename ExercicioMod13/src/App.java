public class App {

    public static void main(String Args[]){

        PessoaFisica pessoa = new PessoaFisica();
        PessoaJuridica pessoa1 = new PessoaJuridica();

        pessoa.setCpf("012345678");
        pessoa.setNome("Pedro");
        pessoa.setEnderecoPF("Rua 1");
        pessoa.setSaldoBancarioPF(5250.00);
        pessoa.setNumCelPF("219950000123");
        System.out.println("Nome da Pessoa Física: " + pessoa.getNome() + " -- CPF: " + pessoa.getCpf());
        System.out.println(pessoa);

        pessoa1.setNome("TI Soluções");
        pessoa1.setCpf("87654321");
        pessoa1.setEnderecoPJ("Avenida Paulista 2");
        pessoa1.setNumCelPJ("2150001234");
        pessoa1.setSaldoBancarioPJ(25000.00);
        System.out.println("Nome da Pessoa Jurídica: " + pessoa1.getNome() + " -- CPF: " + pessoa1.getCpf());
        System.out.println(pessoa1);

    }
}
