package com.dangdang.ddframe.job.lite.spring.job.parser.simple;

import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.spring.job.parser.common.AbstractJobBeanDefinitionParser;
import com.google.common.base.Strings;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import static com.dangdang.ddframe.job.lite.spring.job.parser.common.BaseJobBeanDefinitionParserTag.CLASS_ATTRIBUTE;
import static com.dangdang.ddframe.job.lite.spring.job.parser.common.BaseJobBeanDefinitionParserTag.JOB_REF_ATTRIBUTE;

/**
 * 简单作业的命名空间解析器.
 *
 * @author caohao
 */
public final class SimpleJobBeanDefinitionParser extends AbstractJobBeanDefinitionParser {

    @Override
    protected BeanDefinition getJobTypeConfigurationBeanDefinition(final ParserContext parserContext, final BeanDefinition jobCoreConfigurationBeanDefinition, final Element element) {
        BeanDefinitionBuilder result = BeanDefinitionBuilder.rootBeanDefinition(SimpleJobConfiguration.class);
        result.addConstructorArgValue(jobCoreConfigurationBeanDefinition);
        if (Strings.isNullOrEmpty(element.getAttribute(CLASS_ATTRIBUTE))) {
            result.addConstructorArgValue(parserContext.getRegistry().getBeanDefinition(element.getAttribute(JOB_REF_ATTRIBUTE)).getBeanClassName());
        } else {
            result.addConstructorArgValue(element.getAttribute(CLASS_ATTRIBUTE));
        }
        return result.getBeanDefinition();
    }
}
