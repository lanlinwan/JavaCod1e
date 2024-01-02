package MysqlS.MyBatis;

public class 缓存 {
    /*
      1、MyBatis的- -级缓存
          --级缓存是SqISession级别的，通过同一个SqISession查询的数据会被缓存，下次查询相同的数据, 就会从缓存中
          直接获取,不会从数据库重新访问
      一级缓存失效的四种情况:
          1)不同的SqISession对应不同的一级缓存
          2)同一个SqISession但是查询条件不同
          3)同一个SqISession两次查询期间执行了任何一次增删改操作
          4)同一个SqISession两次查询期间手动清空了缓存
      2、MyBatis的 二级缓存
          二级缓存是mapper namespace级别，通过同一个 namespace创建的SqlSession查询的结果会被缓存;此后
          若再次执行相同的查询语句，结果就会从缓存中获取
     二级缓存开启的条件:
          a>在核心配置文件中，设置全局配置属性cacheEnabled="true",默认为true,不需要设置
          b>在映射文件中设置标签<cache />
          c>二级缓存必须在SqlSession关闭或提交之后有效
          d>查询的数据所转换的实体类类型必须实现序列化的接口
      使二级缓存失效的情况: .
          两次查询之间执行了任意的增删改，会使一级和二级缓存同时失效
       3、二级缓存的相关配置
         在mapper配置文件中添加的 <cache/> 标签可以设置-一些属性:
            ●eviction属性: 缓存回收策略
              LRU (Least Recently Used) - 最近最少使用的:移除最长时间不被使用的对象。
              FIFO (First in First out) - 先进先出:按对象进入缓存的顺序来移除它们。
              SOFT -软引用:移除基于垃圾回收器状态和软引用规则的对象。
              WEAK -弱引用:更积极地移除基于垃圾收集器状态和弱弓|用规则的对象。
             默认的是LRU.
            ●flushInterval属性: 刷新间隔，单位毫秒
              默认情况是不设置，也就是没有刷新间隔，缓存仅仅调用语句时刷新
            ●size属性:引用数目，正整数
              代表缓存最多可以存储多少个对象，太大容易导致内存溢出
            ●readOnly属性: 只读, true/false
              true:只读缓存;会给所有调用者返回缓存对象的相同实例。因此这些对象不能被修改。这提供了很重要的性 能优势。
              false:读写缓存;会返回缓存对象的拷贝(通过序列化)。这会慢一些, 但是安全，因此默认是false.

       4、MyBatis缓存查询的顺序I
          ●先查询二级缓存,因为二级缓存中可能会有其他程序已经查出来的数据，可以拿来直接使用。
          ●如果二级缓存没有命中，再查询一级缓存
          ●如果一级缓存也没有命中，则查询数据库
          ●SqlSession关闭之后，-级缓存中的数据会写入二级缓存










     */
}
