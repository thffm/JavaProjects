package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Loja {
    public String name;
    public String location;

    private List<Carro> cars = new ArrayList<>();

    public Loja(String name,String location){
        this.name = name;
        this.location = location;
    }
    public void addCar(String name,String fabricante,Double price,Integer age){
        cars.add(new Carro(name,fabricante,price,age));


    }

    public void showCars(){
        int x = 0;
        for(Carro carro: cars){
            System.out.printf("Index [%d] -> Carro %S\n",x,carro);
            System.out.println("-------");
            x++;
        }

    }

}
