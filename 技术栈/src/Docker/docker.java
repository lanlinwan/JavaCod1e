package Docker;

public class docker {
    /*

        镜像和容器
        当我们利用Docker安装应用时，Docker会 自动搜索并下载应用镜像(image)。镜像不仅包含应用本身，还包含应用
        运行所需要的环境、配置、系统函数库。Docker会在运行镜像时创建一个隔 离环境，称为容器(container) 。

        镜像仓库:存储和管理镜像的平台，Docker官方维护了--个公共仓库: DockerHub。

        docker run -d \
        --name mysql \
        -p 3306 :3306 \
        -e TZ=Asia/Shanghai \
        -e MYSQL_ ROOT_ PASSWORD= 123 \
        mysql

        docker run: 创建并运行一个容器, -d是让容器在后台运行
        --name mysql: 给容器起一个名字,必须唯一
        -p 3306:3306: 设置端口映射,前面的端口是自己系统的可以改,后面那个是服务的不能改
        -e KEY=VALUE :是设置环境变量
        mysql :指定运行的镜像的名字

        镜像命名规范:  mysql:5.7
        ●镜像名称一般分两部分组成: [repository]:[tag]。
        ●其中repository就是镜像名
        ●tag是镜像的版本
        ●在没有指定tag时，默认是latest,代表最新版本的镜像
\

       docker inspect



     */
}
