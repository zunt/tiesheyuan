package cn.xjtu.zun.tiesheyuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
@MapperScan("cn.xjtu.zun.tiesheyuan.mapper")
public class TiesheyuanApplication{

    public static void main(String[] args) {
        SpringApplication.run(TiesheyuanApplication.class, args);
    }
}
