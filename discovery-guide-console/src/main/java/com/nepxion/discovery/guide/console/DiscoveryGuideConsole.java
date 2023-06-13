package com.nepxion.discovery.guide.console;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 *
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryGuideConsole {
    /**
     * http://localhost:6001/swagger-ui.html
     */
    public static void main(String[] args) {
        // 设置discovery-desktop中的登录用户，设置到Environment
        System.setProperty("admin", "admin");

        new SpringApplicationBuilder(DiscoveryGuideConsole.class).run(args);
    }
}