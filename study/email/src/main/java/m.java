import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class m {
    public static void main(String[] args) throws AddressException, MessagingException, UnsupportedEncodingException {

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
        //2903053386 mtkhcpxeiqjqdfbd
        props.put("mail.user", "2903053386@qq.com");
        // 此处填写16位STMP口令
        props.put("mail.password", "mtkhcpxeiqjqdfbd");

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
        //2903053386
        //812434053
        //2410268786
        InternetAddress to = new InternetAddress("2410268786@qq.com");
        message.setRecipient(MimeMessage.RecipientType.TO, to);

        // 设置邮件标题
        message.setSubject("标题");

        Date d4=new Date();
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str1=sdf2.format(d4);
        String str2="兰本友小保低必歪";
        String str3="蓝剑辉是不是再摸鱼";

        // 设置邮件的内容体
        message.setContent(str2, "text/html;charset=UTF-8");
        String imagePath="D:\\JavaCode\\study\\email\\src\\main\\java\\tp\\wallhaven-we31gx.png";
        DataSource fds = new FileDataSource(new File(imagePath));
        message.setDataHandler(new DataHandler(fds));
        message.setFileName(MimeUtility.encodeText(imagePath));


        // 最后当然就是发送邮件啦
        Transport.send(message);

        System.out.println("发送邮件成功");


    }

}
