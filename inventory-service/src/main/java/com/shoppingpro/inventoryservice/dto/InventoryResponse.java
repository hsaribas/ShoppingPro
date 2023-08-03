package com.shoppingpro.inventoryservice.dto;

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
