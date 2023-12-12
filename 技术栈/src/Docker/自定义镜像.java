package Docker;

public class 自定义镜像 {
    /*
        镜像的结构是怎样的?
        ●镜像中包含了应用程序所需要的运行环境、函数库、配置、以及应用本身等各种文件,这些文件分层打包而成。.

        Dockerfile是做什么的?
        ●Dockerfile就 是利用固定的指令来描述镜像的结构和构建过程，这样Docker才可以依次来构建镜像
          #基础镜像
          FROM openjdk:11.0-jre- buster
          #设定时区
          ENV TZ=Asia/Shanghai
          RUN ln -snf /usr /share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
          #拷则jar包
          COPY hm- service.jar /app.jar
          #入口
          ENTRYPOINT ["java", "-jar", "/app.jar"]



        构建镜像的命令是什么?
        ●docker build -t 镜像名 Dockerfile 目录

     */
}
