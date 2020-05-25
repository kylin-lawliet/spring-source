package com.blackcat.import1.importselect;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * <p> 描述 ：通过@Import 的ImportSeletor类实现组件的导入
 *      导入组件的id为全类名路径
 * @author : blackcat
 * @date : 2020/5/25 16:10
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.blackcat.import1.compent.Dog"};
    }
}
