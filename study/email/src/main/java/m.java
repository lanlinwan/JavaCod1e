import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class m {
    public static void main(String[] args) throws AddressException,MessagingException {

        // 创建Properties 类用于记录邮箱的一些属性
        Properties props = new Properties();
        // 表示SMTP发送邮件，必须进行身份验证
        props.put("mail.smtp.auth", "true");
        //此处填写SMTP服务器
        props.put("mail.smtp.host", "smtp.qq.com");
        //端口号，QQ邮箱端口587
        props.put("mail.smtp.port", "587");
        // 此处填写，写信人的账号
        //3199878472 xbhszdlomdrsdfbj
        //2903053386 khqxziwzddvtdgic
        props.put("mail.user", "2903053386@qq.com");
        // 此处填写16位STMP口令
        props.put("mail.password", "khqxziwzddvtdgic");

        // 构建授权信息，用于进行SMTP进行身份验证
        Authenticator authenticator = new Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                // 用户名、密码
                String userName = props.getProperty("mail.user");
                String password = props.getProperty("mail.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        // 使用环境属性和授权信息，创建邮件会话
        Session mailSession = Session.getInstance(props, authenticator);
        // 创建邮件消息
        MimeMessage message = new MimeMessage(mailSession);
        // 设置发件人
        InternetAddress form = new InternetAddress(props.getProperty("mail.user"));
        message.setFrom(form);


        // 设置收件人的邮箱
        //1579723416 郭雪龙
        //1823670311 邓修鹏
        InternetAddress to = new InternetAddress("3299878472@qq.com");
        message.setRecipient(MimeMessage.RecipientType.TO, to);

        // 设置邮件标题
        message.setSubject("标题");

        Date d4=new Date();
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str2=sdf2.format(d4);
        // 设置邮件的内容体

        message.setContent(str2, "text/html;charset=UTF-8");


        // 最后当然就是发送邮件啦
        Transport.send(message);


    }

}
