package 高级;

public class 通过测试 {
    //跳过测试
    //●跳过测试
    //mvn指令-D skipTests
    //●范例:
    //mvn install -D skipTests

    //跳过测试
    //●细粒度控制跳过测试
    //<plugin>
    //      <artifactId>maven-surefire-plugin< / artifactId>
    //      <version>2.22.1< /version>
    //  <configuration>
    //     <skipTests>true</skipTests><!--设置跳过测试-->
    //     <includes> <!-- 包含指定的测试用例-->
    //       < include>** /User*Test. java</ include>
    //     </includes>
    //     <excludes><!--排除指定的测试用例-->
    //       <exclude>** /User*TestCase. java< / exc lude>
    //     </excludes>
    //  </configuration>
    //</plugin>
}
