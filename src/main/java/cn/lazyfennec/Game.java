package cn.lazyfennec;

import cn.lazyfennec.frame.MainFrame;
import cn.lazyfennec.utils.ConfigUtils;

import javax.swing.*;

/**
 * @description:
 * @author: dengxiamin
 * @time: 2023/8/31 16:22
 */
public class Game {

    /**
     * 主窗口
     */
    private MainFrame mainFrame;

    /**
     * 单例模式实现
     *
     * @return
     */
    public MainFrame getMainFrame() {
        if (mainFrame == null) {
            initMainFrame();
        }
        return mainFrame;
    }

    /**
     * 初始化
     */
    public void initMainFrame() {
        mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 设置关闭窗口默认的操作
        mainFrame.setIconImage(ConfigUtils.getConfig().getImageIcon()); // 设置图标
        mainFrame.setTitle(ConfigUtils.getConfig().getTitle());
        mainFrame.setSize(ConfigUtils.getConfig().getSize()); // 设置窗口大小
        mainFrame.setLocationRelativeTo(null); // 设置居中

    }

    /**
     * 开始
     */
    public void start() {
        getMainFrame().setVisible(true);
    }

    /**
     * 退出
     */
    public void exit() {

    }

}
