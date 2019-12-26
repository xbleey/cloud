package com.xbleey.cloudproviderdept8001;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 11580
 */

@EnableEurekaServer
//@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderDept8001Application {


    public static void main(String[] args) {
        SpringApplication.run(CloudProviderDept8001Application.class, args);
    }


}
