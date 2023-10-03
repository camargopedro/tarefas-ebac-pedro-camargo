import java.lang.annotation.Annotation;

public class AppReflection {



    public static void main(String[] args) {


        Class<ClasseComAnotacao> classe = ClasseComAnotacao.class;

        Annotation[] annotations = classe.getAnnotations();

        for (Annotation annotation : annotations) {

            if (annotation instanceof Tabela) {

                Tabela tabelaAnnotation = (Tabela) annotation;
                String nomeDaTabela = tabelaAnnotation.nome();
                System.out.println("Nome da tabela: " + nomeDaTabela);

            }

        }

    }

}