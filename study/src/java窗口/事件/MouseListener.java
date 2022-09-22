package java窗口.事件;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class MouseListener extends JFrame implements java.awt.event.MouseListener {

    //创建按钮对象
    JButton jtb = new JButton("点我");
    //创建按钮对象
    JButton jtb1 = new JButton("点我");

    MouseListener() {
        this.setSize(603, 608);
        this.setTitle("鼠标事件");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);


        //设置宽高
        jtb.setBounds(0, 0, 100, 50);
        //给按钮添加动作监听
        jtb.addMouseListener(this);
        //把按钮添加到界面中
        this.getContentPane().add(jtb);

        this.setVisible(true);
    }






    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("安下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
