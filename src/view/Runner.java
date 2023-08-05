package view;

import model.ETypeProduct;
import model.Product;
import model.Sale;
import model.ServiceSale;
import presenter.Presenter;

import java.util.Scanner;

public class Runner {
    private static Presenter presenter;

    public static void main (String [] args) {
        presenter = new Presenter();
        int addBuy;
        do {
            String menu = "Menu \n" +
                    "1. Acetaminophen \n" +
                    "2. Ron \n" +
                    "3. Soap \n" +
                    "4. Shampoo \n" +
                    "5. Cornmeal \n";

            System.out.println(menu);
            System.out.println("Enter the product you want to buy");

            Scanner sc = new Scanner(System.in);

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Enter the amount you want to buy: ");
                    int cant1 = sc.nextInt();
                    presenter.addSale("Acetaminophen", 15000, 50, false, ETypeProduct.MEDICINAS, cant1);
                    System.out.println(presenter.showSale());
                    break;

                case 2:
                    System.out.println("Enter the amount you want to buy: ");
                    int cant2 = sc.nextInt();
                    presenter.addSale("Ron", 50000, 30, false, ETypeProduct.MEDICINAS, cant2);

                    System.out.println(presenter.showSale());

                    break;
                case 3:
                    Product soap = new Product("Soap", 2000, 60, true, ETypeProduct.ASEO);
                    System.out.println("Enter the amount you want to buy: ");
                    int cant3 = sc.nextInt();
                    presenter.addSale("Soap", 2000, 60, true, ETypeProduct.ASEO, cant3);
                    System.out.println(presenter.showSale());

                    break;
                case 4:
                    System.out.println("Enter the amount you want to buy: ");
                    int cant4 = sc.nextInt();
                    presenter.addSale("Shampoo", 20000, 60, true, ETypeProduct.ASEO, cant4);
                    System.out.println(presenter.showSale());

                    break;
                case 5:
                    System.out.println("Enter the amount you want to buy: ");
                    int cant5 = sc.nextInt();
                    presenter.addSale("Cornmeal", 4000, 50, true, ETypeProduct.VIVERES, cant5);
                    System.out.println(presenter.showSale());

                    break;

                default:
                    System.out.println("The entered value is not valid ");
            }
            System.out.println("Want to add another purchase, type 1. Yes, or 2. Not");

            addBuy = sc.nextInt();


        } while (addBuy == 1);
    }
}
