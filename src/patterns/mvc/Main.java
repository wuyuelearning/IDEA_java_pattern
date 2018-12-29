package patterns.mvc;

import com.sun.deploy.panel.JavaPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;

/**
 * Created by wuyue on 2018/12/29.
 *
 *  一般的写法
 */
public class Main {

    public static void main(String[] args){
        // 构造JFrame作为视图容器
        JFrame container =new JFrame();
        // 根布局
        JPanel root =new JPanel();
        root.setLayout(new BorderLayout());

        //图片布局
        JLabel label =new JLabel();
        setLabelImage(label);
        root.add(label,BorderLayout.CENTER);

        // 按钮布局
        JPanel btnLayout =new JavaPanel();
        btnLayout.setLayout(new FlowLayout());


        // 读取图片，设置事件监听
        JButton btnLaod = new JButton("Load");
        btnLaod.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelImage(label);
            }
        });
        btnLayout.add(btnLaod);

        //  删除图片 ，设置事件监听
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setIcon(new ImageIcon());
            }
        });
        btnLayout.add(btnClear);

        root.add(btnLayout,BorderLayout.SOUTH);

        // 根布局装载到视图容器
        container.setContentPane(root);
        container.pack();
        container.setTitle("MVC");
        container.setVisible(true);
    }

    /**
     *  设置label上显示的照片
     */
    private static void setLabelImage(JLabel label){
        try {
            Image image= ImageIO.read(new URL("http://pic.lvmama.com//uploads/pc/place2/2018-06-26/91d10b6e-4d75-4e6f-98d2-3f8997546f93.jpg"));
            label.setIcon(new ImageIcon(image));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
