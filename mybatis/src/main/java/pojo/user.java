package pojo;

import java.io.Serializable;
import java.util.List;

public class user implements Serializable {
    private Integer id     ;
    private String name   ;
    private Integer age    ;
    private String contact;
    private String hobby  ;
    List<book> list;
    book book;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                ", hobby='" + hobby + '\'' +
                ", list=" + list +
                ", book=" + book +
                '}';
    }

    public pojo.book getBook() {
        return book;
    }

    public void setBook(pojo.book book) {
        this.book = book;
    }

    public List<book> getList() {
        return list;
    }

    public void setList(List<book> list) {
        this.list = list;
    }

    public user(Integer id, String name, Integer age, String contact, String hobby, List<book> list) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.hobby = hobby;
        this.list = list;
    }

    public user() {
    }

    public user( String name, Integer age, String contact, String hobby) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.hobby = hobby;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
