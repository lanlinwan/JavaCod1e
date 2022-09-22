package java窗口.事件;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class KeyListener extends JFrame implements java.awt.event.KeyListener {
    JButton jtb = new JButton("点我");
    KeyListener(){
        this.setSize(603, 608);
        this.setTitle("键盘事件");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);


        //设置宽高
        jtb.setBounds(0, 0, 100, 50);
        //给按钮添加键盘监听
        jtb.addKeyListener(this);
        //把按钮添加到界面中
        this.getContentPane().add(jtb);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");
        //获取键盘上每个按键编号
        int code=e.getKeyCode();
        if(code==65){
            System.out.println("A");
        }else if(code==66){
            System.out.println("B");
        }
    }
}
