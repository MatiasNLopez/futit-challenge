package Java.documents;

public class UrgentOrder extends Order {
    private String detail;

    public UrgentOrder(int id, String detail) {
        super(id);  // Llama al constructor de la clase base
        this.detail = detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public String toString() {
        return "Order " + getId() + " Detail: " + this.detail;
    }
}