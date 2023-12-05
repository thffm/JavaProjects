package entities;

public class Carro {
    private  String name;
    private Double price;
    private Integer age;
    private String fabricante;


    public  Carro(String name,String fabricante,Double price,Integer age){
        this.name = name;
        this.fabricante = fabricante;
        this.price = price;
        this.age = age;
    }


    public String toString() {
        return String.format("Car:%S \nPrice: %.2f$",name,price);
    }
}
