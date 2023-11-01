package cookie与session;

public class session {
    //
    //Session
    //●服务端会话跟踪技术:将数据保存到服务端
    //●JavaEE提供HttpSession接口， 来实现- -次会话的多次请求间数据共享功能
    //●使用:
    //1. 获取Session对象
    //HttpSession session = request.getSession();
    //2. Session对象功能:
    //➢void setAttribute(String name, Object o):存储数据到session域中
    //➢Object getAttribute(String name):根据key,获取值
    //void removeAttribute(String name):根据key,删除该键值对

    //Session使用细节
    //●Session 钝化、活化:
    //●服务器重启后， Session中的数据是否还在?
    //➢钝化: 在服务器正常关闭后，Tomcat会自动将 Session数据写入硬盘的文件中
    //➢活化:再次启动服务器后，从文件中加载数据到Session中
    //●Session 销毁:
    //默认情况下，无操作，30分钟自动销毁
    //<session-config>
    //<session-timeout>30</session-timeout>
    //</session-config>
    //➢调用 Session对象的invalidate()方法
}
