package orderapplication;

public class OrderItem {
    
    
    private Product product;
    private int quantity;
    private double discount;
    
    public OrderItem() {
    }

    public OrderItem(Product product, int quantity, double discount) {
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
    }
    
    public double calculateItemTotalPrice(){
        double totalPrice = this.product.getPrice() * this.quantity;
        return totalPrice;
    }

    public double discountItemValue(){
        double diskon = calculateItemTotalPrice() * this.discount;
        return diskon;
    }
    public double valueAfterDiscount(){
        double valueAfterDisc = calculateItemTotalPrice() - discountItemValue();
        return valueAfterDisc;
    }
    
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
