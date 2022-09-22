package Exercise.拼图游戏.ui;

import javax.swing.*;
import Exercise.拼图游戏.verificationCode.verification;


//登录逻辑
public class loginJframe extends JFrame {
    //创建一个集合存储正确的用户名,密码
//    static ArrayList<>


    public loginJframe() {
        //初始化页面
        initJFrame();

        //初始化菜单
        initView();

        this.setVisible(true);
    }

    //初始化菜单
    private void initView() {
        //添加用户名文字
        JLabel usernameText=new JLabel(new ImageIcon(""));
        usernameText.setBounds(116,135,47,17);
        this.getContentPane().add(usernameText);
        //添加用户输入框
        JTextField username=new JTextField();
        username.setBounds(195,134,200,30);
        this.getContentPane().add(username);
        //添加密码文字
        JLabel passwordText=new JLabel(new ImageIcon(""));
        passwordText.setBounds(130,195,32,16);
        //添加密码输入框
        JTextField password=new JTextField();
        password.setBounds(195,195,200,30);
        this.getContentPane().add(password);
        //验证码提示
        JLabel codeText=new JLabel(new ImageIcon(""));
        codeText.setBounds(133,256,50,30);
        this.getContentPane().add(codeText);
        //验证码输入框
        JTextField code=new JTextField();
        code.setBounds(195,256,100,30);
        this.getContentPane().add(code);

        //随机验证码
        String codeStr=verification.VerificationCode(5);
        JLabel rightCode=new JLabel();
        //设置内容
        rightCode.setText(codeStr);
        rightCode.setBounds(300,256,50,30);
        this.getContentPane().add(rightCode);

        //5.登录按钮
        JButton login=new JButton();
        login.setBounds(123,310,128,47);
        login.setIcon(new ImageIcon(""));
        //去按钮边框
        login.setBorderPainted(false);
        //去除按钮背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        //6.添加注册按钮
        JButton register = new JButton() ;
        register.setBounds(256,310,128,47) ;
        register.setIcon (new ImageIcon("puzzlegame\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register .setBorderPainted(false) ;
        //去除按钮的背景
        register . setContentAreaFilled(false) ;
        this.getContentPane () .add(register) ;
        //7.添加背景图片
        JLabel background = new JLabel (new ImageIcon ("puzzlegame\\image\\login\\background.png"));

        background . setBounds(0, 0,470,390) ;
        this.getContentPane () . add (background) ;

    }

    //初始化页面
    private void initJFrame() {
        //设置宽高
        this.setSize(488, 430);
        //设置界面标题
        this.setTitle("拼图单机版 V.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中,取消后才会根据 X,Y 坐标添加组件
        this.setLayout(null);
        //给界面添加键盘监听事件
        //this.addKeyListener(this);

    }
    //密码错误弹窗
    public void showJDialog (String content) {
//创建一个弹框对象
        JDialog jDialog = new JDialog() ;
//给弹框设置大小
        jDialog. setSize (200,150) ;
//让弹框置顶
        jDialog. setAlwaysOnTop (true) ;
//让弹框居中
        jDialog. setLocationRelativeTo (null) ;
//弹框不关闭永远无法操作下面的界面
        jDialog. setModal (true) ;
//创建Jlabe1对象管理文字并添加到弹框当中
        JLabel warning =new JLabel (content) ;
        warning. setBounds(0, 0,200, 150) ;
        jDialog.getContentPane () .add (warning) ;
//让弹框展示出来
        jDialog. setVisible (true) ;
    }

}
