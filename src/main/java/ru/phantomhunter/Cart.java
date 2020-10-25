package ru.phantomhunter;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private List<Product> cartListProducts = new ArrayList<>();
    private static int idProduct=0;
    private int id;

    public Cart() {
        this.id = idProduct++;
    }

    public List<Product> getCartListProducts() {
        return cartListProducts;
    }

    public void addInCart(int id) {
        for (Product one : ProductRepository.products) {
            if (one.getId() == id) {
                cartListProducts.add(one);
            }
        }
    }

    public void deleteFromCart(int id) {
        for (int i = 0; i < cartListProducts.size(); i++) {
            if (cartListProducts.get(i).getId() == id) {
                cartListProducts.remove(i);
            }
        }
    }
    public void InfoCart(){
        System.out.println("Cart "+ id + " contains: ");
        for (Product x:cartListProducts) {
            System.out.println(x.InfoProduct());
        }
        System.out.println("**************");
    }
}
