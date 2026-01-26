package com.CodingB.StaySavvy.strategy;



import com.CodingB.StaySavvy.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
