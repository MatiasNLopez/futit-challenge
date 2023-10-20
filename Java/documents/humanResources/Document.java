package Java.documents.humanResources;

public class Document {
    protected String title;
    protected String content;

    public Document(String titel, String content){
        this.title = titel;
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Titulo " + this.title + " content: " + this.content;
    }

}
