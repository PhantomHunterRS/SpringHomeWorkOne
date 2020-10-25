package ru.phantomhunter;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    public static List<Product> products = new ArrayList<>();

    public ProductRepository(Product product1,Product product2,Product product3,Product product4,Product product5) {
        setProducts(product1);
        setProducts(product2);
        setProducts(product3);
        setProducts(product4);
        setProducts(product5);

    }
    public void setProducts(Product product){
        products.add(product);
    }
    public List<Product> getProducts() {
        return products;
    }
    public Product searchId(int id){
        for (Product one: products) {
            if(one.getId() == id){
                return one;
            }
        }
        return null;
    }
}
