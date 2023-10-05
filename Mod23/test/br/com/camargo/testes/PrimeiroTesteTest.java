package br.com.camargo.testes;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class PrimeiroTesteTest {


    @Test
    public void primeiroTest(){



        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nomes e sexos (-m ou -f) separados por vírgula: ");
        String listaDeNomes = entrada.nextLine();

        List<String> pessoas = List.of(listaDeNomes.split(", "));
        for (String s: pessoas) {
            System.out.println(s);

        }
        System.out.println("=======");
        System.out.println("lista de mulheres: ");
        pessoas.stream()
                .filter(s -> s.endsWith("-f"))
                .forEach(s -> System.out.println(s));

        Assert.assertEquals(pessoas.stream().filter(s -> s.endsWith("-f")), pessoas);

    }


}



      //o que eu boto aqui? a List completa? o stream com divisão de mulheres? não sei o que fazer
    //tem vários assert. também...não sei nem por onde começar.
        //oo exemplo da aula foi simples, não ensinou como se faz usando lists e etc.

