public class Main{
    public static void Main(String[] args){
        Cart cart = new Cart(
            List.of(
                new Item(
                    "Tshirt",
                    Category.CLOTHING,
                    4,
                    200
                ),
                new Item(
                    "Headphones",
                    Category.ELECTRONICS,
                    1,
                    1000
                )
            ),
            50,
            "LOYAL_123"
            "SAVE20"
        );

        PricingEngine engine = new PricingEngine(
                List.of(
                    new MinimumOrderRule(),
                    new BulkDiscountRule(),
                    new CategoryDiscountRule(),
                    new CouponDiscountRule(),
                    new LoyaltyDiscountRule()
                )
        );

        double finalPrice = engine.calculate(cart);

        System.out.println(finalPrice);
    }
}