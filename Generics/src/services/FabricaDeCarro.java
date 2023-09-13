package services;

import entities.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FabricaDeCarro<T> {

    List<T> galpao = new ArrayList<>();

    public void montarCarro(T Carro){
        galpao.add(Carro);
    }

    public void printar(){
        System.out.print("[");
        if (galpao.isEmpty()){
            throw new IllegalStateException("O galpão está vazio");
        }else {

            for (int i=0 ; i < galpao.size(); i++){
                System.out.print(galpao.get(i));
            }
            System.out.print("]");
        }

    }

}