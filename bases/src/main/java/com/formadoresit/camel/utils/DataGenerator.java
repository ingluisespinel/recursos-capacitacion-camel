package com.formadoresit.camel.utils;

import com.formadoresit.camel.domain.Item;
import com.formadoresit.camel.domain.Order;
import com.formadoresit.camel.domain.OrderStatus;
import org.apache.camel.util.StreamUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Esta clase solo tiene como objetivo generar datos
 * para pruebas en los flujos de integración con Apache Camel
 */
public class DataGenerator {
    private final Random random;

    public DataGenerator(){
        random = new Random();
    }

    public List<Order> generateOrders(){
        var orders = new ArrayList<Order>();
        for (int i = 1; i <= 10; i++) {
            var order = Order.builder()
                    .id(i + 10)
                    .status(OrderStatus.CREATED)
                    .items(List.of(generateItem(i)))
                    .build();
            orders.add(order);
        }
        return orders;
    }

    private Item generateItem(int index){
        return Item.builder()
                .name("Item " + index)
                .amount(random.nextInt(1000) + 1)
                .build();
    }
}
