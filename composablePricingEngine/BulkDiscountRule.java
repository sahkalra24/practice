class BulkDiscountRule implements PromotionRule{
    @Override
    public double apply(Cart cart, double currentTotal){
        double discount = cart.getItems.stream()
            .filter(item->item.getQuantity()>=3)
            .mapToDouble(i->i.totalPrice*0.10)
            .sum()

        return currentTotal - discount;
    }
}