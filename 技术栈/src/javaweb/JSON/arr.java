package javaweb.JSON;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.List;

/**
 * 3.2:Json数组字符串,java集合,json数组三者之间相互转换
 * @author sx
 * @version 1.0
 */
public class arr {
    public static void main(String[] args) {
        //声明json数组字符串
        String s1="[{'sname':'范冰冰','sage':33,'sclass':{'cid':1,'cname':'java2301'}},{'sname':'李冰冰','sage':38,'sclass':{'cid':2,'cname':'java2302'}}]";

        //Json数组字符串转换为java集合,前提:json数组中对象的属性与java对象的属性一一对应.
        List<Student> studentList1= JSON.parseArray(s1,Student.class);
        studentList1.forEach((e)-> System.out.println(e));
        System.out.println("1-------------------------------------");

        //Json数组字符串转换为json数组
        JSONArray array1=JSON.parseArray(s1);
        array1.forEach((e)-> System.out.println(e));
        System.out.println("2-------------------------------------");

        //java集合转换为json数组
        //JSONArray array2=JSON.parseArray(JSON.toJSONString(studentList1));
        //JSONArray array2=new JSONArray(Collections.singletonList(studentList1));
        JSONArray array2= (JSONArray) JSON.toJSON(studentList1);

        array2.forEach((e)-> System.out.println(e));
        System.out.println("3-------------------------------------");

        //Json数组转换为java集合,前提:json数组中对象的属性与java对象的属性一一对应.
        List<Student> studentList2= array1.toJavaList(Student.class);

        studentList2.forEach((e)-> System.out.println(e));
        System.out.println("4-------------------------------------");

        //java集合,json数组转换为json数组字符串
        String s2=JSON.toJSONString(studentList2);
        String s3=JSON.toJSONString(array2);
        System.out.println(s2);
        System.out.println(s3);
    }
}

