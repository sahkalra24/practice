public class Cart{
    private final List<Item> items = new ArrayList<>();
    private final double deliveryCharge;
    private final String customerId;
    private final String couponCode;

    public Cart(List<Item> items, doulbe deliveryCharge, String customerId, String couponCode){
        this.item = items;
        this.deliveryCharge = deliveryCharge;
        this customerId = customerId;
        this.couponCode = couponCode;
    }

    public List<String> getItems(){
        return items;
    }

    public double getDeliveryCharge(){
        return deliveryCharge;
    }

    public String getCustomerId(){
        return customerId;
    }

    public String getCouponCode(){
        return couponCode;
    }

    public double subTotal(){
        return items.stream()
            .mapToDouble(Item::totalPrice)
            .sum();
    }
}