
import entities.Loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loja ouroMinas = new Loja("Ouro Minas","Ouro Preto");
        char response = 'n';
        while (response != 's') {

            System.out.println("Input data:");
            System.out.print("Input name:");
            String name = sc.nextLine();
            System.out.print("Input Fabricante:");
            String fabricante = sc.nextLine();
            System.out.print("Input price:");
            double price = sc.nextDouble();
            System.out.print("Input age:");
            int age = sc.nextInt();
            sc.nextLine();
            ouroMinas.addCar(name, fabricante, price, age);
            System.out.println("EXIT?[s/n]");
            response = sc.nextLine().charAt(0);
        }





        ouroMinas.showCars();

        sc.close();



    }
}