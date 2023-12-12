package javaweb.JSON;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * json字符串,java对象,json对象三者之间的相互转换
 * @author sx
 * @version 1.0
 */
public class json {
    public static void main(String[] args) {
        //声明json字符串
        String s1="{'sname':'张三','sage':22,'sclass':{'cid':1,'cname':'java2306'}}";

        //json字符串转换为java对象:前提条件json字符属性名要与对象的属性名相同
        Student stu1= JSON.parseObject(s1,Student.class);
        System.out.println("student: "+stu1);

        //json字符串转换为json对象
        JSONObject jsonObject1=JSON.parseObject(s1);
        System.out.println("1.姓名为:"+jsonObject1.get("sname")+",年龄为:"+jsonObject1.get("sage")+",班级为:"+jsonObject1.get("sclass"));
        System.out.println("2.姓名为:"+jsonObject1.getString("sname")+",年龄为:"+jsonObject1.getInteger("sage")+",班级为:"+jsonObject1.getJSONObject("sclass"));

        //java对象转换为json对象
        JSONObject jsonObject2= (JSONObject) JSON.toJSON(stu1);
        System.out.println("3."+jsonObject2);

        //java对象,json对象转换为json字符串
        String s2=JSON.toJSONString(stu1);
        String s3=JSON.toJSONString(jsonObject1);

        //json对象转换Java对象:前提条件json字符属性名要与对象的属性名相同
        Student stu2=JSON.toJavaObject(jsonObject2,Student.class);
        System.out.println("4."+stu2);


        System.out.println(s2);
        System.out.println(s3);



    }
}
