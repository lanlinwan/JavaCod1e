package 前端.Nginx;

public class nginx {
    /*
        nginx:  HTTP和反向代理web服务器
        nginx反向代理，就是将前端发送的动态请求由nginx转发到后端服务器

        前端.Nginx (engine x)是一个高性能的HTTP和反向代理web服务器， 同时也提供了IMAP/POP3/SMTP服务。
        Nginx是由伊戈尔:赛索耶夫为俄罗斯访问量第二的Rambler.ru站点 (俄文: Pam6nep) 开发的，
        公开版本1.19.6发布于2020年12月15日。其将源代码以类BSD许可证的形式发布，
        因它的稳定性、丰富的功能集、简单的配置文件和低系统资源的消耗而闻名。
        2022年01月25日，nginx 1.21.6发布。

        Nginx是一款轻量级的Web 服务器/反向代理服务器及电子邮件(IMAP/POP3) 代理服务器，
        在BSD-like 协议下发行。其特点是占有内存少，并发能力强,事实上nginx的并发能力在同类型的网页服务器中表现较好。


        nginx反向代理的好处:
        ●提高访问速度
        ●进行负载均衡
        ●保证后端服务安全

        所谓负载均衡,就是把大量的请求按照我们指定的方式均衡的分配给集群中的每台服务器


    ■nginx反向代理的配置方式: nginx.conf

    server{
        listen 80;
        server_ name localhost;

        location /api/{
            proxy_pass http://loqalhost:8080/admin/; #反向代理
        }
    }

浏览器: http://ocalhost/api/employee/login -> NGINX -> tomacat: http://localhost:8080/admin/employee/login

   ■nginx负载均衡的配置方式: nginx.conf

    upstream webservers{
        server 192.168.100.128:8080;
        server 192.168.100.129:8080;
    }
    server{
        listen 80;
        server_ name localhost;

        location/api/ {
             proxy_pass http://webservers/admin/; #负载均衡
        }
    }
    nginx负载均衡策略:
    名称         说明
    轮询        默认方式
    weight     权重方式，默认为1,权重越高，被分配的客户端请求就越多
    ip_hash    依据ip分配方式，这样每个访客可以固定访问一个后端服务
    least_conn 依据最少连接方式，把请求优先分配给连接数少的后端服务
    url_hash   依据url分配方式，这样相同的url会被分配到同一个后端服务
    fair       依据响应时间方式，响应时间短的服务将会被优先分配




     */
}
