package application;

import entities.Carro;
import entities.Honda;
import entities.Mercedes;
import entities.Renault;
import services.FabricaDeCarro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        FabricaDeCarro fab = new FabricaDeCarro();

        Mercedes car1 = new Mercedes("C180", "Prata", "2023");
        Mercedes car2 = new Mercedes("A200", "Preta", "2020");
        Honda car3 = new Honda("Civic", "Branco", "2021");
        Renault car4 = new Renault("Clio", "Chumbo", "2016");
        Renault car5 = new Renault("Captur", "Branco", "2022");

        fab.montarCarro(car1);
        fab.montarCarro(car2);
        fab.montarCarro(car3);
        fab.montarCarro(car4);
        fab.montarCarro(car5);


        fab.printar();
    }
}