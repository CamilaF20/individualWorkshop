package model;

public class ServiceSale {
    private Product product;
    private Sale sale;
    private int cant;

    public ServiceSale(Product product, int cant) {
        this.product = product;
        this.cant = cant;
        this.sale = new Sale(this.cant, this.product);
    }
//xepcion cuando la cantidad es mayor al estock

    public Product getProduct() {
        return product;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public int getCant() {
        double valueSale = this.sale.getTotalSale();
        return 0;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
