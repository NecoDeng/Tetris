package cn.lazyfennec.config;

import lombok.Data;
import org.yaml.snakeyaml.Yaml;

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
    private MainFrameSize size;

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

}
