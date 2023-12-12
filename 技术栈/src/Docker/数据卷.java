package Docker;

public class 数据卷 {
    /*
      什么是数据卷?
    ●数据卷是一个虚拟目录， 它将宿主机目录映射到容器内目录,方便我们操作容器内文件,或者方便迁移容器产生的数据

     如何挂载数据卷?
    ●在创建容器docker run 时, 利用-V数据卷名:容器内目录完成挂载
    ●容器创建时,如果发现挂载的数据卷不存在时，会自动创建

     数据卷的常见命令有哪些?
    ●docker volume ls:查看数据卷
    ●docker volume rm:删除数据卷
    ●docker volume inspect:查看数据卷详情
    ●docker volume prune:删除未使用的数据卷

    ●在执行docker run命令时，使用-v本地目录:容器内目录可以完成本地目录挂载
    ●本地目录必须以"I”或"./"开头，如果直接以名称开头,会被识别为数据卷而非本地目录
     -V mysql : /var/lib/mysql 会被识别为一-个数据卷叫mysql
     -v ./mysql : /var/ib/mysql 会被识别为当前目录下的mysql目录


  docker run -d --name mysql -p 3306:3306 -e TZ=Asia/Shanghai -e MYSQL_ROOT_PASSWORD=123 -v /root/mysql/data:/var/lib/mysql -v /root/mysql/init:/docker-entrypoint-initdb.d -v /root/mysql/conf:/etc/mysql/conf.d mysql



     */
}
