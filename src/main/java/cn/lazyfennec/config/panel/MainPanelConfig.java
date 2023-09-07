package cn.lazyfennec.config.panel;

import cn.lazyfennec.config.Bounds;
import cn.lazyfennec.config.Size;
import lombok.Data;

/**
 * @description:
 * @author: dengxiamin
 * @time: 2023/9/7 14:28
 */
@Data
public class MainPanelConfig {

    /**
     * 主面板尺寸
     */
    private Size size;

    /**
     * 设置边界
     */
    private Bounds bounds;

}
