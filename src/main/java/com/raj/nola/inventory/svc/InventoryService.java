package com.raj.nola.inventory.svc;

import com.raj.nola.inventory.model.Inventory;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class InventoryService {

   public Inventory getInventoryByProductId(int productId) {

       if (productId == 1) {

            return new Inventory(1, 10, LocalDate.of(2021, 01, 20));

        } else if (productId == 2) {

            return new Inventory(2, 20, LocalDate.of(2021, 01, 20));
        }

        return null;

    }
}
