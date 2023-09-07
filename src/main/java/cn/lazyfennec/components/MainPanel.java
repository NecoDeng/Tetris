package cn.lazyfennec.components;

import cn.lazyfennec.utils.ConfigUtils;

import javax.swing.*;
import java.awt.*;

/**
 * @description:
 * @author: dengxiamin
 * @time: 2023/9/7 14:13
 */
public class MainPanel extends JPanel {

    /**
     * 初始化
     */
    public void init() {
        setBackground(Color.BLUE);
        setSize(ConfigUtils.getConfig().getMainPanel().getSize());
    }

}
