package 高级;

public class 生命周期 {
    //生命周期
    //clean:移除上一次构建生成的文件(单独一个clean生命周期)

    //compile:编译项目源代码
    //test:使用合适的单元测试框架运行测试(junit)
    //package:将编译后的文件打包，如: jar、war等
    //install:安装项目到本地仓库

    //命令行: mvn clean
    //       mvn compile



    //注意事项
    //●在同一套生命周期中,当运行后面的阶段时，前面的阶段都会运行。
    //●生命周期由对应的Maven插件执行
}
