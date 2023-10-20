package Java.documents;

public class Order {
    protected int id;
    
    public Order(int id){
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public int getId() {
        return id;
    }
    
    public String toString(){
        return "Order "+this.id;
    }
}