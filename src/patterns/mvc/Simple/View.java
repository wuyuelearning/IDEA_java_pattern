package patterns.mvc.Simple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by wuyue on 2018/12/29.
 */
public class View extends JFrame implements Model.OnStateChangeListener {
    private final JButton mBtnLoad =new JButton("Load");
    private final JButton mBtnClear =new JButton("Clear");
    private final JLabel mLabelImage =new JLabel();

    @Override
    public void onStateChanged(Image image) {
        if (null ==  image){
            mLabelImage.setIcon(new ImageIcon());
        } else {
            mLabelImage.setIcon(new ImageIcon(image));
        }
    }

    public void addLoadListener(ActionListener listener){
        mBtnLoad.addActionListener(listener);
    }

    public void addClearListener(ActionListener listener){
        mBtnClear.addActionListener(listener);
    }

    public View(Model model){
        mLabelImage.setIcon(new ImageIcon(model.getImage()));

        JPanel rootPanel =new JPanel();
        rootPanel.setLayout(new BorderLayout());
        rootPanel.add(mLabelImage,BorderLayout.CENTER);


        JPanel btnPanel =new JPanel();
        btnPanel.setLayout(new FlowLayout());
        btnPanel.add(mBtnLoad);
        btnPanel.add(mBtnClear);

        rootPanel.add(btnPanel,BorderLayout.SOUTH);

        setContentPane(rootPanel);
        pack();
        setTitle("MVC");
        setVisible(true);
    }
}
