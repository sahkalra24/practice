class LoyaltyDiscountRule implements PromotionRule{
    @Override
    double apply(Cart cart, double currentTotal){
        if(cart.getCustomerId() != null && 
            cart.getCustomerId.startWith("LOYAL_"))
            return currentTotal*0.95;
        return currentTotal;
    }
}