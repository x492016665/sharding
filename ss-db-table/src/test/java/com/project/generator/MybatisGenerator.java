package com.project.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MybatisGenerator {

    private static String baseOutPutDir = "/src/main/java";

    private static String author = "huangjg";

    private static DbType dbType = DbType.MYSQL;

    private static String dataSourceDriverName = "com.mysql.jdbc.Driver";

    private static String dataSourceUrl = "jdbc:mysql://127.0.0.1:3306/generator?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8";

    private static String dataSourceUserName = "root";

    private static String dataSourcePassword = "root";

    private static String basePackageName = "com.project.modular.task";

    private static String[] includeTable = { "code_relate" };

    private static String[] excludeTable = {};

    public static void main(String[] args) throws InterruptedException {
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + baseOutPutDir);
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        gc.setIdType(IdType.NONE); // 配合使用shardingSphere的主键生成功能
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(false);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setOpen(false);
        gc.setAuthor(author);
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("I%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(dbType);
        dsc.setDriverName(dataSourceDriverName);
        dsc.setUrl(dataSourceUrl);
        dsc.setUsername(dataSourceUserName);
        dsc.setPassword(dataSourcePassword);
        mpg.setDataSource(dsc);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(basePackageName);
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setXml("mapper.mapping");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setController("controller");
        mpg.setPackageInfo(pc);
        // 模板配置
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml("/templates/mapper.xml.vm");
        mpg.setTemplate(templateConfig);
        InjectionConfig injectionConfig = new InjectionConfig() {

            // 使用map进行自定义属性设置
            @Override
            public void initMap() {
                // Map<String, Object> map = new HashMap<>();
                // map.put("abc", this.getConfig().getGlobalConfig().getAuthor()
                // + "-mp");
                // this.setMap(map);
            }
        };
        // 配置自定义属性注入
        mpg.setCfg(injectionConfig);
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 此处可以修改为您的表前缀
        // strategy.setTablePrefix(new String[] { "tb_" });
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 需要生成的表
        strategy.setInclude(includeTable);
        // 排除生成的表
        strategy.setExclude(excludeTable);
        // 使用lombok
        strategy.setEntityLombokModel(true);
        mpg.setStrategy(strategy);
        // 执行生成
        mpg.execute();
    }
}
