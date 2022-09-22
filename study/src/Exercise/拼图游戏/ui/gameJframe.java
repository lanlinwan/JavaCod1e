package Exercise.拼图游戏.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class gameJframe extends JFrame implements KeyListener, ActionListener {
    //二维数组管理数据
    //加载图片时 根据其中的数据进行加载
    int[][] data = new int[4][4];
    //记录空白方块 位置
    int x = 0;
    int y = 0;
    //记录当前展示图片位置
    String path1 = "study\\thumb\\img1\\";
    String path2 = "study\\thumb\\img2\\";
    String path3 = "study\\thumb\\img3\\";

    //定义一个数组 存储正确的数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    //创建(功能,关于我们)选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重写游戏");
    JMenuItem reLoginItem = new JMenuItem("重写登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenu ReplacePicture=new JMenu("更换图片");

    JMenuItem belle=new JMenuItem("美女");
    JMenuItem animal=new JMenuItem("动物");
    JMenuItem sport=new JMenuItem("运动");


    JMenuItem accountItem = new JMenuItem("打赏");
    //步数
    int step = 0;

    //游戏窗口
    public gameJframe() {
        //初始化页面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initData();

        //初始化图片
        initImage(path1);

        //界面显示
        this.setVisible(true);
    }


    //初始化数据
    private void initData() {
        //1.定义一个一维数组 表示放入的图片
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //2.打乱顺序
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取随机索引
            int index = r.nextInt(tempArr.length);
            //遍历的每一个数据与随机索引上的数据交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        //4.给二维数组添加数据
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {//记录空白图片的 x/y值
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }


    //初始化图片
    //根据二维数组中的数据添加图片(先添加的图片在上方,后加载的图片在下面)
    private void initImage(String path) {
        //清空原本已经出现的所有图片
        // (二维数组中的数据更新后删除所有图片,拿更新后的数据重新加载图片)
        this.getContentPane().removeAll();

        if (victory()) {
            //显示胜利
            JLabel win = new JLabel(new ImageIcon( "study\\thumb\\img1\\win.jpeg"));
            win.setBounds(203, 283, 197, 73);
            this.getContentPane().add(win);
        }
        //步数
        JLabel stepCount = new JLabel("步数" + step);
        stepCount.setBounds(50, 10, 100, 20);
        this.getContentPane().add(stepCount);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取当前要添加图片的序号
                int num = data[i][j];
                //创建一个图片ImageIcon 对象放入 创建的JLabel 对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                //指定位置
                jLabel.setBounds(105 * j + 83, 105 * i + 100, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
                //把管理容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }
        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("study\\thumb\\img1\\bork.png"));
        background.setBounds(40, 10, 508, 560);
        //把背景图片添加到界面中
        this.getContentPane().add(background);

        //刷新一下界面
        this.getContentPane().repaint();

    }

    //初始化菜单
    private void initJMenuBar() {
        //初始化菜单
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面两个选项的对象(功能,关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");




        //给条目添加事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        belle.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);


        //将选项条目添加到选项对象中
        functionJMenu.add(ReplacePicture);

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        ReplacePicture.add(animal);
        ReplacePicture.add(sport);
        ReplacePicture.add(belle);


        aboutJMenu.add(accountItem);

        //将菜单选项添加到 菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个页面配置菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化页面
    private void initJFrame() {
        //设置宽高
        this.setSize(620, 630);
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
        this.addKeyListener(this);

    }

    //判断是否 胜利
    public boolean victory() {
        for (int i = data.length - 1; i >= 0; i--) {
            for (int j = data.length - 1; j >= 0; j--) {
                if (data[i][j] != win[i][j]) {
                    //只要有一个数据不一样,返回false
                    return false;
                }
            }
        }
        return true;
    }

    //显示完整图片
    private void full(String path) {
        //把界面所有图片删除
        this.getContentPane().removeAll();
        //加载完整图片
        JLabel all = new JLabel(new ImageIcon(path + "full.jpg"));
        all.setBounds(83, 105, 420, 420);
        //把完整图片添加到界面中
        this.getContentPane().add(all);
        //加载背景图片
        JLabel background = new JLabel(new ImageIcon("study\\thumb\\img1\\bork.png"));
        background.setBounds(40, 10, 508, 560);
        //把背景图片添加到界面中
        this.getContentPane().add(background);
        //刷新页面
        this.getContentPane().repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松
    @Override
    public void keyPressed(KeyEvent e) {
        //如果胜利,此方法应该直接结束
        if (victory()) {
            return;
        }

        int code = e.getKeyCode();
        if (code == 65) {
          full(path1);
        }
    }



    //按下
    @Override
    public void keyReleased(KeyEvent e) {
        //如果胜利,此方法应该直接结束
        if (victory()) {
            return;
        }

        //按下后: 空白方块 与 移动的方块交换位置,
        int code = e.getKeyCode();
        if (code == 37) {
            //图片向左移动,空白向右移动
            System.out.println("左");
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            //移动一次步数增加
            step++;
            initImage(path1);
        } else if (code == 38) {
            System.out.println("上");
            if (x == 3) {
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage(path1);
        } else if (code == 39) {
            System.out.println("右");
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage(path1);
        } else if (code == 40) {
            System.out.println("下");
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage(path1);
        } else if (code == 65) {
            initImage(path1);
        } else if (code == 87) {
            data = win;
            initImage(path1);
        }
    }

    //鼠标点击
    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被点击的条目
        Object obj = e.getSource();
        //判断
        if (obj == replayItem) {
            System.out.println("重新游戏");
            //步数清零
            step=0;
            //重新加载二维数组的数据
            initData();
            //重新加载图片
            initImage(path1);
        } else if (obj == reLoginItem) {
            System.out.println("重新登陆");
            //关闭游戏界面
            this.setVisible(false);
            //打开登录界面
            new loginJframe();
        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            //直接关闭虚拟机
            System.exit(0);
        } else if (obj == accountItem) {
            System.out.println("打赏");
            //创建一个弹窗对象
            JDialog jDialog=new JDialog();
            //管理图片容器对象
            JLabel jLabel=new JLabel(new ImageIcon(path1+"wx.jpg"));
            //设置位置宽高
            jLabel.setBounds(0,0,258,258);
            //把图片添加到弹窗中
            jDialog.getContentPane().add(jLabel);
            //给弹窗设置大小
            jDialog.setSize(344,344);
            //弹窗顶置
            jDialog.setAlwaysOnTop(true);
            //弹窗居中
            jDialog.setLocationRelativeTo(null);
            //弹窗不关闭无法操作下面的界面
            jDialog.setModal(true);
            //弹窗显示出来
            jDialog.setVisible(true);
        }else if (obj==belle){
            System.out.println("切换美女图片");
            Random r = new Random();
            int rr=r.nextInt(2);
            System.out.println(rr);
           if (rr==0){
               path1=path2;
           }else if(rr==1){
               path1=path3;
           }


            initData();
            initImage(path1);

        }else if (obj==animal){
            System.out.println("切换动物图片");
        }else if (obj==sport){
            System.out.println("切换运动图片");
        }
    }
}





