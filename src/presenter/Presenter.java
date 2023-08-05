package presenter;

import model.ETypeProduct;
import model.Product;
import model.Sale;
import model.ServiceSale;

import java.util.ArrayList;

public class Presenter {
    private ArrayList<ServiceSale> serviceSales;
;

    public Presenter() {
        serviceSales = new ArrayList<>();
    }

    public double addSale(String name, double value, int stock, boolean iva, ETypeProduct typeProduct, int cant) {
        this.serviceSales.add(new ServiceSale(new Product(name, value, stock, iva, typeProduct), cant));
        double valueSale = 0;
        for (ServiceSale serviceSale: this.serviceSales) {
            valueSale += serviceSale.getProduct().getValue()* serviceSale.getCant();
        }
        return valueSale;
        //Llega el Produsc
        //Llega la cantidad

    }

    public String showSale() {

        double totalSale = 0;
        double discount = 0;
        double iva = 0;
        for (ServiceSale serviceSale: this.serviceSales) {
            totalSale += serviceSale.getSale().getTotalSale();
            discount += serviceSale.getSale().calcDiscount();
            iva += serviceSale.getSale().calcIva();
        }

        return "The total value of your purchase :  " + totalSale +
                "\n The IVA is:  " +discount +
                "\n The discount is: " + iva ;



    }
    //Lleva todos los datos a las clases para que funcionen
}