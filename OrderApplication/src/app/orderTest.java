package app;

import orderapplication.Order;
import orderapplication.OrderItem;
import orderapplication.Product;


public class orderTest {
    public static void main(String[] args) {
        
        Product product = new Product();
        
        
        Product Ciki = new Product ("Ciki",10000.0);
        Product Jeruk = new Product ("Jeruk",7000.0);
        Product Mangga = new Product ("Mangga",5000.0);
        // Kasir Menghitung dan menginput barang yang di beli
        // disimpan dalam order
        OrderItem CikiCitato = new OrderItem(Ciki, 5, 0.01);
        OrderItem JerukManis = new OrderItem(Jeruk, 20, 0.01);
        OrderItem ManggaManis = new OrderItem(Mangga, 10, 0);
        
        OrderItem[] items = {CikiCitato,JerukManis,ManggaManis};
        // seuluruh item di proses dalam mesin karir
        Order order = new Order();
        order.setOrderItems(items);
        
        System.out.println("Nama \t\t Nama Barang \t\t harga");
        System.out.println("------------------------------------------------------------");
        for (OrderItem item : items) {
            System.out.println(item.getProduct().getProductName());    
        }
        double totalBelanja = order.calculateTotalOrder();
        System.out.printf("Total Belanja: Rp %,.2f \n", totalBelanja);
        double totalBelanja1 = order.calculateTotalOrderWithDiscount();
        System.out.printf("Total Belanja Setelah Discount: Rp %,.2f \n", totalBelanja1);
        double PPN = order.valueAfterPPN();
        System.out.printf("Total Belanja Setelah PPN: Rp %,.2f \n", totalBelanja1 + PPN);
//        System.out.println("----------------------------------------------");
//        System.out.printf("Anda Hemat: Rp %,.2f \n ", totalBelanja - totalBelanja1);
//         
    }
    
}
