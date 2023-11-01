package Maven;

public class 生命周期与插件 {
    /*
        插件
        ●插件与生命周期内的阶段绑定，在执行到对应生命周期时执行对应的插件功能
        ●默认maven在各个生命周期上绑定有预设的功能
        ●通过插件可以自定义其他功能
        <build>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-source-plugin</artifactId>
                    <version>2.2.1</version >
                    <executions>
                        <execution>
                            <goals>
                                <goal>jar</goal>
                            </goals>
                            <phase>generate-test-resources</phase>
                        </execution>
                    </executions>
                </plugin>
            </plugins>
        </build>

     */
}
