package com.formadoresit.camel.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Item {
    private String name;
    private double amount;
}
