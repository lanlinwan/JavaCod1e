package mybatis;

public class books {
    int id;
    String type;
    String name;
    String description;
    book bok;

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "book1{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", book=" + bok +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public mybatis.book getBook() {
        return bok;
    }

    public void setBook(mybatis.book book) {
        this.bok = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
