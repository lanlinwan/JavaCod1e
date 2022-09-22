package java窗口;

import javax.swing.*;

public class main extends JFrame {

    //游戏窗口
    public main() {
        //初始化页面
        initJFrame();
        //初始化菜单
        initJMenuBar();

        //初始化图片
        initImage();

        //界面显示
        this.setVisible(true);
    }


    //初始化图片
    //根据二维数组中的数据添加图片
    private void initImage() {
        //创建一个图片ImageIcon 对象放入 创建的JLabel 对象(管理容器)
        JLabel jLabel = new JLabel(new ImageIcon("D:\\JavaCode\\study\\thumb\\img1\\1.jpg"));
        //指定位置
        jLabel.setBounds(105 , 105 , 105, 105);
        //把管理容器添加到界面中
        this.getContentPane().add(jLabel);
        //添加一次后 自增 表示添加下一张图片
    }

    private void initJMenuBar() {
        //初始化菜单
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面两个选项的对象(功能,关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建(功能,关于我们)选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重写游戏");
        JMenuItem reLoginItem = new JMenuItem("重写登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //将选项条目添加到选项对象中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //将菜单选项添加到 菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个页面配置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置宽高
        this.setSize(603, 608);
        //设置界面标题
        this.setTitle("拼图单机版 V.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认居中,取消后才会根据 X,Y 坐标添加组件
        this.setLayout(null);
    }
}

