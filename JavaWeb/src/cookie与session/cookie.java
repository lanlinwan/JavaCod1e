package cookie与session;

public class cookie {
    //Cookie基本使用
    //●Cookie: 客户端会话技术，将数据保存到客户端，以后每次请求都携带Cookie数据进行访问
    //●Cookie 基本使用
    //1. 创建Cookie对象,设置数据
    //Cookie cookie = new Cookie("key","value'");
    //2.发送Cookie到客户端: 使用response对象
    //response.addCookie(cookie);

    //获取cookie
    //1.获取cookie数组
    //   Cookie[] cookies=request.getCookies();
    //2.遍历数组
    //    for (Cookie cookie1 : cookies){
    //        String name=cookie1.getName();
    //        if("name".equals(name)){
    //            String value=cookie1.getValue();
    //            System.out.println(name+":"+value);
    //        }
    //    }

    //Cookie原理
    //●Cookie的实现是基于HTTP协议的
    //●响应头: set-cookie
    //●请求头: cookie

    //Cookie使用细节
    //●Cookie 存活时间.
    //➢默认情况下， Cookie存储在浏览器内存中，当浏览器关闭，内存释放,则Cookie被销毁
    //➢setMaxAge(int seconds):设置Cookie存活时间
    //1. 正数:将Cookie写入浏览器所在电脑的硬盘，持久化存储。到时间自动删除
    //2.负数: 默认值，Cookie在当前浏览器内存中，当浏览器关闭，则Cookie被销毁
    //3. 零:删除对应Cookie
    //●Cookie 存储中文
    //➢Cookie 不能直接存储中文
    //➢如需要存储， 则需要进行转码URL编码




}
