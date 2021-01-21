package com.raj.nola.inventory.web.rest;

import com.raj.nola.inventory.model.Inventory;
import com.raj.nola.inventory.model.Product;
import com.raj.nola.inventory.model.ProductInventory;
import com.raj.nola.inventory.svc.InventoryService;
import com.raj.nola.inventory.svc.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api")
public class ProductInventoryController {

    @Autowired
    ProductService productSvc;

    @Autowired
    InventoryService inventorySvc;

    @GetMapping("product/{productId}")
    public Product getProductById(@PathVariable("productId") int id) {

        return productSvc.getProductById(id);
    }

    @GetMapping("inventory/{productId}")
    public Inventory getInventoryById(@PathVariable("productId") int id) {

        return inventorySvc.getInventoryByProductId(id);
    }

    @GetMapping("productInventory/{productId}")
    public ProductInventory getProductInvntory(@PathVariable("productId") int id) {


        CompletableFuture<Product> productDetails = CompletableFuture
                .supplyAsync(() -> productSvc.getProductById(id));

        CompletableFuture<Inventory> inventoryDetails = CompletableFuture
                .supplyAsync(() -> inventorySvc.getInventoryByProductId(id));

        ProductInventory pf = productDetails.
                thenCombine(inventoryDetails,(product,inventory)->new ProductInventory(product,inventory)).join();

        return pf;
    }

}
