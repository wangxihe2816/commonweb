package com.module;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.Properties;


//mybatis 分页插件 参数配置
@Configuration
public class PageHelperConfig {
    @Bean
    public PageHelper getPageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }


    /**
     * 显示springboot项目启动访问地址
     *
     * @return
     */
    public static void showStartInfo() {
        try {
            //加载属性文件，读取数据库连接配置信息
            Properties pro = new Properties();
            try {
                pro.load(PageHelperConfig.class.getResourceAsStream("/application.properties"));
                String server_port = pro.getProperty("server.port");
                String context_path = pro.getProperty("server.servlet.context-path");
                String url = "http://localhost:" + server_port + context_path;
                System.out.println("建议使用谷歌浏览器，点击后面的地址访问程序 = " + url);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("未找到配置文件！！！" + e.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
