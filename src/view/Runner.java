package view;

import model.ETypeProduct;
import model.Product;
import presenter.Presenter;

import java.util.Scanner;

public class Runner {
    private static Presenter presenter;

    public static void main(String[] args){
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
                    Runner.addProduct(presenter.acetaminophen, sc);
                    break;

                case 2:
                    Runner.addProduct(presenter.ron, sc);
                    break;
                case 3:
                    System.out.println("Enter the amount you want to buy: ");
                    int cant3 = sc.nextInt();
                    try {
                        presenter.addSale("Soap", 2000, 60, true, ETypeProduct.ASEO, cant3);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 4:
                    System.out.println("Enter the amount you want to buy: ");
                    int cant4 = sc.nextInt();
                    try {
                        presenter.addSale("Shampoo", 20000, 60, true, ETypeProduct.ASEO, cant4);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                    break;
                case 5:
                    System.out.println("Enter the amount you want to buy: ");
                    int cant5 = sc.nextInt();
                    try {
                        presenter.addSale("Cornmeal", 4000, 50, true, ETypeProduct.VIVERES, cant5);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                    break;

                default:
                    System.out.println("The entered value is not valid ");
            }

            System.out.println(presenter.showSale());

            System.out.println("Want to add another purchase, type 1. Yes, or 2. Not");

            addBuy = sc.nextInt();
        } while (addBuy == 1);
    }

    private static void addProduct(Product product, Scanner sc) {
        System.out.println(product.toString());
        System.out.println("You want to add the product for sale, type 1. Yes or 2.Not");
        int addProduct = sc.nextInt();
        if (addProduct == 1) {
            System.out.println("Enter the amount you want to buy: ");
            int cant1 = sc.nextInt();
            try {
                presenter.addSale(product.getName(), product.getValue(), product.getStock(), product.isIva(), product.getTypeProduct(), cant1);
            } catch (Exception e) {
                System.err.println("there is not enough quantity");
            }
        }
    }
}
