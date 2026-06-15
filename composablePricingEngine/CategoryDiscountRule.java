class CategoryDiscountRule implements PromotionRule{
    @Override
    double apply(Cart cart, Double currentTotal){
        double discount = cart.getItems.stream()
            .filter(i->i.getCategory() == Category.CLOTHING)
            .filter(i->i.getQuantity>=3)
            .mapToDouble(i->i.totalPrice()*0.15)
            .sum();
        
        return currentTotal - discount;
    }
}