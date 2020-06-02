package com.may;

import javax.swing.*;

public class WindowsMain extends JFrame { //javax，有x代表java類別的後來的擴充。JFrame:視窗的外框
    public WindowsMain(){//建構子
        setSize(300,200);
 //JFrame的規則，如沒有設定大小，直接放Button就會佔滿全螢幕;所以先建一個Jpanel把Button放進去，再把Jpanel放到JFrame裡
        SnowCanvas canvas = new SnowCanvas();
        JPanel panel = new JPanel();//面板
        JButton button = new JButton("Hello");
        panel.add(button);
        add(canvas);//也可以將canvas、panel放進去,ex:SnowCanvas
        setVisible(true);//可不可見
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//設定預設關閉動作，關閉視窗。全大寫：常數（不會變的數）->可讀性增高
    }
    public static void main(String[] args) {
        new WindowsMain();
    }
}
