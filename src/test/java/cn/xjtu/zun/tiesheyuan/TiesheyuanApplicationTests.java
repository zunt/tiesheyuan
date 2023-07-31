package cn.xjtu.zun.tiesheyuan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = TiesheyuanApplication.class)
class TiesheyuanApplicationTests implements ApplicationContextAware {

    private ApplicationContext appContext;

    @Test
    void contextLoads() {
        System.out.println(this.appContext);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.appContext = applicationContext;
    }
}
