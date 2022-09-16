package com.$4_FaceObject.FaceDemo.$6_innerClass.$2_interClassAnonymous;

import javax.swing.*;

/*
    目标:通过GUI编程理解匿名内部类的真实使用场景
 */
public class Test3 {
    public static void main(String[] args) {
        // 1.创建窗口
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);
        
        // 2.创建按钮对象
        JButton btn = new JButton("登录");

//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win,"点我一下你试试~~");
//            }
//        });
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "别说话, 吻我"));
        // 3.把按钮对象添加到窗口上显示
        panel.add(btn);
        
        // 4.展示窗口
        win.setSize(400, 300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
