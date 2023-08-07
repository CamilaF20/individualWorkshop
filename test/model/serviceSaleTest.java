package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class serviceSaleTest {
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
    public void tstProduct(){
     }
}
