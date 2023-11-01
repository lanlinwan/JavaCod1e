package 面试;

//当一个对象被当作参数传递到一个方法后，此方法可改变这个对象的属性，并可返回变化后的结果，
// 那么这里到底是值传递还是引用传递？

//答:
//是值传递。Java语言的方法调用只支持参数的值传递。当一个对象实例作为一个参数被传递到方法中时，
//参数的值就是对该对象的引用。对象的属性可以在被调用过程中被改变，但对对象引用的改变是不会影响到调用者的。

public class java对象引用 {

    public static class a{
        public int age=10;
    }
    public static class b{
        public int age=99;
    }

    public static void main(String[] args) throws Exception {

        a a=new a();
        aa(a);
        System.out.println(a);
        System.out.println("a.age="+a.age);
    }



    public static void aa(a A){
        a B=new a();
        A=B;
        A.age=100;
        System.out.println(A);
        System.out.println("A.age="+A.age);
    }

}

