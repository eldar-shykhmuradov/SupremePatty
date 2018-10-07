package com.supremepatty.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupremePattyApplicationTests {

    @Test
    public void contextLoads() {
        final ConfigurableApplicationContext run = SpringApplication.run(SupremePattyApplication.class);
        Assert.notNull(run, "Null");
    }

}
