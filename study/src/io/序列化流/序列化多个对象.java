package io.序列化流;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class 序列化多个对象 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化 批量添加
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("B:aaaa.txt"));
        Person p=new Person("lan",20);
        Person p1=new Person("la",22);
        Person p2=new Person("l",22);
        ArrayList<Person> list1=new ArrayList<>();
        list1.add(p);
        list1.add(p1);
        list1.add(p2);
        out.writeObject(list1);

        out.close();

        //反序列化 毗连
        ObjectInputStream put=new ObjectInputStream(new FileInputStream("B:aaaa.txt"));
        ArrayList<Person> list=new ArrayList<>();
        list= (ArrayList<Person>) put.readObject();

        for (Person per:list){
            System.out.println(per);
        }
    }

}
