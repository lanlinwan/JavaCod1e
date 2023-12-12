package Docker;

public class 网络 {
    /*
        容器加入同一个网络中,可以直接通过 容器名访问

        创建网络
       docker network create  网络名
        容器加入网络
       docker network connect 网络名 容器名
        创建容器时 直接加入
       docker run -d --name 容器名 -p 8080:8080 --network 网络名 本地镜像名

     */
}
