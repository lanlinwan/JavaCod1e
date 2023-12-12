package MysqlS.Mapper代理开发;

public class main {
    //MysqlS.Mapper代理开发:
    //➢解决原生方式中的硬编码
    //➢简化后期执行SQL

    //1.执行sqL
    //List<User> users = sqLSession. selectList( statemert: "test . selectAl"); .
    //System. out . printLn(users);

    //2.获取接口代理对象
    //UserMapper userMapper = sqlSession. getMapper(UserMapper . cLass);
    //.执行方法，其实就是执行sqL 语句
    //List<User> users = userMapper.selectALl();


    //Mapper代理开发步骤:
    //使用Mapper代理方式完成入i门]案例.
    //1.定义与SQL映射文件同名的Mapper接口，并且将Mapper接口和SQL映射文件放置在同一目录下
    //2.设置SQL映射文件的namespace属性为Mapper接口全限定名
    //3.在Mapper接口中定义方法，方法名就是SQL映射文件中sq|语句的id, 并保持参数类型和返回值类型一致
    //4.编码
    //      1.通过SqlSession 的getMapper方法获取Mapper接口的代理对象
    //      2.调用对应方法完成sqI的执行
    //
    //细节:如果Mapper接口名称和SQL映射文件名称相同，并在同1目录下，则可以使用包扫描的方式简化SQL映射文件的加载

//  <mappers>
//            <!--加载sql映射文件-->
//            <!--<mapper resource="mapper/userMapper.xml"/>-->
//
//           <!--mapper代理方式-->
//          <package name="mapper"/>
//  </mappers>

}
