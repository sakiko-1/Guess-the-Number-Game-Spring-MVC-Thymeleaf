package org.game.conf;

/**
 * Author: Sakiko
 * Date: 4 December 2015
 * Copyrights: All rights reserved.
 * Description: Guess the Number game using Spring MVC, Thymeleaf
 * 				and Bootstrap.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("org.game.*")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
