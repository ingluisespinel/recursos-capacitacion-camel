package com.formadoresit.camel.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Order {
    private int id;
    private OrderStatus status;
    private List<Item> items;
}
