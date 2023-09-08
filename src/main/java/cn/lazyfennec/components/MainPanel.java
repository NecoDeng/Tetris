package cn.lazyfennec.components;

import cn.lazyfennec.utils.ConfigUtils;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

/**
 * @description:
 * @author: dengxiamin
 * @time: 2023/9/7 14:13
 */
public class MainPanel extends JPanel {

    /**
     * 主面板，单例
     */
    private static MainPanel mainPanel;

    /**
     * 初始化
     */
    public void init() {
        setBorder(BorderFactory.createLineBorder(Color.black, 5));
        setBounds(ConfigUtils.getConfig().getMainPanel().getBounds());
        setBackground(Color.GRAY);
        
        setLayout(new GridLayout(20, 10, 1, 1));
        for (int i = 0; i < 200; i++) {
            JButton jButton = new JButton();
            add(jButton);
        }
    }

    /**
     * 获取单例
     *
     * @return
     */
    public static MainPanel getSingleton() {
        if (null == mainPanel) {
            mainPanel = new MainPanel();
            mainPanel.init();
        }
        return mainPanel;
    }

}
