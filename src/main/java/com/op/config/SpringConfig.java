package com.op.config;

import com.op.Mark;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Jue-PC
 */
@Configuration
@ComponentScan(basePackageClasses = {Mark.class},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class))
public class SpringConfig {

}
