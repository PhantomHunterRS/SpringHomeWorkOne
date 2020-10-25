package ru.phantomhunter;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Product {
    private static int idProduct=1;
    private int id;
    private String nameProduct;
    private int price;

    public Product(String nameProduct, int price) {
        this.id = idProduct++;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public Product() {
        this.id = idProduct++;
    }

    public int getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String InfoProduct(){
        return id + " " + nameProduct + " " + price;
    }
}
