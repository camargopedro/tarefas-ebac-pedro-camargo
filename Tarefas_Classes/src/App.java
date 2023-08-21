/**
 * @author Pedro Camargo
 * @version 1.0
 *
 */
public class App {

    public static void main(String args[]){

        Aluno aluno = new Aluno();//instanciando novo aluno
        aluno.setNome("Gabriel");//setando nome
        aluno.setMatricula(123);//setando matricula
        aluno.registrarNota(8.0);//puxando metodo de registrar nota

        /*
        *printando as informaçoes do aluno instanciado
        * Nome, Matricula e nota
        */
        System.out.println(aluno.getNome());
        System.out.println(aluno.getMatricula());
        System.out.println(aluno.getNota());
    }

}
