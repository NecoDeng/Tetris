package cn.lazyfennec.frame;

import cn.lazyfennec.components.MainPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @description:
 * @author: dengxiamin
 * @time: 2023/8/31 16:08
 */
public class MainFrame extends JFrame {

    /**
     * 主要面板
     */
    private MainPanel mainPanel;

    /**
     * 初始化相关组件
     */
    public void initComponents() {
        if (null == mainPanel) mainPanel = new MainPanel();
        mainPanel.init();
        add(mainPanel, BorderLayout.CENTER);
    }

}
