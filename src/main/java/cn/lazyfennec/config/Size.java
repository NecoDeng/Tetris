package cn.lazyfennec.config;

import lombok.Data;

import java.awt.*;

/**
 * @description:
 * @author: dengxiamin
 * @time: 2023/9/6 17:32
 */
@Data
public class Size extends Dimension {

    /**
     * 宽度
     */
    private double width;

    /**
     * 高度
     */
    private double height;

}
