package 作业;

public class nodeid {
    private final String value ;
    //自定义构造函数   NodeId ( 参数列表 传入1个参数)
    public nodeid(String value){
        preconditions.checkNotNull(value);
        this.value = value;
        System.out.println("创建了一个NodeId对象");
    }
}
