package java窗口.事件;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class ActionListener extends JFrame implements java.awt.event.ActionListener {
    //创建按钮对象
    JButton jtb = new JButton("点我");
    //创建按钮对象
    JButton jtb1 = new JButton("点我");

    ActionListener() {
        this.setSize(603, 608);
        this.setTitle("动作监听");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);


        //设置宽高
        jtb.setBounds(0, 0, 100, 50);
        //给按钮添加动作监听
        jtb.addActionListener(this);
        //把按钮添加到界面中
        this.getContentPane().add(jtb);


        jtb1.setBounds(500, 500, 100, 50);
        //给按钮添加动作监听
        jtb1.addActionListener(this);
        //把按钮添加到界面中
        this.getContentPane().add(jtb1);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object soure = e.getSource();
        if (soure == jtb) {
            jtb.setSize(200, 200);
        } else if (soure == jtb1) {
            Random r = new Random();
            jtb1.setLocation(r.nextInt(500), r.nextInt(500));
        }

    }
}
