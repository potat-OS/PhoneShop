package com.op;

import com.op.config.SpringConfig;
import com.op.config.SpringMybatisConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, SpringMybatisConfig.class})
public class test {
}
