package orderapplication;
public class Order {
    
      private OrderItem[] orderItems;
      private final double PPN = 0.1;

      public double calculateTotalOrder() {
          double totalOrder = 0.0;
          for (OrderItem orderItem : orderItems) {
              totalOrder += orderItem.calculateItemTotalPrice();
          }
          return totalOrder;
      }
      
      public double calculateTotalOrderWithDiscount() {
          double totalOrder = 0.0;
          for (OrderItem orderItem : orderItems) {
              totalOrder += orderItem.valueAfterDiscount();
          }
          return totalOrder;
      }
      
      public double valueAfterPPN(){
          double hargaSetelahPPN = calculateTotalOrderWithDiscount() * PPN;
          return hargaSetelahPPN;
      }
            
      
    public Order() {
    }

    public Order(OrderItem[] orderItems) {
        this.orderItems = orderItems;
    }
      
      

    /**
     * @return the orderItems
     */
    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    /**
     * @param orderItems the orderItems to set
     */
    public void setOrderItems(OrderItem[] orderItems) {
        this.orderItems = orderItems;
    }
}
