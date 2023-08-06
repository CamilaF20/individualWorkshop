package model;

public class Sale {
    private int cant;
    Product product;

    public Sale(int cant, Product product) {
        super();
        this.cant = cant;
        this.product = product;
        product.setStock(product.getStock() - cant);
    }

    public double getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;

    }
    public double calcDiscount(){
        double discount = 0;
        if(cant >= 5 && cant <= 10 ){
            discount = ((this.product.getValue()*this.cant)*5)/100;
        }else if (cant >= 11 && cant <= 20 ){
            discount = ((this.product.getValue()*this.cant)*10)/100;
        } else if (cant >= 21 && cant <= 50 ){
            discount = ((this.product.getValue()*this.cant)*15)/100;
        } else if (cant >= 50 ){
            discount = ((this.product.getValue()*this.cant)*30)/100;
        }
        return discount;
    }
    public double getTotalSale(){
        double totalSale = ((this.product.getValue()* this.cant)-calcDiscount())+calcIva();
        return totalSale;
    }
    public double calcIva(){
        double valIva = 0;

        switch (product.getTypeProduct()){

            case ASEO:
                valIva = (product.getValue()*this.cant)* 0.14;
                break;

            case RANCHO:

            case LICORES:
                valIva = (product.getValue()*this.cant) * 0.19;
                break;

            case MEDICINAS:
                valIva = (product.getValue()*this.cant)* 0;
                break;

            case VIVERES:
                valIva = product.getValue() * 0.8;
                break;

            default:
                   valIva = 0.0;
        };

        return  valIva;
    }

}
