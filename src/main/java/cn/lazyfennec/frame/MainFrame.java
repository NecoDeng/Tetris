package cn.lazyfennec.frame;

import cn.lazyfennec.components.MainPanel;
import cn.lazyfennec.components.PreviewPanel;

import javax.swing.*;

/**
 * @description: 主窗口
 * @author: dengxiamin
 * @time: 2023/8/31 16:08
 */
public class MainFrame extends JFrame {

    /**
     * 初始化相关组件
     */
    public void initComponents() {
        add(MainPanel.getSingleton());
        add(PreviewPanel.getSingleton());
    }

}
