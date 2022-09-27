package javabasic.n_common_API;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class $3_RuntimeCMDDemo extends JFrame implements MouseListener {
    
    // 创建帅爆了按钮
    JButton jButton1 = new JButton("帅爆了");
    // 创建一般般按钮
    JButton jButton2 = new JButton("一般般把");
    // 创建不帅按钮
    JButton jButton3 = new JButton("不帅");
    // 创建求饶按钮
    JButton jButton4 = new JButton("爸爸饶了我吧");
    // 获取Runtime对象
    Runtime runTime = Runtime.getRuntime();
    
    // 定义参数决定是否显示上方按钮
    boolean flag = false;
    public $3_RuntimeCMDDemo() {
        initJFrame();
    }
    
    // 定义方法, 界面初始化
    public void initJFrame () {
        // 设置界面宽高和是否显示
        this.setSize(500, 500);
        // 设置界面标题
        this.setTitle("拼图单机版 v1.0");
        // 设置界面置顶 ==> 让窗口一直显示在其他应用上层
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式, 关闭界面后结束程序
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消系统默认的居中放置设置, 只有取消该设置, 才会按照自己设置的方式放置组件
        this.setLayout(null);
        // 给按钮绑定动作事件
        this.jButton1.addMouseListener(this);
        this.jButton2.addMouseListener(this);
        this.jButton3.addMouseListener(this);
        this.jButton4.addMouseListener(this);
        this.initButtonLayout();
        this.setVisible(true);
    }
    
    // 按钮摆放初始化
    public void initButtonLayout () {
        // 清除组件
        this.getContentPane().removeAll();
        JLabel textJLabel = new JLabel("你点一下试试！！");
        textJLabel.setSize(350, 50);
        textJLabel.setFont(new Font("微软雅黑", Font.ITALIC, 30));
        textJLabel.setBounds(125, 125, 250, 100);
        this.getContentPane().add(textJLabel);
        // 设置按钮位置
        this.jButton1.setSize(90, 30);
        this.jButton1.setBounds(205, 240, 90, 30);
        this.getContentPane().add(this.jButton1);
    
        this.jButton2.setSize(120, 30);
        this.jButton2.setBounds(190, 290, 120, 30);
        this.getContentPane().add(this.jButton2);
    
        this.jButton3.setSize(150, 30);
        this.jButton3.setBounds(175, 340, 150, 30);
        this.getContentPane().add(this.jButton3);
        if (flag) {
            this.jButton4.setSize(150, 30);
            this.jButton4.setFont(new Font("微软雅黑", Font.ITALIC, 15));
            this.jButton4.setBounds(175, 50, 150, 30);
            this.getContentPane().add(this.jButton4);
        }
        // 刷新组件
        this.getContentPane().repaint();
    }
    
    public static void main(String[] args) throws Exception{
        new $3_RuntimeCMDDemo();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.jButton1) {
            // 设置1分钟后关机
            try {
                this.runTime.exec("shutdown -s");
            } catch (Exception err) {
                err.printStackTrace();
            }
            this.flag = true;
            initButtonLayout();
        } else if (e.getSource() == this.jButton2) {
            // 设置一小时后关机
            try {
                this.runTime.exec("shutdown -s -t 3600");
            } catch (Exception err) {
                err.printStackTrace();
            }
            this.flag = true;
            initButtonLayout();
        } else if (e.getSource() == this.jButton4) {
            // 取消关机操作
            try {
                this.runTime.exec("shutdown -a");
            } catch (Exception err) {
                err.printStackTrace();
            }
            this.flag = false;
            initButtonLayout();
        } else if (e.getSource() == this.jButton3) {
            this.jButton3.setText("你挺有自知之名嘛");
        }
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == this.jButton3) {
            this.jButton3.setText("不帅");
        }
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
    
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
    
    }
}
