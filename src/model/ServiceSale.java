package model;

public class ServiceSale {
    private Product product;
    private Sale sale;
    private int cant;

    public ServiceSale(Product product, int cant) throws Exception {
        this.product = product;
        this.cant = cant;
        if((product.getStock() - cant) >= 0) {
            this.sale = new Sale(this.cant, this.product);
        }
        else {
            throw new Exception("Icorrect value");
        }

    }
//xepcion cuando la cantidad es mayor al estock

    public Product getProduct() {

        return product;
    }

    public Sale getSale() {

        return sale;
    }

    public void setSale(Sale sale)
    {
        this.sale = sale;
    }

    public int getCant() {
        return this.cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
