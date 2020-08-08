package com.mybatisplus.demo.mybatisplus.codegenerator;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.mybatisplus.demo.base.BaseEntity;
import com.mybatisplus.demo.base.BaseService;
import com.mybatisplus.demo.base.BaseServiceImpl;

/**
 * MybatisPlus代码生成器
 */
public class MybatisPlusCodeGenerator {

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://192.168.238.151:33006/test?useSSL=false&useUnicode=true&allowPublicKeyRetrieval=true&characterEncoding=utf8";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("123456")
                .setDriverName("com.mysql.jdbc.Driver");

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)
                .setEntityLombokModel(true)
                .setLogicDeleteFieldName("deleted")
                .setSuperMapperClass("com.mybatisplus.demo.base.MyBaseMapper")
                .setSuperServiceClass(BaseService.class)
                .setSuperServiceImplClass(BaseServiceImpl.class)
                .setSuperEntityClass(BaseEntity.class)
                // 父Entity的公共字段名，指定后再生成子Entity时不会生成这些字段的属性
                .setSuperEntityColumns("create_time", "update_time", "deleted")
//                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel);

        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(false)
                .setEnableCache(false)
                .setAuthor("Webb Dong")
                //指定输出文件夹位置
                .setOutputDir("D:\\develop\\workspace\\java\\demos\\codegenerator")
                .setFileOverride(true)
                .setServiceName("%sService")
                .setIdType(IdType.ASSIGN_ID);

        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.mybatisplus.demo")
                .setController("web.controller")
                .setEntity("model.domain")
                .setMapper("mapper")
                .setService("service")
                .setServiceImpl("service.impl");

        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setEntity("codetemplate/entity.java");

        new AutoGenerator()
                .setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                .setTemplate(templateConfig)
                .execute();
    }

}
