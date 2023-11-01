package 高级;

public class 依赖 {
    //依赖管理
    //●依赖传递
    // 依赖具有传递性
    // 直接依赖:在当前项目中通过依赖配置建立的依赖关系
    // 间接依赖:被资源的资源如果依赖其他资源，当前项目间接依赖其他资源

    //●依赖传递冲突问题
    // 路径优先:当依赖中出现相同的资源时，层级越深，优先级越低，层级越浅，优先级越高
    // 声明优先:当资源在相同层级被依赖时,配置顺序靠前的覆盖配置顺序靠后的
    // 特殊优先:当同级配置了相同资源的不同版本，后配置的覆盖先配置的

    //●可选依赖
    //可选依赖指对外隐藏当前所依赖的资源一不透明
    // <dependency>
    //   <groupId>com. itheima</groupId>
    //   <artifactId>maven_ _03_ _pojo</artifactId>
    //   <version>1.0-SNAPSHOT</version>
    //   <!--可选依赖是隐藏当前工程所依赖的资源，隐藏后对应资源将不具有依赖传递性-->
    //   <optional>false</ optional>
    // </dependency>

    //●排除依赖
    // 排除依赖指主动断开依赖的资源，被排除的资源无需指定版本一不需要
    // <dependency>
    //  <groupId>com.itheima</ groupId>
    //  <artifactId>maven_ 04_ _dao</ artifactId>
    //  <version>1.0- SNAPSHOT</version>
    //  <!--排除依赖是隐藏当前资源对应的依赖关系-->
    //   <exclusions>
    //    <exclusion>
    //       <groupId> 1og4j</ groupId>
    //       <artifactId>1og4j</artifactId>
    //    </exclusion>
    //   </exclusions>
    // </dependency>
    //●排除依赖资源仅指定GA即可，无需指定V

}
