package com.raj.nola.inventory.svc;

import com.raj.nola.inventory.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    public Product getProductById(int productId) {

        if (productId == 1) {
            return new Product(1, "Note Book", 10.00);
        } else if (productId == 2) {
            return new Product(2, "Pen", 5.00);

        }

        return null;
    }


}
