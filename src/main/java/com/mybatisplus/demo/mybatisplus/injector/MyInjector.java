package com.mybatisplus.demo.mybatisplus.injector;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.mybatisplus.demo.mybatisplus.method.GetByIdIgnoreLogicDeletedMethod;

import java.util.List;

/**
 * 自定义Base方法SQL注入器，必须继承DefaultSqlInjector，否则DefaultSqlInjector中的Base方法将会失效
 */
public class MyInjector extends DefaultSqlInjector {

    @Override
    public List<AbstractMethod> getMethodList(Class<?> mapperClass) {
        List<AbstractMethod> methodList = super.getMethodList(mapperClass);
        methodList.add(new GetByIdIgnoreLogicDeletedMethod());
        return methodList;
    }

}
