package Java.documents;

public class Invoice {
    private int cost;
    private String name;

    public Invoice(int cost, String name){
        this.cost = cost;
        this.name = name;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Invoice "+this.name+" Price: "+cost;
    }
}
