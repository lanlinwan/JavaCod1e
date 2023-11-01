package Maven;

public class 依赖 {
    /*
        1.依赖传递:依赖具有传递性
            ●直接依赖:在当前项目中通过依赖配置建立的依赖关系
            ●间接依赖: 被资源的资源如果依赖其他资源，当前项目间接依赖其他资源


        2.依赖管理:
            ●通过设置坐标的依赖范围(scope)， 可以设置对应jar包的作用范围:编译环境、测试环境、运行环境

        依赖范围    编译classpath    测试classpath   运行classpath    例子
        compile        Y                Y              Y        logback
        test           -                Y              -          Junit
        provided       Y                Y              -         servlet-api
        runtime        -                Y              Y         jdbc驱动
        system         Y                Y              -        存储在本地的jar包
        import                引入DependencyManagement

        <scope>默认值: compile

        3.依赖传递冲突问题:
        ●路径优先:当依赖中出现相同的资源时，层级越深,优先级越低,层级越浅，优先级越高
        声明优先:当资源在相同层级被依赖时，配置顺序靠前的覆盖配置顺序靠后的
        ●特殊优先:当同级配置了相同资源的不同版本，后配置的覆盖先配置的

        4.可选依赖
        <optional>true</optional>:隐藏依赖,让别人看不见我使用的依赖

        4.排除依赖 隐藏当前资源对应的依赖关系
        <dependencies>
            <dependency>
              <!--排除依赖 隐藏当前资源对应的依赖关系-->
              <exclusions>
                <exclusion>
                  <groupId>log4j</groupId>
                  <artifactId>log4j</artifactId>
                </exclusion>
              </exclusions>

            </dependency>
         </dependencies>
     */
}
