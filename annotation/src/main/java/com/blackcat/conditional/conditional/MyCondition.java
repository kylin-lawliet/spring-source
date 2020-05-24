package com.blackcat.conditional.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * <p> 描述 ：自定义条件判断
 *
 * @author : blackcat
 * @date : 2020/5/24 14:05
 */
public class MyCondition  implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //判断容器中是否有MyAspect的组件
        if(conditionContext.getBeanFactory().containsBean("MyAspect")) {
            return true;
        }
        return false;
    }
}
