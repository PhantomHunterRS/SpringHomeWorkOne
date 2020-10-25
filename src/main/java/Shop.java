import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.phantomhunter.Cart;

import java.sql.SQLOutput;


public class Shop {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cart cart1 = context.getBean("cart",Cart.class);
        System.out.println("New Cart");
        cart1.addInCart(1);
        cart1.addInCart(2);
        cart1.addInCart(5);
        cart1.addInCart(3);
        cart1.InfoCart();
        cart1.deleteFromCart(1);
        cart1.deleteFromCart(5);
        cart1.InfoCart();
        System.out.println("New Cart");
        Cart cart2 = context.getBean("cart",Cart.class);
        cart2.addInCart(5);
        cart2.addInCart(2);
        cart2.addInCart(1);
        cart2.InfoCart();
        cart2.deleteFromCart(1);
        cart2.addInCart(3);
        cart2.InfoCart();

    }
}
