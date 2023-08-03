package com.shoppingpro.orderservice.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {

    private String skuCode;

    private Boolean isInStock;
}
