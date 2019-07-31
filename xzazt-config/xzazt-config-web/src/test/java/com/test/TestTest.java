package com.test;

import com.xzazt.Application;
import com.xzazt.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class TestTest {

    @Autowired
    private TestService testService;

    @Test
    public void doOne(){
        testService.doTest();
    }
}
