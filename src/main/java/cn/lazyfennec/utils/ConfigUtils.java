package cn.lazyfennec.utils;

import cn.lazyfennec.config.Config;
import org.yaml.snakeyaml.Yaml;

/**
 * @description:
 * @author: dengxiamin
 * @time: 2023/8/31 16:32
 */
public class ConfigUtils {

    /**
     * 配置信息对象
     */
    private static Config config;

    /**
     * 初始化配置信息对象
     */
    private static void initConfig() {
        Yaml yaml = new Yaml();
        config = yaml.loadAs(ConfigUtils.class.getClassLoader().getResourceAsStream("config.yml"), Config.class);
    }

    /**
     * 获取配置信息对象，单例模式
     *
     * @return
     */
    public static Config getConfig() {
        if (null == config) {
            initConfig();
        }
        return config;
    }

    /**
     * 更新配置
     * TODO 写入配置文件
     */
    public static void updateConfig() {

    }

}
