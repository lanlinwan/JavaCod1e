package 数据结构.hash;

public class hash {
    public static void main(String[] args) {
        //哈希值:
        //     ●根据hashCode方法算出来的int类型的整数
        //     ●该方法定义在Object类中，所有对象都可以调用，默认使用地址值进行计算
        //     ●一 般情况下，会重写hashCode方法,利用对象内部的属性值计算哈希值

        //     对象的哈希值特点:
        //     ●如果没有重写hashCode方 法，不同对象计算出的哈希值是不同的
        //     ●如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是-样的
        //     ●在小部分情况下， 不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。( 哈希碰撞)

        //重写了hashcode方法后，不同的对象只要属性值相同，计算出的哈希值就是-样的
        Student s1 = new Student("lan",20);
        Student s2 = new Student("lan",20);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //哈希碰撞
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());




    }
}
