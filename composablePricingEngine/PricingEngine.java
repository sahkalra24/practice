import java.util.List;

class PricingEngine {
    private final List<PromotionRule> rules;

    public PricingEngine(List<PromotionRule> rules){
        this.rules = rules;
    }

    public double calculate(Cart cart){
        double total = cart.subTotal() + cart.getDeliveryCharge();

        try{
            for(PromotionRule rule: rules){
                total = rule.apply(cart, total);
            }
        }catch(DiscountNotApplicableException e){
            return total;
        }

        return total;
    }

}