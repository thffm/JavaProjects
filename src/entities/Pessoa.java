package entities;

public class Pessoa {
    public String name;
    private Double balance;


    public  Pessoa(String name,Double balance){
        this.name = name;
        this.balance = balance;
    }

    public Double getSalary() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}


