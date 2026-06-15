public class Item{
    private final String name;
    private final Category category;
    private final int quantity;
    private final double unitPrice;

    Item(String name, Category Category, int quantity, double unitPrice){
        this.name = name;
        this.Categoty = category;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getName{
        return tname;
    }

    public Category getCategory{
        return category;
    }  

    public int getQuantity{
        return quantity;
    }

    public double getUnitPrice{
        return getUnitPrice;
    }

    public double totalPrice{
        return quantity * unitPrice;
    }
}