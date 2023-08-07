package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SaleTest {
    private Sale sale;
    Product soap;
    Product vodka;
    Product acetaminophen;

    @Before
    public void setUp(){
    soap = new Product("Soap", 2000, 30, true, ETypeProduct.ASEO);
    vodka = new Product("Vodka", 80000,40, true, ETypeProduct.LICORES);
    acetaminophen = new Product("Acetaminophen", 15000, 35, true, ETypeProduct.MEDICINAS);
    }
    @Test
    public void testStock(){
        sale = new Sale(20, soap);
        assertEquals(10, soap.getStock(), 0.1);
    }
    @Test
    public void testCalcDiscount(){
        setUp();
        sale = new Sale(10, soap);
        assertEquals(1000,sale.calcDiscount(),0.1);

    }
    @Test
    public void testCalcIva(){
        setUp();
        sale = new Sale(10,soap);
        assertEquals(2800,sale.calcIva(),0.1);
    }
    @Test
    public void testGetTotalSale(){
        setUp();
        sale = new Sale(10,soap);
        assertEquals(21800, sale.getTotalSale(),0.1);

    }

}
