package Java;

import Java.documents.Invoice;
import Java.documents.Order;
import Java.documents.UrgentOrder;

/* Crea objetos del paquete documents */

public class Main {
    public static void main(String[] args) {
         Invoice invoice = new Invoice(100, "Product A");
         Order order = new Order(1);
         Order urgentOrder = new UrgentOrder(2,"Urgent");

         System.out.println(invoice);
         System.out.println(order);
         System.out.println(urgentOrder);
    }
}
