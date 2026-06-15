class MinimumOrderRule implements PromotionRule{
    @Override
    double apply(Cart cart, double currentTotal){
        if(cart.subTotal() < 500) throw new DiscountNotApplicableException();

        return currentTotal;
    }
}