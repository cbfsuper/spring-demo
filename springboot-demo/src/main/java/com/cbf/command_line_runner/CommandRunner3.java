package com.cbf.command_line_runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author yingge
 * @Date 2022/9/15 14:24
 */
@Slf4j
@Component
@Order(1)
public class CommandRunner3 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("this is CommandRunner3");
        Arrays.stream(args).forEach(System.out::println);
    }
}
