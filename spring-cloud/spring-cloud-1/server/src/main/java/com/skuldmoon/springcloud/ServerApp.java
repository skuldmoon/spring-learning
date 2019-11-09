package vip.vshome.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServerApp {

    public static void main(String[] args) {
        SpringApplication.run(vip.vshome.www.ServerApp.class, args);
    }

}
