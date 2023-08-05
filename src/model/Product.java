package model;

public class Product {

    private ETypeProduct typeProduct;
    private String name;
    private double value;
    private int stock;
    private boolean iva;
    public int STOCK_MIN = 10;

    public Product(String name, double value, int stock, boolean iva, ETypeProduct typeProduct) {
        this.name = name;
        this.value = value;
        this.stock = stock;
        this.iva = iva;
        this.typeProduct = typeProduct;
    }

    public ETypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(ETypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Product{" +
                "typeProduct=" + typeProduct +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", stock=" + stock +
                ", iva=" + iva +
                ", STOCK_MIN=" + STOCK_MIN +
                '}';
    }
}

