package com.lin.design_pattern_lin_nan;

import com.lin.factoryMethod.ResourceLoader;
import com.lin.simpleFactory.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternLinNanApplicationTests {

    @Test
    void contextLoads() {
        String url = "https://www.bilibili.com/?spm_id_from=333.999.0.0";
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource load = resourceLoader.load(url);
        System.out.println(load);
    }

}
