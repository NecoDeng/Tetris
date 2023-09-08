package cn.lazyfennec.components;

import cn.lazyfennec.utils.ConfigUtils;

import javax.swing.*;
import java.awt.*;

/**
 * @description: 下一个方块预览
 * @author: dengxiamin
 * @time: 2023/9/8 14:28
 */
public class PreviewPanel extends JPanel {

    /**
     * 预览面板，单例
     */
    private static PreviewPanel previewPanel;

    /**
     * 初始化
     */
    public void init() {
        setBounds(ConfigUtils.getConfig().getPreviewPanel().getBounds());
        setBackground(Color.GRAY);
        setLayout(new GridLayout(4, 4,1, 1));
        for (int i = 0; i < 16; i++) {
            JPanel panel = new JPanel();
            panel.setSize(40, 40);
            add(panel);
        }
    }

    /**
     * 获取单例
     *
     * @return
     */
    public static PreviewPanel getSingleton() {
        if (null == previewPanel) {
            previewPanel = new PreviewPanel();
            previewPanel.init();
        }
        return previewPanel;
    }

}
