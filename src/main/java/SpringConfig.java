
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.phantomhunter.Cart;
import ru.phantomhunter.Product;
import ru.phantomhunter.ProductRepository;

import javax.swing.*;

@Configuration
@ComponentScan("ru.phantomhunter")
@PropertySource("classpath:shop.properties")
public class SpringConfig {


    @Value("${product1.name}") private String product1Name;
    @Value("${product1.price}") private int product1Price;
    @Value("${product2.name}") private String product2Name;
    @Value("${product2.price}") private int product2Price;
    @Value("${product3.name}") private String product3Name;
    @Value("${product3.price}") private int product3Price;
    @Value("${product4.name}") private String product4Name;
    @Value("${product4.price}") private int product4Price;
    @Value("${product5.name}") private String product5Name;
    @Value("${product5.price}") private int product5Price;

    @Bean(name = "product1")
    public Product product1(){
        return new Product(product1Name,product1Price);
    }
    @Bean(name = "product2")
    public Product product2(){
        return new Product(product2Name,product2Price);
    }
    @Bean(name = "product3")
    public Product product3(){
        return new Product(product3Name,product3Price);
    }
    @Bean(name = "product4")
    public Product product4(){
        return new Product(product4Name,product4Price);
    }
    @Bean(name = "product5")
    public Product product5(){
        return new Product(product5Name,product5Price);
    }


    @Bean(name = "productRepository")
    public ProductRepository productRepository(
            @Qualifier("product1") Product product1,
            @Qualifier("product2") Product product2,
            @Qualifier("product3") Product product3,
            @Qualifier("product4") Product product4,
            @Qualifier("product5") Product product5){
        return new ProductRepository(product1,product2,product3,product4,product5);
    }

    @Bean(name = "cart)")
    public Cart cart(){
        return new Cart();
    }
}
