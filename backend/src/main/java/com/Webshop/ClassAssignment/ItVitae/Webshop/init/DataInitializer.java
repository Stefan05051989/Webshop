package com.Webshop.ClassAssignment.ItVitae.Webshop.init;

import com.Webshop.ClassAssignment.ItVitae.Webshop.dtos.product.ProductCreateDTO;
import com.Webshop.ClassAssignment.ItVitae.Webshop.dtos.user.UserCreateDTO;
import com.Webshop.ClassAssignment.ItVitae.Webshop.repositories.UserRepository;
import com.Webshop.ClassAssignment.ItVitae.Webshop.services.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DataInitializer {

    private final UserService userService;
    private final UserRepository userRepository;

    public DataInitializer(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void createData() {
        // USERS
        userService.registerUser(new UserCreateDTO("Thomas","Webshop",List.of("ROLE_ADMIN","ROLE_USER"), "thomas_webshop@webshop.nl","password123","2000XX","4A","Javakade"));
        userService.registerUser(new UserCreateDTO("Arne","Webshop",List.of("ROLE_ADMIN","ROLE_USER"), "arne_webshop@webshop.nl","password123","2000XX","4A","MieMangKade"));
        userService.registerUser(new UserCreateDTO("Siem","Webshop",List.of("ROLE_USER"), "siem_webshop@webshop.nl","password123","3000XX","80","Surinamekade"));
        userService.registerUser(new UserCreateDTO("Stefan","Webshop",List.of("ROLE_USER"), "stefan_webshop@webshop.nl","password123","3000XX","80","Javastraat"));

//        // Products
//        productService.createProduct(new ProductCreateDTO("TRUCK-001", "Independent Stage 11", "139mm hollow trucks", "Independent", 54.95f, false, 0f));
//        productService.createProduct(new ProductCreateDTO("DECK-001", "Element Section", "Classic 8.0 inch deck met medium concave", "Element", 59.95f, false, 0f));
//        productService.createProduct(new ProductCreateDTO("WHEEL-001", "Spitfire Formula Four", "52mm 99a classic shape", "Spitfire", 42.95f, false, 0f));
//        productService.createProduct(new ProductCreateDTO("SHIRT-001", "Thrasher Skate Mag Tee", "Klassiek flame logo t-shirt", "Thrasher", 34.95f, false, 0f));
//        productService.createProduct(new ProductCreateDTO("HOOD-001", "Vans Classic Hoodie", "Pullover hoodie met logo", "Vans", 69.95f, true, 25f));
//
//        // products size + color
//        productPropertiesService.createProductProperties(new ProductPropertiesCreateDTO(10, 16L, List.of(Map.of("attribute", "size", "value", "S"), Map.of("attribute", "color", "value", "Black"))));
//        productPropertiesService.createProductProperties(new ProductPropertiesCreateDTO(10, 16L, List.of(Map.of("attribute", "size", "value", "M"), Map.of("attribute", "color", "value", "White"))));
//
//        // accesiores
//        productPropertiesService.createProductProperties(new ProductPropertiesCreateDTO(100, 20L, List.of()));
//        productPropertiesService.createProductProperties(new ProductPropertiesCreateDTO(80, 21L, List.of()));
//
//        // shopping cart
//        shoppingCartService.createShoppingCart(new ShoppingCartCreateDTO(3L));
//
//        // cart items - cart id 1
//        cartItemService.createCartItem(new CartItemCreateDTO(1L, 1L, 1));
//        cartItemService.createCartItem(new CartItemCreateDTO(1L, 6L, 1));
//
//        // cart id 2
//        cartItemService.createCartItem(new CartItemCreateDTO(2L, 16L, 2));
//        cartItemService.createCartItem(new CartItemCreateDTO(2L, 18L, 1));
    }
}
