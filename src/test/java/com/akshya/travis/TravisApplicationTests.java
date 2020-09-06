package com.akshya.travis;

import com.akshya.travis.controller.TravisController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TravisApplicationTests {

    @Autowired
    private TravisController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }


}
