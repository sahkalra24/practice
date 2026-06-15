class CouponDiscountRule implements PromotionRule{
    @Override
    public double apply(Cart cart, double current currentTotal){
        if("SAVE20".equals(cart.getCouponCode())) 
            return currentTotal*0.80;
        return currentTotal;
    }

}