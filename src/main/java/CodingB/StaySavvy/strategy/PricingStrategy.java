package CodingB.StaySavvy.strategy;



import CodingB.StaySavvy.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
