package presenter;

import model.ETypeProduct;
import model.Product;
import model.Sale;
import model.ServiceSale;

import java.util.ArrayList;

public class Presenter {
    public Sale sale;
    private ArrayList<ServiceSale> serviceSales;
    public Product acetaminophen = new Product("Acetaminophen", 15000, 50, false, ETypeProduct.MEDICINAS);
    public Product ron = new Product("Ron", 50000, 30, true, ETypeProduct.LICORES);
    public Product soap = new Product("Soap", 2000, 40, true, ETypeProduct.ASEO);
    public Product shampoo = new Product("Shampoo", 20000, 20, true, ETypeProduct.ASEO);
    public Product cornmeal = new Product("Cornmeal", 3000, 30, true,ETypeProduct.VIVERES);
    public Presenter() {
        serviceSales = new ArrayList<ServiceSale>();
    }


    public double addSale(String name, double value, int stock, boolean iva, ETypeProduct typeProduct, int cant) throws Exception {
        if(name.equals(acetaminophen.getName())) {
            this.serviceSales.add(new ServiceSale(acetaminophen, cant));
        }
        if(name.equals(ron.getName())){
            this.serviceSales.add(new ServiceSale(ron, cant));
        }
        if(name.equals(soap.getName())) {
            this.serviceSales.add(new ServiceSale(soap, cant));
        }
        if(name.equals(shampoo.getName())) {
            this.serviceSales.add(new ServiceSale(shampoo, cant));
        }
        if(name.equals(cornmeal.getName())) {
            this.serviceSales.add(new ServiceSale(cornmeal, cant));
        }

        double valueSale = 0;
        for (ServiceSale serviceSale : this.serviceSales) {
            valueSale += serviceSale.getProduct().getValue() * serviceSale.getCant();

        }

        return valueSale;
    }

    public String showSale() {

        double totalSale = 0;
        double discount = 0;
        double iva = 0;

        String facture = "------ Products ----- \n";
        for (ServiceSale serviceSale : this.serviceSales) {
            totalSale += serviceSale.getSale().getTotalSale();
            discount += serviceSale.getSale().calcDiscount();
            iva += serviceSale.getSale().calcIva();
            facture += serviceSale.getProduct().toString() + " Cant "+ serviceSale.getCant() +"\n";
        }
        return facture + "\n The total value of your purchase :  " + totalSale +
                "\nThe IVA is:  " + discount +
                "\nThe discount is: " + iva;
    }
}