/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.clasexml.resteasyprueba.implementation;

import co.com.clasexml.resteasyprueba.contact.ProductServices;
import co.com.clasexml.resteasyprueba.entities.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jaro
 */
public class ProductSericesImpl implements ProductServices {

    public List<Product> products;
    
    {
        products = new ArrayList<Product>() {
            {
                add(new Product("10", "MADERA", 100d));
                add(new Product("20", "MESA", 200d));
                add(new Product("30", "CAMAS", 300d));
            }
        };
    }
    
    public List<Product> getProducts() {
        return products;
    }

    public Product getProducts(String code) {
        for (Product product : products) {
            if(product.getCode().equals(code)) {
                return product;
            }
        }
        return null;
    }

    public void updateProduct(Product product) {
        System.out.println(product);
    }

    public void create(String code, String name, double cost) {
        // TODO por corregir
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
