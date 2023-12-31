package cn.xjtu.zun.tiesheyuan.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReverseSQL {
    public void generator() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        // 指定配置文件
        File configFile = new File("D:/JavaProjects/tiesheyuan/src/main/resources/configs/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String args[]) {
        // TODO Auto-generated method stub
        try {
            ReverseSQL reverse = new ReverseSQL();
            reverse.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("reverse finished");
    }
}
