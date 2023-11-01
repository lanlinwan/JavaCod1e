package mybatis;

public class user {
    private Integer id     ;
    private String name   ;
    private Integer age    ;
    private String contact;
    private String hobby  ;

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

    @Override
    public String toString() {
        return "mybatis.user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
