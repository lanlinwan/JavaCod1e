package redis;

public class key {
    /*
        key的结构
        Redis的key允许有多个单词形成层级结构，多个单词之间用':隔开,格式如下:
        项目名:业务名:类型: id
        这个格式并非固定，也可以根据自己的需求来删除或添加词条。
        例如我们的项目名称叫heima,有user和product两种不同类型的数据，我们可以这样定义key:
        ◆user相关的key: heima:user:1
        ◆product相关的key: heima:product:1
        如果Value是- -个Java对象，例如一-个User对象,则可以将对象序列化为JSON字符串后存储:
        KEY              VALUE
        heima:user:1     {"id":1，"name"': "Jack"， "age": 21}
        heima:product:1  {"id":1, "name"': "小米11"， "price": 4999}

     */
}
