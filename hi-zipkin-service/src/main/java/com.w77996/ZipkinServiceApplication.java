package com.w77996;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @program: hi-parent
 * @description: zipkin链路
 * @author: w77996
 * @create: 2018-08-16 11:14
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ZipkinServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServiceApplication.class, args);
    }
}