package cn.lazyfennec.config;

import cn.lazyfennec.config.panel.MainPanelConfig;
import cn.lazyfennec.config.panel.PreviewPanelConfig;
import lombok.Data;

import javax.swing.*;
import java.awt.*;

/**
 * @description:
 * @author: dengxiamin
 * @time: 2023/9/6 17:31
 */
@Data
public class Config {

    /**
     * 标题
     */
    private String title;

    /**
     * 主窗口尺寸
     */
    private Size size;

    /**
     * 图片路径
     */
    private String imageIconPath;

    /**
     * 获取图标图片文件
     *
     * @return
     */
    public Image getImageIcon() {
        return new ImageIcon(imageIconPath).getImage();
    }

    /**
     * 主要面板参数
     */
    private MainPanelConfig mainPanel;

    /**
     *
     */
    private PreviewPanelConfig previewPanel;

}
