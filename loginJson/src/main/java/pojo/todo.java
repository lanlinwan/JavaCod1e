package pojo;

public class todo {
    private int id;
    private String title;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
