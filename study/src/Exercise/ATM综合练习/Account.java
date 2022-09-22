package Exercise.ATM综合练习;
//账户类
public class Account {
    //成员变量,私有
    private String id;
    private String name;//用户名
    private String password;//密码
    private  double money;//账户余额
    private  double quotamoney;//单次取现额度

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotamoney() {
        return quotamoney;
    }

    public void setQuotamoney(double quotamoney) {
        this.quotamoney = quotamoney;
    }
}
